package com.qa.model;

import java.util.ArrayList;
import java.util.List;

public class ProductData {
	
	public ProductData() {};
	
    public ProductData(String startDate,
    				   String insuranceSum,
    				   String meritRating,
    				   String damageInsurance,
    				   List<String> optionalProducts) {
    	
    	this.startDate = startDate;
    	this.insuranceSum = insuranceSum;
    	this.meritRating = meritRating;
    	this.damageInsurance = damageInsurance;
    	this.optionalProducts = optionalProducts;
    	
    }
	
	private String startDate;
    private String insuranceSum;
    private String meritRating;
    private String damageInsurance;
    private List<String> optionalProducts = new ArrayList<String>();
    private String courtesyCar;
	
    public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getInsuranceSum() {
		return insuranceSum;
	}
	public void setInsuranceSum(String insuranceSum) {
		this.insuranceSum = insuranceSum;
	}
	public String getMeritRating() {
		return meritRating;
	}
	public void setMeritRating(String meritRating) {
		this.meritRating = meritRating;
	}
	public String getDamageInsurance() {
		return damageInsurance;
	}
	public void setDamageInsurance(String damageInsurance) {
		this.damageInsurance = damageInsurance;
	}
	public List<String> getOptionalProducts() {
		return optionalProducts;
	}
	public void setOptionalProducts(List<String> optionalProducts) {
		this.optionalProducts = optionalProducts;
	}
	public String getCourtesyCar() {
		return courtesyCar;
	}
	public void setCourtesyCar(String courtesyCar) {
		this.courtesyCar = courtesyCar;
	}
	

}
