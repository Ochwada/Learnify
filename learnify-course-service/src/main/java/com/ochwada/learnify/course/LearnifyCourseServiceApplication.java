package com.ochwada.learnify.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LearnifyCourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnifyCourseServiceApplication.class, args);
	}

}
