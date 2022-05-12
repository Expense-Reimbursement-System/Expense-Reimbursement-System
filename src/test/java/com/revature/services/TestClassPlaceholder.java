package com.revature.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.revature.daos.ReimbursementDAO;
import com.revature.daos.UsersDAO;
import com.revature.models.Users;

public class TestClassPlaceholder {
	
	// Call DAO Classes
	//UsersDAO ud = new UsersDAO();
	//ReimbursementDAO reimb = new ReimbursementDAO();
	
	
	
	      // Declare an unitialized User object
	      static Users us;
	      
	      // Create  a few variables to be used in this test
	      int x = 1;
	      
	        @Before //methods with @Before will run BEFORE every tests run in JUnit 4, it's @BeforeAll in JUnit
	  	    //initialize my User object to be used in the tests
	  	    public void initialize() {
	  		System.out.println("In the @Before method");
	  		us = new Users();
	  	    }
	            @After //methods with @After will run AFTER every test runs in JUnit 4, it's @AfterAll in Junit 5
	    	    //The User will return back to null after each method runs
	    	    public void uninitialize() {
	    		System.out.println("In the @After method");
	    		us = null;
	    	}
	       
	        // Unit Test ------------------- ^_^
	            
	            @Test
	            public void getUsersByID() {
	            	int result = us.getErs_user_roles_id();
	            	assertNotNull(result == x);
	            	
	            }
	           

	
	


}
