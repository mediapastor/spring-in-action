package com.tvd.spring.inaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

import com.tvd.spring.inaction.model.Quiz;

@ContextConfiguration(classes = {AppConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class UniversityTest {
	
	@Autowired
	private Quiz quiz;

	@Test
	public void quizTest() {
		assertNotNull(quiz);
		assertNotNull(quiz.getStudent());
		assertTrue(quiz.getStudent().getName().equals("unknown"));
		assertTrue(quiz.getStudent().getAge() == 23);
	}
	
}
