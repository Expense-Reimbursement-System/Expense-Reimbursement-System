package com.revature.services;



import com.revature.daos.ReimbursementDAO;
import com.revature.daos.UsersDAO;
import com.revature.models.Roles;
import com.revature.models.Status;
import com.revature.models.Type;
import com.revature.models.Users;

public class AuthService {

	 // Typically, you'll want to validate username/password here in the service...
	 UsersDAO uDAO = new UsersDAO();
	

	 // by calling some DAO method that gets employees where username = ? and password =?
	 public Object login(String ers_username, String ers_password) 
	 {      
		 Users erslogin = uDAO.login(ers_username, ers_password); 
		 
	      return erslogin;    
	      }
	 
	 // 

	}
