package com.revature.controllers;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.revature.models.Status;
import com.revature.services.StatusService;

import io.javalin.http.Handler;

public class StatusController {
	
	// Need an ReimbursementService object
	StatusService stat = new StatusService();
	public Handler putStatusHandler = (ctx) ->{
		if(ctx.req.getSession(true) != null) {
			ArrayList<Status> sta = stat.updateAllStatus();
			//Create GSON object to convert our object into JSON
			Gson gson = new Gson();
			String JSONStatus = gson.toJson(sta);
			// HTTP response containing our JSON String back to the webpage
			   ctx.result(JSONStatus);
			   ctx.status(200);	   
		} else {
			   ctx.status(400);
		   }
			
		};
	

}




