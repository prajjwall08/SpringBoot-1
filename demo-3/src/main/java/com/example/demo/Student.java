package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Student {
	@GetMapping("/details")
	String details(@RequestParam String name,@RequestParam int age, String gender) {
		return name + " " + age + " " + gender;
	}
	
}
