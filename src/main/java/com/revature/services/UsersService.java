package com.revature.services;

import java.util.ArrayList;

import com.revature.daos.UsersDAO;
import com.revature.models.Users;

public class UsersService {
	
	   UsersDAO usDAO = new UsersDAO();
	    //this method gets all employees from the DAO (we will call this method from the Handler in the controller layer).
		//this method will be pretty simple, since we don't really need to process any data - just send it around
		public ArrayList<Users> getUsers(){
			 //get the List of Users from the DAO
			 ArrayList<Users> user = usDAO.getUsers();
			//return that List of employees
		    return user;
			
		}
		
		
		
}
