package com.revature.models;

public class Roles {

	//All variables for the Shop class - must match the Shop table in the database
    //All variables are  private because private coupled with getters and setters (ENCAPSULATION)
	private int ers_user_id;
	private String user_role;

	
	
	//no args constructor
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}


	//all args constructor
	public Roles(int ers_user_id, String user_role) {
		super();
		this.ers_user_id = ers_user_id;
		this.user_role = user_role;
	}

	//toString() is an important method because it allows us to print objects and their variables as a String
	@Override
	public String toString() {
		return "Roles [ers_user_id=" + ers_user_id + ", user_role=" + user_role + "]";
	}

	// I created getter/Setter (ENCAPSULATION) one of the pillar of OOP-Java
    // Both allows me to access and change variable to private
	public int getErs_user_id() {
		return ers_user_id;
	}


	public void setErs_user_id(int ers_user_id) {
		this.ers_user_id = ers_user_id;
	}


	public String getUser_role() {
		return user_role;
	}


	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
    
	
	
}
