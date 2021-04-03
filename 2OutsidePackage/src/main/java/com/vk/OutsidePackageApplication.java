package com.vk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller"})
public class OutsidePackageApplication {

	public static void main(String[] args) {
		SpringApplication.run(OutsidePackageApplication.class, args);
	}

}
