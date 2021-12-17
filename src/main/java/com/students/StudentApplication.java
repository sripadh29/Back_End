package com.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.students.model")
@EnableJpaRepositories("com.students.repository")
@ComponentScan(basePackages = "com.students.controller, com.students.service")
public class StudentApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	
}
