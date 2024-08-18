package com.server.runus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootTest
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class RunUsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunUsServerApplication.class, args);
	}

}
