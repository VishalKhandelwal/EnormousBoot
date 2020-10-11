package com.vk.BasicStructureSpringBootMVCFileUpload.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.vk.BasicStructureSpringBootMVCFileUpload.model.FileDetail;
import com.vk.BasicStructureSpringBootMVCFileUpload.model.FileDetailHibernate;
import com.vk.BasicStructureSpringBootMVCFileUpload.service.FileDetailHibernateService;
import com.vk.BasicStructureSpringBootMVCFileUpload.service.FileDetailService;

@Controller
public class FileUploadDatabaseController {

	@Autowired
	FileDetailService fileDetailService;
	
	@Autowired
	FileDetailHibernateService fileDetailHibernateService;
	
	@RequestMapping(value = "/singleFileInDb")
	public String fileUploadDb(Model model) {
		model.addAttribute("fileDetailObj",new FileDetail());
		return "fileIntoDb";
	}
	
	@RequestMapping(value = "/saveFileInDb")
	public String saveFileInDb(@ModelAttribute("fileDetailObj") FileDetail fileDetailObject,Model model) throws IOException {
		
		if(!fileDetailObject.getFile().isEmpty()) {
			System.out.println(fileDetailObject.getFile());
			String filename = fileDetailObject.getFile().getOriginalFilename();
			String contentType = fileDetailObject.getFile().getContentType();
			byte[] data = fileDetailObject.getFile().getBytes();
			
			System.out.println(filename+" "+contentType);
			fileDetailObject.setFileName(filename);
			fileDetailObject.setFileType(contentType);
			fileDetailObject.setData(data);
			int save = fileDetailService.save(fileDetailObject);
			if(save>0) {
				model.addAttribute("filesuccess", "File Uploaded successfully.");
			}
			else {
				model.addAttribute("filesuccess", "Error in file submitting.");
			}
		}
		
		return "fileIntoDb";
	}
	
	
	@RequestMapping(value = "/singleFileInDbHibernate")
	public String fileUploadDbHibernate(Model model) {
		model.addAttribute("fileDetailHibernateObj",new FileDetailHibernate());
		return "fileIntoDbWithHibernate";
	}
	
	@RequestMapping(value = "/saveFileInDbHibernate")
	public String saveFileInDbHibernate(@ModelAttribute("fileDetailHibernateObj") FileDetailHibernate fileDetailHibernateObject,@RequestParam MultipartFile file,Model model) throws IOException {
		
		if(!file.isEmpty()) {
			
			String filename = file.getOriginalFilename();
			String contentType = file.getContentType();
			byte[] data = file.getBytes();
			
			System.out.println(filename+" "+contentType);
			fileDetailHibernateObject.setFileName(filename);
			fileDetailHibernateObject.setFileType(contentType);
			fileDetailHibernateObject.setData(data);
			FileDetailHibernate save = fileDetailHibernateService.save(fileDetailHibernateObject);	
			if(save != null) {
				model.addAttribute("filesuccess", "File Uploaded successfully.");
			}
			else {
				model.addAttribute("filesuccess", "Error in file submitting.");
			}
		}
		
		return "fileIntoDbWithHibernate";
	}
	
}
