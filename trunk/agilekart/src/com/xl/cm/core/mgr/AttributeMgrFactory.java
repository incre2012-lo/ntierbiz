package com.xl.cm.core.mgr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.xl.cm.core.entity.AttributeMgr;


public class AttributeMgrFactory {
private JAXBContext jaxbContext;
private AttributeMgr mgr;
	
	private static String packageName = "com.xl.cm.core.entity";
	private String xmlFileName = "AttributeFeed.xml";	
	private AttributeMgrFactory(){		
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
		mgr = (AttributeMgr) unmarshaller.unmarshal(new File(xmlFileName));
		} catch (JAXBException e) {
		System.out.println("There is this problem with unmarshalling: " + e);
		}
	}
	
	public void persist() {
		try {
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
			new Boolean(true));
			marshaller.marshal(mgr, new FileOutputStream(xmlFileName));
			
		} catch (JAXBException e) {
			System.out.println("There was this problem persisting the item: "
			+ e);
		} catch (FileNotFoundException e) {
			System.out.println("There was this problem creating a destination file "
			+ e);
		}
	}

	public AttributeMgr getMgr() {
		return mgr;
	}

	public void setMgr(AttributeMgr mgr) {
		this.mgr = mgr;
	}
	
	static class EntityFeedUtilHolder{
		private static final AttributeMgrFactory _instance=new AttributeMgrFactory();
	}
	
	public static AttributeMgrFactory getInstance(){
		return EntityFeedUtilHolder._instance;
	}
	
}
