package com.paldaps.action.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.paldaps.system.core.util.FileUtil;

public class FileInfo {
	
	 private String path;
     private String fileName;
     private String size;
     private String lastModified;


	public FileInfo(File file) {
		this.path=file.getPath();
		this.fileName=file.getName();
		this.size=FileUtil.readableFileSize(file.length());
		this.lastModified=new SimpleDateFormat("dd-MM-yyyy hh-MM-ss").format(new Date(file.lastModified()));
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getLastModified() {
		return lastModified;
	}


	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	
	
	

}
