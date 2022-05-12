package com.revature.models;

public class Users {
	
	//All variables for the Shop class - must match the Shop table in the database
    //All variables are  private because private coupled with getters and setters (ENCAPSULATION)
	private int ers_users_id;
	private String ers_username;
	private String ers_password;
	private String ers_first_name;
	private String ers_second_name;
	private String ers_email;
	private  int ers_user_roles_id;
	
	
	//no args constructor
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	//all args constructor
	public Users(int ers_users_id, String ers_username, String ers_password, String ers_first_name,
			String ers_second_name, String ers_mail, int ers_user_roles_id) {
		super();
		this.ers_users_id = ers_users_id;
		this.ers_username = ers_username;
		this.ers_password = ers_password;
		this.ers_first_name = ers_first_name;
		this.ers_second_name = ers_second_name;
		this.ers_email = ers_email;
		this.ers_user_roles_id = ers_user_roles_id;
	}


	//toString() is an important method because it allows us to print objects and their variables as a String
	@Override

	public String toString() {
		return "Users [ers_users_id=" + ers_users_id + ", ers_username=" + ers_username + ", ers_password="
				+ ers_password + ", ers_first_name=" + ers_first_name + ", ers_second_name=" + ers_second_name
				+ ", ers_mail=" + ers_email + ", ers_user_roles_id=" + ers_user_roles_id + "]";
	

	}



	// I created getter/Setter (ENCAPSULATION) one of the pillar of OOP-Java
    // Both allows me to access and change variable to private
	public int getErs_users_id() {
		return ers_users_id;
	}

	public void setErs_users_id(int ers_users_id) {
		this.ers_users_id = ers_users_id;
	}

	public String getErs_username() {
		return ers_username;
	}

	public void setErs_username(String ers_username) {
		this.ers_username = ers_username;
	}

	public String getErs_password() {
		return ers_password;
	}

	public void setErs_password(String ers_password) {
		this.ers_password = ers_password;
	}

	public String getErs_first_name() {
		return ers_first_name;
	}

	public void setErs_first_name(String ers_first_name) {
		this.ers_first_name = ers_first_name;
	}

	public String getErs_second_name() {
		return ers_second_name;
	}

	public void setErs_second_name(String ers_second_name) {
		this.ers_second_name = ers_second_name;
	}

	public String getErs_mail() {
		return ers_email;
	}

	public void setErs_mail(String ers_mail) {
		this.ers_email = ers_mail;
	}

	public  int getErs_user_roles_id() {
		return ers_user_roles_id;
	}

	public void setErs_user_roles_id(int ers_user_roles_id) {
		this.ers_user_roles_id = ers_user_roles_id;
	}


	
	}
	
	
	