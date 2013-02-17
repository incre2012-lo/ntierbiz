package com.paldaps.action.job;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.dbcp.BasicDataSource;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.xssf.eventusermodel.XLSX2CSV;
import org.springframework.util.StringUtils;
import org.xml.sax.SAXException;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.paldaps.system.core.util.SpringUtil;


public class ImportUtil {

	public static boolean unlock = true;
	private static DataSource dataSource = setupHibernateDataSource();
	
	public static void parseAndLoadExcel(File infile) throws IOException, OpenXML4JException, ParserConfigurationException, SAXException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd-HH-mm-ss");
	    String dateToday= dateFormat.format(new Date());
		File folder=new File(infile.getParentFile().getCanonicalPath()+File.separatorChar+"temp"+dateToday);
		folder.mkdir();
		XLSX2CSV xlsx2csv = new XLSX2CSV(infile);
		xlsx2csv.setTempFolder(folder);
		xlsx2csv.process();
		 makeDB(folder);
		// insertIntoTemp(csvfile.getCanonicalPath());
	}

	
//	public static DataSource setupDataSource(){
//        BasicDataSource ds = new BasicDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUsername("xcubefin");
//         ds.setPassword("xcubefin");
//		ds.setUrl("jdbc:mysql://localhost:3306/xcubefin");
//        ds.setValidationQuery("select 1 ");
//        ds.addConnectionProperty("autoReconnect", "true");;
//        return ds;
//   }

	public static DataSource setupHibernateDataSource(){
		return (DriverManagerDataSource)SpringUtil.getBean("dataSource");
	}
	public static Connection getConnection(){
        try {
        	return dataSource.getConnection();
        }
        catch (SQLException e){
        	System.out.println("Error in Data Connection  " + e.getMessage());
        	return null;
        }
	}
	
	public static void dropTempTable(Map<String, Integer> linkedHashMap){
		 Connection conn = null;
		  Statement stmt = null;
		  try {			
			  conn=dataSource.getConnection();
			  stmt = conn.createStatement();
			  DatabaseMetaData dbm = conn.getMetaData();
			// check if "temp" table is there
			ResultSet tables = dbm.getTables(null, null, "temp", null);			
			if (tables.next()) {
				String sql = "DROP TABLE temp";
				stmt.executeUpdate(sql);
			}
			String sql="Create Table temp ( ";
	        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
	        	String key = entry.getKey();
	        	sql+=key+" varchar(255) , ";
	        }
	        sql+="label varchar(255) )";
	        stmt = conn.createStatement();			 
	        stmt.executeUpdate(sql);
	        System.out.println(sql);
		  } catch (Exception e) {
				System.out.println(e.getMessage());
			}finally{
				if(stmt!=null)
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				if(conn!=null)
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
	}
	
	
	
	public static void createAndLoadTempTable(Map<String, Integer> linkedHashMap,File file){
		 Connection conn = null;
		  Statement stmt = null;
		  try {		
	        conn=dataSource.getConnection();
	        stmt = conn.createStatement();	
	        String currentQuery = "LOAD DATA LOCAL  INFILE '"+ file.getCanonicalPath().replace("\\", "/")+"'   INTO TABLE temp  FIELDS TERMINATED BY '@'" +
	          		" LINES TERMINATED BY '\n' ( ";	        
	        currentQuery+=StringUtils.arrayToCommaDelimitedString( linkedHashMap.keySet().toArray());
	        currentQuery+= ")";
	        System.out.println(currentQuery);
	        stmt.executeUpdate(currentQuery);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	
	public static void makeDB(File infile) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd-HH-mm-ss");
	        String dateToday= dateFormat.format(new Date());
	        String loadedFile=dateToday+"final.csv";
			File finalcsv=new File(infile.getParentFile(),"import"+File.separatorChar+loadedFile);
			PrintStream out =new PrintStream(finalcsv);
			String s = null;
			Map<String, Integer> alinkedHashMap=new LinkedHashMap<String, Integer>();
			dropTempTable(getMapping(alinkedHashMap));
			File[] listOfFiles = infile.listFiles(); 
			for(File file:listOfFiles){
				if(file.isFile())
				{					
					Map<String, Integer> linkedHashMap=getMapping(alinkedHashMap);
					System.out.println(file.getCanonicalPath());
					BufferedReader br = new BufferedReader(new FileReader(
							file));
					//get Header
					
					if ((s = br.readLine()) != null && (s = s.trim()).length() > 0) {
						String f[] = s.split("@");
						for (int i = 0; i < f.length; i++) {
							if(linkedHashMap.containsKey(f[i]))
							linkedHashMap.put(f[i], i);
						}
						
					}
					while ((s = br.readLine()) != null && (s = s.trim()).length() > 0) {
						String f[] = s.split("@");
						Iterator<Integer> indexItr=linkedHashMap.values().iterator();
						while(indexItr.hasNext()){
							Integer index=indexItr.next();
							try {
								if(index==-1 ||f.length<=index)
									out.print(""+"@");
								else if("null".equals(f[index]))
									out.print(""+"@");
								else
									out.print(f[index]+"@");
							} catch (Exception e) {
								out.print(""+"@");
							}
							
						}
						out.println();
					}
					br.close();	
				}			
					
			}
			out.close();
			createAndLoadTempTable(alinkedHashMap,finalcsv);
			
			
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static Map<String, Integer> getMapping(Map<String, Integer> linkedHashMap) {
		linkedHashMap.put("YR_MTH",-1);
		linkedHashMap.put("PER_NO",-1);
		linkedHashMap.put("EMP_NAME",-1);
		linkedHashMap.put("RNK_CD",-1);
		linkedHashMap.put("UNIT_CD",-1);
		linkedHashMap.put("PAN_NUMBER",-1);
		linkedHashMap.put("GPF_AC_NO",-1);
		linkedHashMap.put("GPF_SUBS",-1);
		linkedHashMap.put("GPF_ARR_REC",-1);
		linkedHashMap.put("ADVANCE",-1);
		linkedHashMap.put("BANK_ACNO",-1);
		linkedHashMap.put("BANK_ADD",-1);
		return linkedHashMap;
	}	
}
