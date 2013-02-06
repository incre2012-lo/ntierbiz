package com.paldaps.action.file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FileCRUDAction extends ActionSupport { 

	public String delete(){
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		File fileTodelete = new File(getText("file.location"), request.getParameter("fileName"));
		try {
			FileUtils.forceDelete(fileTodelete);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addActionError(e.getMessage());
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

}
