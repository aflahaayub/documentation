package com.learnspring.udemy.learningSpring.entities;
import org.springframework.stereotype.Component;

// @Component
public class Dog {
	private String name = "Doggy Dog";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
