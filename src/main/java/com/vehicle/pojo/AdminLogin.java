package com.vehicle.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Admin_Login_Details")
public class AdminLogin {
	
	@Id
	@Column(name="ADMIN_ID")
	private int id;
	
	@Column(name="ADMIN_EMAIL_ID")
	private String emailId;
	
	@Column(name="ADMIN_PASSWORD")
	private String password;


	
	
	
	
	public AdminLogin(int id, String emailId, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
	}




	@Override
	public String toString() {
		return "AdminLogin [id=" + id + ", emailId=" + emailId + ", password=" + password + "]";
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getEmailId() {
		return emailId;
	}




	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
