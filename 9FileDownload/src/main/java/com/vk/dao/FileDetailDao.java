package com.vk.dao;

import java.util.List;

import com.vk.model.FileDetail;


public interface FileDetailDao {
	public List<FileDetail> getListOfFileDetail();
    public FileDetail getFileDetailById(int id);
}
