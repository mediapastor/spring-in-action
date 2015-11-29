package com.tvd.spring.inaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tvd.spring.inaction.impl.QuizImpl;
import com.tvd.spring.inaction.model.Quiz;

@Configuration
@ComponentScan("com.tvd.spring.inaction.*")

public class AppConfig {

	@Bean
	public Quiz quiz() {
		return new QuizImpl();
	}
	
}
