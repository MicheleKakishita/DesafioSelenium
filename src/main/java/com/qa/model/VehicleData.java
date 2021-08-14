package com.qa.model;

public class VehicleData{
	
	public VehicleData() {};
	
	public VehicleData(String make, 
					   String enginePerformance, 
					   String dateOfManufacture,
					   String numberOfSeats,
					   String fuel,
					   String listPrice,
					   String licensePlateNumber,
					   String annualMileage) {
		
		this.make = make;
		this.enginePerformance = enginePerformance;
		this.dateOfManufacture = dateOfManufacture;
		this.numberOfSeats = numberOfSeats;
		this.fuel = fuel;
		this.listPrice = listPrice;
		this.licensePlateNumber = licensePlateNumber;
		this.annualMileage = annualMileage;
		
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getEnginePerformance() {
		return enginePerformance;
	}

	public void setEnginePerformance(String enginePerformance) {
		this.enginePerformance = enginePerformance;
	}

	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public String getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(String numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getListPrice() {
		return listPrice;
	}

	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public String getNextButton() {
		return nextButton;
	}

	public void setNextButton(String nextButton) {
		this.nextButton = nextButton;
	}

	public String getAnnualMileage() {
		return annualMileage;
	}

	public void setAnnualMileage(String annualMileage) {
		this.annualMileage = annualMileage;
	}

	private String make;
	
	private String enginePerformance;
	
	private String dateOfManufacture;
	
	private String numberOfSeats;
	
	private String fuel;

	private String listPrice;
	
	private String licensePlateNumber;

	private String annualMileage;
	
	private String nextButton;

}
