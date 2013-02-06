package com.paldaps.action.file;

import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport {
	
	private InputStream fileInputStream;
	private String fileName;
	 
	public InputStream getFileInputStream() {
		return fileInputStream;
	}
 
	public String execute() throws Exception {		
		File file = new File(getText("file.location"), fileName);
	    fileInputStream = new FileInputStream(file);
	    return SUCCESS;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
