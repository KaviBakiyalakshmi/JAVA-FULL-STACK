package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.simplilearn.demo")
@SpringBootApplication
public class MAadharApplication {

	public static void main(String[] args) {
		SpringApplication.run(MAadharApplication.class, args);
	}

}
