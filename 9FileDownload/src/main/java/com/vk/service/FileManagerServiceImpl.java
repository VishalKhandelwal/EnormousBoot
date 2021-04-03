package com.vk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.dao.FileManagerDao;
import com.vk.model.FileManager;



@Service
public class FileManagerServiceImpl implements FileManagerService{

	@Autowired
	FileManagerDao fileManagerDao;

	@Override
	public List<FileManager> getListOfFileManager() {
		
		return fileManagerDao.getListOfFileManager();
	}
}
