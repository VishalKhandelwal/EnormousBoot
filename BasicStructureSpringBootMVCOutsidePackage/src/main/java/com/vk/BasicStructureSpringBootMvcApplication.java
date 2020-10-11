package com.vk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller"})
public class BasicStructureSpringBootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicStructureSpringBootMvcApplication.class, args);
	}

}
