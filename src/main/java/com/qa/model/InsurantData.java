package com.qa.model;

import java.util.ArrayList;
import java.util.List;

public class InsurantData{
	
	public InsurantData() {};
	
	public InsurantData(String firstName,
						String lastName,
						String birthDate,
						String gender,
						String streetAddress,
						String country,
						String zipcode,
						String city,
						String occupation,
						List<String> hobbies) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.streetAddress = streetAddress;
		this.country = country;
		this.zipcode = zipcode;
		this.city = city;
		this.occupation = occupation;
		this.hobbies = hobbies;
		
	}
	
	private String firstName;
	private String lastName;
	private String birthDate;
	private String gender;
	private String streetAddress;
	private String country;
	private String zipcode;
	private String city;
	private String occupation;
	private List<String> hobbies = new ArrayList<String>();
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

}
