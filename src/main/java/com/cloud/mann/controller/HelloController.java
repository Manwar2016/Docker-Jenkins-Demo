package com.cloud.mann.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String WelcomeMessage()
	{
		return "Welcome in Spring Boot";
	}
}
