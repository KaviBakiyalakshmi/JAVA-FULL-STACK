package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RoutingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingDemoApplication.class, args);
	}

}
