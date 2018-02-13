package com.demo3test;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApplication {

	
	public static HashMap <Long, Student> hmStudent;
	
	public static void main(String[] args) {
		
		hmStudent = new   HashMap  <Long, Student>();
		
		Student uno= new Student("Jho","res");
		hmStudent.put(new Long(uno.getId()),uno);
		
		
		SpringApplication.run(SpringBootRestApplication.class, args);
		Student dos= new Student("Jho2","res2");
		hmStudent.put(new Long(uno.getId()),dos);
	}
	
	
}

