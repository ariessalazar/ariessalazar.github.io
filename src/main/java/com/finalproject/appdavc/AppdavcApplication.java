package com.finalproject.appdavc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class AppdavcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppdavcApplication.class, args);
	}

}
