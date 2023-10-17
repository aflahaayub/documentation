package com.learnspring.udemy.learningSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.udemy.learningSpring.configs.MyConfig;

public class Main {
	public static void main(String[] args) {
		// Example of automatic configuration,
		// where we mark a class with necessary annotations, and tell Spring the package
		// that has your classes
		// This is the package that framework will run through to find annotations and
		// create objects of these classes.

		// create an empty Spring Context that will look for its own beans
		// based on the annotations in the specified package
		
		/* ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.learnspring.udemy.learningSpring.entities");

		Cat cat = context.getBean(Cat.class);
		// When Spring creates a Dog object, it gives the object a standard name
		// which is the class name but with an initial lowercase letter. In this case,
		// our class is called Dog, so the bean's name is be "dog".
		// And because Java can't be 100% certain which class we want, it returns an
		// Object object, which we then manually cast to the desired type, i.e. Dog.
		Dog dog = (Dog) context.getBean("dog");
		Parrot parrot = context.getBean("parrot-polly", Parrot.class); // get a bean by class name and by bean name

		System.out.println(cat.getName());
		System.out.println(dog.getName());
		System.out.println(parrot.getName()); */
		
		// Example of Java-based Configuration
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		// If we have several different classes that create beans and we want to connect several of them simultaneously, 
		// we simply indicate them all there, separated by commas.
		//ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class, MyAnotherConfig.class);
		
		//And if we have too many of them and we want to connect them all simultaneously, 
		// then we simply indicate the name of the package they are contained in
		// In this case, Spring will go through the package and find all the classes marked with the @Configuration annotation. 
		//ApplicationContext context = new AnnotationConfigApplicationContext("com.learnspring.udemy.learningSpring.entities");
		
	}
}
