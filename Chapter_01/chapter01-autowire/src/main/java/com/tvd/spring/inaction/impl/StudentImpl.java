package com.tvd.spring.inaction.impl;

import org.springframework.stereotype.Component;

import com.tvd.spring.inaction.model.Student;

@Component
public class StudentImpl implements Student {

	private String name;
	
	private int age;
	
	public StudentImpl() {
		name = "unknown";
		age = 23;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
