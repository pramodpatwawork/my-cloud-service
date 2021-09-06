package com.mywork.pp.my.cloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/hello")
	public String hello() {
		
		logger.info("Hello controller called");
		return "Hello World RESTful with Spring Boot";
	}
}