package com.revature.services;

import java.util.ArrayList;

import com.revature.daos.ReimbursementDAO;
import com.revature.models.Reimbursement;


public class ReimbursementService {
	
	 ReimbursementDAO reimbDAO = new ReimbursementDAO();
	 //this method gets all employees from the DAO (we will call this method from the Handler in the controller layer).
	 //this method will be pretty simple, since we don't really need to process any data - just send it around
	 public ArrayList<Reimbursement> getAllReimbursement(){
	//get the List of Reimbursement from the DAO
	 ArrayList<Reimbursement> reimb = reimbDAO.getAllReimbursement();
	 return reimb;
	 
	 }
	
	 
 }

 