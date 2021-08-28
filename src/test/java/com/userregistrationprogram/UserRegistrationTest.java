package com.userregistrationprogram;

import org.junit.rules.ExpectedException;
import org.junit.Test;

public class UserRegistrationTest {
    
	@Test
    public void givenInvalidNameShouldGetThrowsExceptionMessage() {
    	
    	try {
    		
    		UserRegistration user = new UserRegistration();
	    	ExpectedException exceptionRule = ExpectedException.none();
	    	exceptionRule.expect(UserRegistrationInvalidException.class);
	    	user.validateName("vismaya");
	        
    	}catch(UserRegistrationInvalidException e) {
    		System.out.println(e.getMessage());
    	}
    }
	
	@Test
    public void givenInvalidEmailShouldGetThrowsExceptionMessage() {
    	
    	try {
    		
    		UserRegistration user = new UserRegistration();
	    	ExpectedException exceptionRule = ExpectedException.none();
	    	exceptionRule.expect(UserRegistrationInvalidException.class);
	    	user.validateEmail("abc.xyz@gmail.com");
	        
    	}catch(UserRegistrationInvalidException e) {
    		System.out.println(e.getMessage());
    	}
    }
	
	@Test
    public void givenInvalidMobileNoShouldGetThrowsExceptionMessage() {
    	
    	try {
    		
    		UserRegistration user = new UserRegistration();
	    	ExpectedException exceptionRule = ExpectedException.none();
	    	exceptionRule.expect(UserRegistrationInvalidException.class);
	    	user.validateMobileNo("8621304512");
	        
    	}catch(UserRegistrationInvalidException e) {
    		System.out.println(e.getMessage());
    	}
    }
	
	@Test
    public void givenInvalidPasswordShouldGetThrowsExceptionMessage() {
    	
    	try {
    		
    		UserRegistration user = new UserRegistration();
	    	ExpectedException exceptionRule = ExpectedException.none();
	    	exceptionRule.expect(UserRegistrationInvalidException.class);
	    	user.validatePassword("Vis123@");
	        
    	}catch(UserRegistrationInvalidException e) {
    		System.out.println(e.getMessage());
    	}
    }
}
