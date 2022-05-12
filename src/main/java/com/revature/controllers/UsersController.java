package com.revature.controllers;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.revature.models.Users;
import com.revature.services.UsersService;
import io.javalin.http.Handler;

//We'll either be getting data from the service layer (which gets the data from the DAO)
//OR we'll be sending data that came from the webpage to the service layer (which sends the data to the DAO)
public class UsersController {
	
	// Need an UserService object
	UsersService es = new UsersService();
	
	   //this handler will get HTTP GET resquest for all users, and send back the user from database
	   public Handler getUsersHandler = (ctx) -> {
		   if(ctx.req.getSession(true) != null) {
			   //Need an ArrayList of User objects
			   ArrayList<Users> user = es.getUsers();
			   //Create GSON object to convert our object into JSON
			   Gson gson = new Gson();
			   // use Json .toJson() method to turn our JAva int Json
			   String JSONUser = gson.toJson(user);
			   // HTTP response containing our JSON String back to the webpage
			   ctx.result(JSONUser);
			   ctx.status(200);	   
		   } else {
			   ctx.status(400);
		   }
		
	};

	
	
	
}
	
	


