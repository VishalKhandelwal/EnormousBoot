package com.download;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.download.servlet.DownloadServlet;

@SpringBootApplication
public class SpringMvcDownloadSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcDownloadSpringBootApplication.class, args);
	}

	
	// Register Servlet
	  @Bean
	  public ServletRegistrationBean<DownloadServlet> servletRegistrationBean() {
	    ServletRegistrationBean<DownloadServlet> bean = new ServletRegistrationBean<DownloadServlet>(
	        new DownloadServlet(), "/DownloadServlet");
	    return bean;
	  }
}
