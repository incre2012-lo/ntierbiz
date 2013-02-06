package com.paldaps.bo.dao.hibernate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;



public class QueryUtil {
	public static String getQuery(String clazz,String query,String qtype,String sort,String order){
		String queryString="from "+clazz+" where 1=1 ";
		if(StringUtils.isNotBlank(query) && StringUtils.isNotBlank(qtype)){
			queryString+=" and " + qtype + " like '%" + query+"%'";
		}
		if(StringUtils.isNotBlank(sort) && StringUtils.isNotBlank(order)){
			queryString+=" order by " + sort + " " + order;
		}
		return queryString;	
	}
	
	public static String[] getMonths(String year){
		int nextyr=Integer.parseInt(year)+1;				
		String months[]={year+"04",year+"05",year+"06",year+"07",year+"08",year+"09",year+"10",year+"11",year+"12",nextyr+"01",nextyr+"02",nextyr+"03"};
		return months;
	}
	public static String  currentYearMonth(){
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyyMM" );  
		String today = formatter.format( new java.util.Date() );
		return today;
	}
	public static String  currentMonth(){
		SimpleDateFormat formatter = new SimpleDateFormat( "MM" );  
		String today = formatter.format( new java.util.Date() );
		return today;
	}
	public static String  currentYear(){
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyy" );  
		String today = formatter.format( new java.util.Date() );
		return today;
	}
	
	public static String  getYear(String mnthYear){
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyyMM" ); 
		SimpleDateFormat yformatter = new SimpleDateFormat( "yyyy" ); 
		try {
			Date date=formatter.parse(mnthYear);			
			return yformatter.format(date);
		} catch (ParseException e) {
			return currentYear();
		}
	}
	
	public static String  currentFinacialYear(){
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyy" );  
		String today = formatter.format( new java.util.Date() );
		String curMnth=currentMonth();
		if(curMnth.equals("01")||curMnth.equals("02")||curMnth.equals("03")){
			Integer year=Integer.parseInt(today);
			year--;
			return String.valueOf(year);
		}else{			
			return today;
		}
	}
	public static Map<String,String> allYearList(){	
		HashMap<String,String> yearList=new LinkedHashMap<String,String>();
		int currentYear=Integer.parseInt(currentYear());
		for (int i = 2012; i <=currentYear; i++) {
			int next=i+1;
			yearList.put(String.valueOf(i), i+"-"+next);
		}
		return  yearList; 
	}
	
	public static String  previousMonthYear(String yearMnth){
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyyMM" );  
		try {
			Date date=formatter.parse(yearMnth);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.MONTH, -1);
			return formatter.format(c.getTime());
		} catch (ParseException e) {
			return yearMnth;
		}
	
	}
	
	public static String  displayMonthYear(String yearMnth){
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyyMM" ); 
		SimpleDateFormat yformatter = new SimpleDateFormat( "MMM-yyyy" ); 
		try {
			Date date=formatter.parse(yearMnth);			
			return yformatter.format(date);
		} catch (ParseException e) {
			return currentYear();
		}
	}
	
	public static String[] getArray4mComma(String str){
		return str.replaceAll(" ", "").split(",");
	}
	public static void main(String []args){
//		Map<String,String> dummy=allYearList();
//	        for (Map.Entry<String, String> entry : dummy.entrySet()) {
//	           System.out.println(entry.getKey()+"--"+entry.getValue());
//	    }
		
		System.out.println(currentFinacialYear());
	}
}
