package com.demo3test;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value ="/rest/student")
public class StudentService {

	@RequestMapping(value ="/",method=RequestMethod.GET)
	public HashMap <Long, Student> getAllStudents(){
		return SpringBootRestApplication.hmStudent;
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@RequestMapping(value ="/add",method=RequestMethod.GET)
	public Student addStudent (@RequestParam(value="name") String name, @RequestParam(value="subjet", defaultValue="descocido") String subject){
		
		Student student= new Student(name,subject);
		SpringBootRestApplication.hmStudent.put(new Long(student.getId()),student);
		return student;
	}
	
}

