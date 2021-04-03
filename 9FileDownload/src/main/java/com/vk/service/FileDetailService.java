package com.vk.service;

import java.util.List;

import com.vk.model.FileDetail;



public interface FileDetailService {

	public List<FileDetail> getListOfFileDetail();
	public FileDetail getFileDetailById(int id);
}
