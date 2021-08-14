package com.qa.pages;

import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.model.InsurantData;
import com.qa.util.TestBase;

public class InsurantDataPage extends TestBase{
	
	public InsurantDataPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='make']")
	WebElement make;
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	@FindBy(id="birthdate")
	WebElement birthDate;
	
	@FindBy(name="Gender")
	WebElement gender;
	
	@FindBy(id="streetaddress")
	WebElement streetAddress;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement country;
	
	@FindBy(id="zipcode")
	WebElement zipcode;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(xpath="//select[@id='occupation']")
	WebElement occupation;
	
	@FindBy(id="speeding")
	WebElement speeding;
	
	@FindBy(id="bungeejumping")
	WebElement bungeeJumping;
	
	@FindBy(id="cliffdiving")
	WebElement cliffDiving;

	@FindBy(id="skydiving")
	WebElement skyDiving;
	
	@FindBy(id="other")
	WebElement other;
	
	public void fillForm(InsurantData insurantData) {
		
		populateField("text", insurantData.getFirstName(), firstName);
		populateField("text", insurantData.getLastName(), lastName);
		populateField("text", insurantData.getBirthDate(), birthDate);
		populateField("check", insurantData.getGender(), gender);
		populateField("text", insurantData.getStreetAddress(), streetAddress);
		populateField("select", insurantData.getCountry(), country);
		populateField("text", insurantData.getZipcode(), zipcode);
		populateField("text", insurantData.getCity(), city);
		populateField("select", insurantData.getOccupation(), occupation);
		
		for (Iterator<String> iterator = insurantData.getHobbies().iterator(); iterator.hasNext();) {
			String hobby = (String) iterator.next();
			
			if("speeding".equals(hobby)) {
				populateField("check", hobby, speeding);
			}
			if("bungeejumping".equals(hobby)) {
				populateField("check", hobby, bungeeJumping);
			}
			if("cliffdiving".equals(hobby)) {
				populateField("check", hobby, cliffDiving);
			}
			if("skydiving".equals(hobby)) {
				populateField("check", hobby, skyDiving);
			}
			if("other".equals(hobby)) {
				populateField("check", hobby, other);
			}
			
		}
		
	}

}
