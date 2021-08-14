package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.model.QuoteData;
import com.qa.util.TestBase;

public class QuoteDataPage extends TestBase{
	
	
	public QuoteDataPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement email;
    
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="username")
	WebElement username;
    
	@FindBy(id="password")
	WebElement password;	

	@FindBy(id="confirmpassword")
	WebElement confirmPassword;	
	
	@FindBy(id="sendemail")
	WebElement sendButton;
    
	public void fillForm(QuoteData quoteData) {
		
		populateField("text", quoteData.getEmail(), email);
		populateField("text", quoteData.getPhone(), phone);
		populateField("text", quoteData.getUsername(), username);
		populateField("text", quoteData.getPassword(), password);
		populateField("text", quoteData.getConfirmPassword(), confirmPassword);
		
	}
}
