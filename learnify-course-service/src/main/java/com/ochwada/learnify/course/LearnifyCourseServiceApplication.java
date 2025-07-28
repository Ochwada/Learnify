package com.ochwada.learnify.course;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.File;

@SpringBootApplication
public class LearnifyCourseServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnifyCourseServiceApplication.class, args);

	}

	static {
		// Load environment variables from .env file
		// Ignores file if missing (useful for production environments like Heroku)

		Dotenv dotenv = Dotenv.configure()
				.filename(".env")
				.ignoreIfMissing()
				.load();

		System.out.println("Looking for .env in: " + new File(System.getProperty("user.dir")));


		// List of expected keys to load from the .env file
		String[] envVars = {
				"POSTGRES_DB",
				"POSTGRES_USER",
				"POSTGRES_PASSWORD",
				"COURSE_SERVICE_PORT",
				"MOTIVATION_SERVICE_URL"
		};

		// Iterate through keys and set them as JVM system properties if found
		for (String key : envVars){
			String value = dotenv.get(key);

			if (value != null){
				System.setProperty(key, value);  // Makes it accessible via System.getProperty
				System.out.println("✅ " + key + " loaded and set.");
			}else {
				System.out.println("⚠️" + key + " not found in .env file. Skipping System.");
			}
		}
	}

}



