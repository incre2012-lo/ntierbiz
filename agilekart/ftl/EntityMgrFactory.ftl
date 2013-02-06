package com.xl.cm.core.mgr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.xl.cm.core.entity.${BigEntity}Mgr;


public class ${BigEntity}MgrFactory {
private JAXBContext jaxbContext;
private ${BigEntity}Mgr mgr;
	
	private static String packageName = "com.xl.cm.core.entity";
	private String xmlFileName = "data"+File.separatorChar+"${Entity}"+File.separatorChar+"${BigEntity}Feed.xml";	
	private ${BigEntity}MgrFactory(){
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
		mgr = (${BigEntity}Mgr) unmarshaller.unmarshal(new File(xmlFileName));
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

	public ${BigEntity}Mgr getMgr() {
		return mgr;
	}

	public void setMgr(${BigEntity}Mgr mgr) {
		this.mgr = mgr;
	}
	
	static class EntityFeedUtilHolder{
		private static final ${BigEntity}MgrFactory _instance=new ${BigEntity}MgrFactory();
	}
	
	public static ${BigEntity}MgrFactory getInstance(){
		return EntityFeedUtilHolder._instance;
	}
	
}
