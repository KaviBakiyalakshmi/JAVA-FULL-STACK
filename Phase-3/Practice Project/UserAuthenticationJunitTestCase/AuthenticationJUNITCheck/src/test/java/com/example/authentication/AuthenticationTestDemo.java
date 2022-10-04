package com.example.authentication;

import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.Assertions.*;

import com.example.authentication.UserAuthentication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

	class AuthenticationTestDemo 
	{
		
		private UserAuthentication obj;
		@BeforeEach
		public void setup() {
			obj= new UserAuthentication();
			System.out.println("USER Initiated");
		}
		
		@AfterEach
		public void tearDown()
		{
			obj=null;
			System.out.println("USER Closed");
		}
		
		@Test
		public void testUsingStrictRegex() 
		{
		    String emailAddress = "Kavi@gmail.com";
		    String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
		        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		    assertTrue(UserAuthentication.patternMatches(emailAddress, regexPattern));
		}	
		
		@Test
		public void testUsingPasswordStrictRegex() 
		{
		    String passwordMat = "asdf1234";
		    String regexPatterns = "^(?=.*\\d).{4,8}$";
                  
                    
		    assertTrue(UserAuthentication.passwordMatches(passwordMat, regexPatterns));
		    
		}	
		
	
	}