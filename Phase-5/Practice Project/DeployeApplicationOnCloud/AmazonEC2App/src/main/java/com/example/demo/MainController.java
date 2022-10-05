package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String Hello()
	{
		 return "Hello Wlcome to AMAZON EC2 Online Application Made with SpringBoot";
	}
}
