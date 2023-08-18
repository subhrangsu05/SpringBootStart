package com.springboottutorial.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @EnableAutoConfiguration
// @ComponentScan
// @SpringBootConfiguration
public class SpringbootappApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootappApplication.class, args);
		System.out.println("Spring Boot Started.............");
		Person person = context.getBean(Person.class);
		person.talk();
		System.out.print("Spring Boot Ended.......");
	}

}
