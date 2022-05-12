package com.revature.models;

public class Status {

	//All variables for the Shop class - must match the Shop table in the database
    //All variables are  private because private coupled with getters and setters (ENCAPSULATION)
	private int reimb_status_id;
	private String reimb_status;
	
	
	
	//no args constructor
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}


	//all args constructor
	public Status(int reimb_status_id, String reimb_status) {
		super();
		this.reimb_status_id = reimb_status_id;
		this.reimb_status = reimb_status;
	}
 
	//toString() is an important method because it allows us to print objects and their variables as a String
	@Override
	public String toString() {
		return "Status [reimb_status_id=" + reimb_status_id + ", reimb_status=" + reimb_status + "]";
	}

	// I created getter/Setter (ENCAPSULATION) one of the pillar of OOP-Java
    // Both allows me to access and change variable to private
	public int getReimb_status_id() {
		return reimb_status_id;
	}


	public void setReimb_status_id(int reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}


	public String getReimb_status() {
		return reimb_status;
	}


	public void setReimb_status(String reimb_status) {
		this.reimb_status = reimb_status;
	}
  
	
	 
	 
	
}
