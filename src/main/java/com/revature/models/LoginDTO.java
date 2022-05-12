package com.revature.models;
//The HECK is a LoginDTO? Data transfer object. A DTO is just a model of some data coming in from the front end
//an HTTP handler will take in a JSON object sent in by the user, containing their username and password
//this gets sent to the controller to get turned into this Java object (user Gson)
//the username and password the user sent in will be put into this DTO as variable, wich we'll check in the AuthServide
//NEVER store a DTO in the database, It's purely for DATA TRANSFER.. we're transferring the username/password
public class LoginDTO {

	     // The LoginDTO models only the username/password sent in by the user
		//Using encapsulation (OOP)
	    private String ers_username;
		private String ers_password;
		private int ers_user_roles_id;
	
			
		
		// args no constructor 
		public LoginDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		//args constructor
		public LoginDTO(String ers_username, String ers_password, int ers_user_roles_id) {
			super();
			this.ers_username = ers_username;
			this.ers_password = ers_password;
			this.ers_user_roles_id = ers_user_roles_id;
		}
		
		
		@Override
		public String toString() {
			return "LoginDTO [ers_username=" + ers_username + ", ers_password=" + ers_password + ", ers_user_roles_id="
					+ ers_user_roles_id + "]";
		}

		// I created getter/Setter (ENCAPSULATION) one of the pillar of OOP-Java
	    // Both allows me to access and change variable to private
		
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

		public int getErs_user_roles_id() {
			return ers_user_roles_id;
		}

		public void setErs_user_roles_id(int ers_user_roles_id) {
			this.ers_user_roles_id = ers_user_roles_id;
		}

		
	
}
