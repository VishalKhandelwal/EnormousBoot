package com.vk.model;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


public class FileManager {

	private Integer id;
	
	private MultipartFile file;	
	
	private String filePath;
	
	private String contentType;
	
	private Float fileSize;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Float getFileSize() {
		return fileSize;
	}

	public void setFileSize(Float fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "FileManager [id=" + id + ", file=" + file + ", filePath=" + filePath + ", contentType=" + contentType
				+ ", fileSize=" + fileSize + "]";
	}
	
	
}
