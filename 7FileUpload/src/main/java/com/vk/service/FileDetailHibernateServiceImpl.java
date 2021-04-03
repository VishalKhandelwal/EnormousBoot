package com.vk.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.dao.FileDetailHibernateDao;
import com.vk.model.FileDetailHibernate;

@Service
public class FileDetailHibernateServiceImpl implements FileDetailHibernateService{

	@Autowired
	FileDetailHibernateDao fileDetailHibernateDao;
	
	@Override	
	public FileDetailHibernate save(FileDetailHibernate detailHibernate) {
		return fileDetailHibernateDao.save(detailHibernate);
		
	}

}
