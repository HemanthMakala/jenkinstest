package com.jenkins.jenkinstest;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinstestApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinstestApplication.class);

	public static void main(String[] args) {
		logger.info("Application Executed .............");
		SpringApplication.run(JenkinstestApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		logger.info("Application Started .............");
	}

}
