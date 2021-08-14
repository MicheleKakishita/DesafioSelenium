package com.qa.model;

public class QuoteData {
	
	public QuoteData() {};
	
	public QuoteData(String email,
					 String phone,
					 String username,
					 String password,
					 String confirmPassword) {
		
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		
	}
	
	private String email;
	private String phone;
	private String username;
	private String password;
	private String confirmPassword;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}	
	
}
