package com.deepak.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {

	@Value("${application.name}")
	private String applicationName;

	@GetMapping
	public String hello() {
		return "Hello World! This is " + applicationName;
	}
}
