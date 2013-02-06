package com.xl.cm.core.mgr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.xml.serialize.Method;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.xl.cm.core.entity.ContentMgr;


public class ContentMgrFactory {
private JAXBContext jaxbContext;
private ContentMgr mgr;
	
	private static String packageName = "com.xl.cm.core.entity";
	private String xmlFileName = "ContentFeed.xml";	
	private ContentMgrFactory(){		
		Resource resource = new ClassPathResource(xmlFileName); 
		try {
			xmlFileName=resource.getFile().getAbsolutePath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createContextAndObjectFactory();
		createEntitylist();
	}
	
	private void createContextAndObjectFactory() {
		try {
		jaxbContext = JAXBContext.newInstance(packageName);
	
		} catch (JAXBException e) {
		System.out.println("There was this problem creating a context " + e);
		}
	}
	private void createEntitylist() {
		try {
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		mgr = (ContentMgr) unmarshaller.unmarshal(new File(xmlFileName));
		} catch (JAXBException e) {
		System.out.println("There is this problem with unmarshalling: " + e);
		}
	}
	
	public void persist() {
		try {
			
			Marshaller marshaller = jaxbContext.createMarshaller();			
			// Create output format
            OutputFormat format = new OutputFormat(Method.XML, "UTF-8", true);
         // Define the names of the XML elements to put > around
            String[] cdata = {"^body"};
            format.setCDataElements(cdata);
            format.setNonEscapingElements(cdata); // Those elements should NOT be escaped..
         // Create the serializer
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(xmlFileName), format);
			marshaller.marshal(mgr, new FileOutputStream(xmlFileName));
			
		} catch (JAXBException e) {
			System.out.println("There was this problem persisting the item: "
			+ e);
		} catch (FileNotFoundException e) {
			System.out.println("There was this problem creating a destination file "
			+ e);
		}
	}

	public ContentMgr getMgr() {
		return mgr;
	}

	public void setMgr(ContentMgr mgr) {
		this.mgr = mgr;
	}
	
	static class EntityFeedUtilHolder{
		private static final ContentMgrFactory _instance=new ContentMgrFactory();
	}
	
	public static ContentMgrFactory getInstance(){
		return EntityFeedUtilHolder._instance;
	}
	
}
