package com.revature.models;

import java.time.LocalDateTime;

public class Reimbursement {
	
	//All variables for the Shop class - must match the Shop table in the database
    //All variables are  private because private coupled with getters and setters (ENCAPSULATION)
	private int reimb_id;
	private float reimb_aumount;
	private String  reimb_submitted;
	private int reimb_author;
	private int reimb_status_id;
	private int reimb_type_id;
	private int reimb_status_id_fl;
	private int reimb_type_id_fk;
	private int ers_author_fk;
	
	
	//no args constructor
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	//all args constructor
	public Reimbursement(int reimb_id, float reimb_aumount, String reimb_submitted, int reimb_author,
			int reimb_status_id, int reimb_type_id, int reimb_status_id_fl, int reimb_type_id_fk, int ers_author_fk) {
		super();
		this.reimb_id = reimb_id;
		this.reimb_aumount = reimb_aumount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_author = reimb_author;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
		this.reimb_status_id_fl = reimb_status_id_fl;
		this.reimb_type_id_fk = reimb_type_id_fk;
		this.ers_author_fk = ers_author_fk;
	}

		
	//toString() is an important method because it allows us to print objects and their variables as a String
		
	@Override
	public String toString() {
		return "Reimbursement [reimb_id=" + reimb_id + ", reimb_aumount=" + reimb_aumount + ", reimb_submitted="
				+ reimb_submitted + ", reimb_author=" + reimb_author + ", reimb_status_id=" + reimb_status_id
				+ ", reimb_type_id=" + reimb_type_id + ", reimb_status_id_fl=" + reimb_status_id_fl
				+ ", reimb_type_id_fk=" + reimb_type_id_fk + ", ers_author_fk=" + ers_author_fk + "]";
	}

	
	// I created getter/Setter (ENCAPSULATION) one of the pillar of OOP-Java
    // Both allows me to access and change variable to private
	public int getReimb_id() {
		return reimb_id;
	}

	public void setReimb_id(int reimb_id) {
		this.reimb_id = reimb_id;
	}

	public float getReimb_aumount() {
		return reimb_aumount;
	}

	public void setReimb_aumount(float reimb_aumount) {
		this.reimb_aumount = reimb_aumount;
	}

	public String getReimb_submitted() {
		return reimb_submitted;
	}

	public void setReimb_submitted(String reimb_submitted) {
		this.reimb_submitted = reimb_submitted;
	}

	public int getReimb_author() {
		return reimb_author;
	}

	public void setReimb_author(int reimb_author) {
		this.reimb_author = reimb_author;
	}

	public int getReimb_status_id() {
		return reimb_status_id;
	}

	public void setReimb_status_id(int reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}

	public int getReimb_type_id() {
		return reimb_type_id;
	}

	public void setReimb_type_id(int reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}

	public int getReimb_status_id_fl() {
		return reimb_status_id_fl;
	}

	public void setReimb_status_id_fl(int reimb_status_id_fl) {
		this.reimb_status_id_fl = reimb_status_id_fl;
	}

	public int getReimb_type_id_fk() {
		return reimb_type_id_fk;
	}

	public void setReimb_type_id_fk(int reimb_type_id_fk) {
		this.reimb_type_id_fk = reimb_type_id_fk;
	}

	public int getErs_author_fk() {
		return ers_author_fk;
	}

	public void setErs_author_fk(int ers_author_fk) {
		this.ers_author_fk = ers_author_fk;
	}

	
	
	

}
