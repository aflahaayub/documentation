package com.learnspring.udemy.learningSpring.entities;

import org.springframework.stereotype.Component;

// @Component // example of automatic configuration
public class Cat {
	private String name = "Catty Cat";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
