package org.xldl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreeMarker {
	private static Configuration cfg = new Configuration();
	
	public static void main(String[] args){	
		Map<String,String> root = new HashMap<String,String>();
		root.put("Entity1", "product");
		root.put("BigEntity1", "Product");	
		root.put("Entities1", "products");
		root.put("BigEntities1", "Products");
		root.put("Entity2", "variation");
		root.put("BigEntity2", "Variation");	
		root.put("Entities2", "variations");
		root.put("BigEntities2", "Variations");
		try {
			executeRelation(root);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void executeEntity(){
		Map<String,String> root = new HashMap<String,String>();
		root.put("Entity", "content");
		root.put("BigEntity", "Content");	
		root.put("Entities", "contents");
		root.put("BigEntities", "Contents");
		try {
			execute(root);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void execute(Map<String,String> root) throws TemplateException {
		try {
				
			Template template = cfg.getTemplate("ftl"+File.separatorChar+"Entity.ftl");
			Writer w = new FileWriter(new File("src"+File.separatorChar+root.get("BigEntity")+".java"));
			template.process(root, w);
			template = cfg.getTemplate("ftl"+File.separatorChar+"Entities.ftl");
			w = new FileWriter(new File("src"+File.separatorChar+root.get("BigEntity")+"Mgr.java"));
			template.process(root, w);
			template = cfg.getTemplate("ftl"+File.separatorChar+"EntityMgrFactory.ftl");
			w = new FileWriter(new File("src"+File.separatorChar+root.get("BigEntity")+"MgrFactory.java"));
			template.process(root, w);
			template = cfg.getTemplate("ftl"+File.separatorChar+"EntityDAO.ftl");
			w = new FileWriter(new File("src"+File.separatorChar+root.get("BigEntity")+"DAO.java"));
			template.process(root, w);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void executeRelation(Map<String,String> root) throws TemplateException {
		try {
			Template template = cfg.getTemplate("ftl"+File.separatorChar+"relationship.ftl");
			Writer w = new FileWriter(new File("src"+File.separatorChar+root.get("BigEntity1")+root.get("BigEntity2")+".txt"));
			template.process(root, w);
			template = cfg.getTemplate("ftl"+File.separatorChar+"Entity1Entity2Assign.ftl");
			w = new FileWriter(new File("src"+File.separatorChar+root.get("BigEntity1")+root.get("BigEntity2")+"Assign.java"));
			template.process(root, w);
			template = cfg.getTemplate("ftl"+File.separatorChar+"feedSample.ftl");
			w = new FileWriter(new File("conf"+File.separatorChar+"data"+File.separatorChar+root.get("Entity2")+File.separatorChar+root.get("BigEntity2")+"Feed.xml"));
			template.process(root, w);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
