package com.revature.controllers;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.revature.models.Reimbursement;
import com.revature.services.ReimbursementService;

import io.javalin.http.Handler;


//We'll either be getting data from the service layer (which gets the data from the DAO)
//OR we'll be sending data that came from the webpage to the service layer (which sends the data to the DAO)
public class ReimbursementController {
	
	    // Need an ReimbursementService object
		ReimbursementService re = new ReimbursementService();
		 //this handler will get HTTP GET resquest for all users, and send back the user from database
		   public Handler getReimbursementHandler = (ctx) -> {
			   if(ctx.req.getSession(true) != null) {
				   //Need an ArrayList of Reimbursement objects
				   ArrayList<Reimbursement> reimb =  re.getAllReimbursement();
				  //Create GSON object to convert our object into JSON
				   Gson gson = new Gson();
				   // use Json .toJson() method to turn our JAva int Json
				   String JSONReimbursement = gson.toJson(reimb);
				// HTTP response containing our JSON String back to the webpage
				   ctx.result(JSONReimbursement);
				   ctx.status(200);	   
			   } else {
				   ctx.status(400);
			   }
			   
			   
			
		};

	       
		

}
