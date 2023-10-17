package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	//define @PostConstruct to load the student data. Called only once!
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		theStudents.add(new Student("Poornima", "Patel"));
		theStudents.add(new Student("Scooby", "Do"));
		theStudents.add(new Student("Mary", "Katchu"));
	}
	
	// define an endpoint for /student
	@GetMapping("/students")
	public List<Student> getStudents(){
		// just return the data, bcs data is already load inside the loadData function!
		return theStudents;
	}
	
	// define endpoint ("/students/{studentId}") - return student at index
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable("studentId") int studentId) {
		//get a data from theStudents using the id
		return theStudents.get(studentId);
	}
	
	
}
