package com.ochwada.learnify.motivation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication

public class LearnifyMotivationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnifyMotivationServiceApplication.class, args);
	}

}
