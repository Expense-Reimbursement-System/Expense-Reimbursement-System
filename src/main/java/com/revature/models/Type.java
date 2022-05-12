package com.revature.models;

public class Type {
	
	
	//All variables for the Shop class - must match the Shop table in the database
    //All variables are  private because private coupled with getters and setters (ENCAPSULATION)
	private int reimb_type_id;
	private String reimb_type;
	
	
	
	//no args constructor
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}


	//all args constructor
	public Type(int reimb_type_id, String reimb_type) {
		super();
		this.reimb_type_id = reimb_type_id;
		this.reimb_type = reimb_type;
	}

	//toString() is an important method because it allows us to print objects and their variables as a String
	@Override
	public String toString() {
		return "Type [reimb_type_id=" + reimb_type_id + ", reimb_type=" + reimb_type + "]";
	}

	// I created getter/Setter (ENCAPSULATION) one of the pillar of OOP-Java
    // Both allows me to access and change variable to private
	public int getReimb_type_id() {
		return reimb_type_id;
	}


	public void setReimb_type_id(int reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}


	public String getReimb_type() {
		return reimb_type;
	}


	public void setReimb_type(String reimb_type) {
		this.reimb_type = reimb_type;
	}
	
	
	
	
	

}
