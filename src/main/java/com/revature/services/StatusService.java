package com.revature.services;

import java.util.ArrayList;

import com.revature.daos.StatusDAO;
import com.revature.models.Status;



public class StatusService {
	
	      String reimb_status = "Pedding";
	      
	
	 StatusDAO staDAO = new StatusDAO();
	 //this method gets all employees from the DAO (we will call this method from the Handler in the controller layer).
	 //this method will be pretty simple, since we don't really need to process any data - just send it around
	 public ArrayList<Status> updateAllStatus(){
	//get the List of Reimbursement from the DAO
	 ArrayList<Status> stat = staDAO.updateAllStatus(2, reimb_status);
	 return stat;
	 
	 }
	
	}
	
	 


