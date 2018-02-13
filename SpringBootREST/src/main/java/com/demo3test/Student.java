package com.demo3test;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class Student {
	
	 private long id;
	 private String name;
	 private String subject;
	 
	 public Student() {
		
		}
	 
	 public Student(String name, String subject) {
		this.id = (new Date().getTime());
		this.name = name;
		this.setSubject(subject);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	 
	
}

