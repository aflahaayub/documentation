package com.learnspring.udemy.learningSpring.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
//  Inject properties for: title.name and definition.name
//  we can load properties from application.properties and use the value using Value annotaion directly
	@Value("${title.name}")
	private String titleName;

	@Value("${definition.name}")
	private String definition;
	
//	Expose new endpoint for "titleinfo"
	@GetMapping("/title")
	public String getTitleInfo() {
		return "Title: " + titleName + ", Definition: " + definition;
	}

	// expose "/" endpoint that return "hello world"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	}

	// expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}

	// new endpoint for "fortune"
	@GetMapping("/hardwork")
	public String getDailyFortune() {
		return "Hardwork will paid.";
	}
}
