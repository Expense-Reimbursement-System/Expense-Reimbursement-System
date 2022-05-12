package com.revature;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.utils.ConnectionUtil;
import com.revature.controllers.AuthController;
import com.revature.controllers.ReimbursementController;
import com.revature.controllers.StatusController;
import com.revature.controllers.UsersController;


import io.javalin.Javalin;

public class Launcher {

    public static void main(String[] args) {
    	
    	//here we go again... have fun!!
    	
    	/*
    	  
    	  
		       _.---._    /\\
		    ./'       "--`\//
		  ./              o \
		 /./\  )______   \__ \
		./  / /\ \   | \ \  \ \
		   / /  \ \  | |\ \  \7
		    "     "    "  "        
    	  
    	  
    	  Here's an aardvark this time... not as friendly or cute as a dog, but take him anyway.
    	  // Nice! ^_-
    	   
    	   * 
    	   *
    	   
    	 */
    	        //In this try/catch, we're just testing whether our Connection (from the ConnectionUtil Class) is successful
    			//The getConnection() method will return a Connection Object if you connect successfully
    			try(Connection conn = ConnectionUtil.getConnection()){
    				System.out.println("CONNECTION SUCCESSFUL :)");
    			} catch (SQLException e) { //if creating this connection fails... catch the exception and print the stack trace
    				System.out.println("connection failed... :(");
    				e.printStackTrace();
    			}
    			
    			//Instantiating an UsersController object so that we can access it's Handlers
    			ReimbursementController er = new ReimbursementController();
    			//Instantiating an UsersController object so that we can access it's Handlers
    			UsersController ec = new UsersController();
;		        // Instantiating an AuthController object so we can access it's Handlers
		        AuthController ac = new AuthController();
		        // Instantiating an AuthController object so we can access it's Handlers
		        StatusController ed = new StatusController();
		        
		        
    			//Typical Javalin syntax to create a Javalin object
    			Javalin app = Javalin.create(
    					//The config lambda lets us specify certain configurations.
    					config ->{ 
    						config.enableCorsForAllOrigins();
    						
    					}
			
    					).start(3000); //we need this to start our application on port 3000
    			
    			//handler ending in /employees that takes in GET requests - will return all Reimbursement
    			//the app.get() method takes in a URL endpoint, and a place in the server to send the request to
    			app.get("/reimbursement", er.getReimbursementHandler);
    			//handler ending in /employees that takes in GET requests - will return all user
    			//the app.get() method takes in a URL endpoint, and a place in the server to send the request to
    		    app.get("/users", ec.getUsersHandler);
    			
    			// Hander ending in/login that takes it POST request - will validate user login
    			// the app.post()method takes in a URL endpoint, add a place in the server to send the request to
    	       	app.post("/login", ac.loginHandler);
    	       //handler ending in /employees that takes in GET requests - will return all Status
   
    	       	
    	       	
    	       	
    }
    
}
