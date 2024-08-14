package com.server.runus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootTest
@SpringBootApplication
public class RunUsServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		
		SpringApplication.run(RunUsServerApplication.class, args);
	}

}
