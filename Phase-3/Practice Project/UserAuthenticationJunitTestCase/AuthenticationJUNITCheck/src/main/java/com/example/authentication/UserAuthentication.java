
package com.example.authentication;

import java.util.regex.Pattern;

public class UserAuthentication 
{
	public static boolean patternMatches(String emailAddress, String regexPattern) 
	{
	    return Pattern.compile(regexPattern)
	      .matcher(emailAddress)
	      .matches();
	}
	
	public static boolean passwordMatches(String passwordMat, String regexPatterns) {
	    return Pattern.compile(regexPatterns)
	      .matcher(passwordMat)
	      .matches();
	}
	
	
}
