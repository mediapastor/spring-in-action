package com.tvd.spring.inaction.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tvd.spring.inaction.model.Quiz;
import com.tvd.spring.inaction.model.Student;

@Component
public class QuizImpl implements Quiz {

	@Autowired
	//you want autowired this field.
	private Student student;
	
	private float point;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}
	
}
