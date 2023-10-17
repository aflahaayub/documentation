package com.learnspring.udemy.learningSpring.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnspring.udemy.learningSpring.entities.Cat;
import com.learnspring.udemy.learningSpring.entities.Dog;
import com.learnspring.udemy.learningSpring.entities.Parrot;

// example of Java-based configuration
@Configuration
public class MyConfig {
	
	@Bean 
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean 
	public Dog getDog() {
		return new Dog();
	}
	// Disclaimer:  it's better to indicate a more or less meaningful return value and method name. 
	// Do this if for no other reason than to do yourself a favor when you reopen the project in a year. :) 
	// Object as the return value and the arbitrary name method is NOT GOOD 
	// this is only example that we can write it like this
	@Bean("parrot-polly")
	public Object weNeedMoreParrots() { // The method name does not affect the bean's name, because we explicitly specified the name here
		return new Parrot();
	}
	
	// example when we need one bean to create another bean
	/*first, the parrot-creating method is called and then the framework passes the new parrot to the cat-creating method. 
	 * Here's where dependency injection comes into play: Spring itself passes the required parrot bean to our method. */
	@Bean 
	public Cat getCat(Parrot parrot) {
		Cat cat = new Cat();
		cat.setName(parrot.getName() + "-killer");
		return cat;
	}
}
