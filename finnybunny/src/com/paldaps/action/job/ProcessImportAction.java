package com.paldaps.action.job;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class ProcessImportAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fileName;
	private String fileLocation;
	
	public String execute() {		
		if(ImportUtil.unlock)
		{	
			ImportUtil.unlock=false;
			try {
				File file = new File(fileLocation, fileName);
				ImportUtil.parseAndLoadExcel(file);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			ImportUtil.unlock=true;
			return SUCCESS;
		}
		else
			return ERROR;
		
	}
	
	public String lastUpload() {	
		return SUCCESS;
	} 

	public String publish() {
		if(PublishUtil.unlock)
		{	
			PublishUtil.unlock=false;
			try {
				PublishUtil.doPublish();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			PublishUtil.unlock=true;
			return SUCCESS;
		}
		else
			return ERROR;
		
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = getText(fileLocation);
	}

	
	
	

}
