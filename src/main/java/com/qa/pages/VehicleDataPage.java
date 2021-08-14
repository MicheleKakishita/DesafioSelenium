package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.model.VehicleData;
import com.qa.util.TestBase;

public class VehicleDataPage extends TestBase{
	
	public VehicleDataPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='make']")
	WebElement make;
	
	@FindBy(id="engineperformance")
	WebElement enginePerformance;
	
	@FindBy(id="dateofmanufacture")
	WebElement dateOfManufacture;
	
	@FindBy(xpath="//select[@id='numberofseats']")
	WebElement numberOfSeats;
	
	@FindBy(xpath="//select[@id='fuel']")
	WebElement fuel;

	@FindBy(id="listprice")
	WebElement listPrice;
	
	@FindBy(id="licenseplatenumber")
	WebElement licensePlateNumber;
	
	@FindBy(id="annualmileage")
	WebElement annualMileage;
	
	public void fillForm(VehicleData vehicleData) {
		
		populateField("select", vehicleData.getMake(), make);
		populateField("text", vehicleData.getEnginePerformance(), enginePerformance);
		populateField("text", vehicleData.getDateOfManufacture(), dateOfManufacture);
		populateField("select", vehicleData.getNumberOfSeats(), numberOfSeats);
		populateField("select", vehicleData.getFuel(), fuel);
		populateField("text", vehicleData.getListPrice(), listPrice);
		populateField("text", vehicleData.getLicensePlateNumber(), licensePlateNumber);
		populateField("text", vehicleData.getAnnualMileage(), annualMileage);
		
	}
}
