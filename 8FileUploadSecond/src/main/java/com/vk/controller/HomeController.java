package com.vk.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	//@GetMapping("/")
	public String welcome(Model model) {
		return "index";
	}
	
	private static final String UPLOAD_DIRECTORY = "/Upload";

	//@RequestMapping(value = "savefile", method = RequestMethod.POST)
	@PostMapping("savefile")
	public ModelAndView savefile(@RequestParam MultipartFile file, HttpServletRequest servletRequest)  {

		if (null != file && file.getSize() > 0) 
        {
		String rootPath = servletRequest.getServletContext().getRealPath(UPLOAD_DIRECTORY);
		System.out.println(rootPath);
		File directory = new File(rootPath);
		if (!directory.exists()) {

			directory.mkdirs();
		}
		
		String fileName = file.getOriginalFilename();
        String fileType = file.getContentType();
        System.out.println(fileName+" "+fileType);
		File allFile = new File(rootPath, fileName);
		try
        {
        	file.transferTo(allFile);        	
        	
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
        }
		                  
                
        return new ModelAndView("index", "filesuccess", "File successfully saved!");
	}
	
	@RequestMapping(value = "/multiviewer", method = RequestMethod.GET)	
	public String multiviewer(Model model) {
		return "multiviewer";
	}
}
