package com.vk.BasicStructureSpringBootMVCFileUpload.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.BasicStructureSpringBootMVCFileUpload.dao.FileDetailHibernateDao;
import com.vk.BasicStructureSpringBootMVCFileUpload.model.FileDetailHibernate;

@Service
public class FileDetailHibernateServiceImpl implements FileDetailHibernateService{

	@Autowired
	FileDetailHibernateDao fileDetailHibernateDao;
	
	@Override	
	public FileDetailHibernate save(FileDetailHibernate detailHibernate) {
		return fileDetailHibernateDao.save(detailHibernate);
		
	}

}
