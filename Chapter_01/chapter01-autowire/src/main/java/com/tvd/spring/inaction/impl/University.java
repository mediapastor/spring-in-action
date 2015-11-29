package com.tvd.spring.inaction.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tvd.spring.inaction.model.Student;

public class University {

	private String name;
	
	@Autowired
	private Student theBestStudent;
	
	private List<Student> students;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getTheBestStudent() {
		return theBestStudent;
	}

	public void setTheBestStudent(Student theBestStudent) {
		this.theBestStudent = theBestStudent;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
