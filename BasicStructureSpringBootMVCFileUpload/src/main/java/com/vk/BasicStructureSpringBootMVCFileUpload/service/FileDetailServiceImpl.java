package com.vk.BasicStructureSpringBootMVCFileUpload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.BasicStructureSpringBootMVCFileUpload.dao.FileDetailDao;
import com.vk.BasicStructureSpringBootMVCFileUpload.model.FileDetail;

@Service
public class FileDetailServiceImpl implements FileDetailService {

	@Autowired
	FileDetailDao detailDao;

	@Override
	public int save(FileDetail fileDetail) {
		
		return detailDao.save(fileDetail);
	}
}
