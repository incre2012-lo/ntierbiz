package com.paldaps.action.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements
		ServletRequestAware {	
	private File uploadFile;	
	private String uploadFileFileName;

	private HttpServletRequest servletRequest;

	public String execute() {
		try {

		//	String filePath = servletRequest.getRealPath("/");
		//	System.out.println("Server path:" + filePath);
			if(StringUtils.isNotBlank(this.uploadFileFileName))
			{	
				File fileToCreate = new File(getText("file.location"), this.uploadFileFileName);			
				FileUtils.copyFile(this.uploadFile, fileToCreate,true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(e.getMessage());

			return INPUT;
		}
		return SUCCESS;
	}

	public List<FileInfo> getAllFiles(){
		List<FileInfo> files=new ArrayList<FileInfo>();
		File folder = new File(getText("file.location"));
		File[] listOfFiles = folder.listFiles(); 
		for(File file:listOfFiles){
			if(file.isFile())
			files.add(new FileInfo(file));
		}	
		return files;
	}
	
	

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;

	}
}
