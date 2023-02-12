package com.jenkins.jenkinstest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@RequestMapping("/test")
	public String testMethod() {
		
		return "Hello Bunny How are You";
		
	}

}
