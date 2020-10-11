package com.vk.BasicStructureSpringBootMVCFileUpload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.BasicStructureSpringBootMVCFileUpload.dao.FileManagerDao;
import com.vk.BasicStructureSpringBootMVCFileUpload.model.FileManager;

@Service
public class FileManagerServiceImpl implements FileManagerService{

	@Autowired
	FileManagerDao fileManagerDao;

	@Override
	public int save(FileManager fileManager) {
		
		return fileManagerDao.save(fileManager);
	}
}
