package com.tvd.spring.inaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tvd.spring.inaction.model.Quiz;

/**
 * Hello world!
 *
 */
public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext appContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		Quiz quiz = appContext.getBean("quiz", Quiz.class);
		
		System.out.println(quiz.getStudent().getName());
		
	}
}
