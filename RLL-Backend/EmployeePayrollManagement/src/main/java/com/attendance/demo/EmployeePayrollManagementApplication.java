package com.attendance.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.attendance.demo")
@SpringBootApplication
public class EmployeePayrollManagementApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EmployeePayrollManagementApplication.class, args);
		
	}

}
