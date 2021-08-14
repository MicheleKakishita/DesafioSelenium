package com.qa.pages;

import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.model.ProductData;
import com.qa.util.TestBase;

public class ProductDataPage extends TestBase{
	
	public ProductDataPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="startdate")
	WebElement startDate;
	
	@FindBy(xpath="//select[@id='insurancesum']")
    WebElement insuranceSum;
	
	@FindBy(xpath="//select[@id='meritrating']")
    WebElement meritRating;
    
	@FindBy(xpath="//select[@id='damageinsurance']")
	WebElement damageInsurance;
	
	@FindBy(id="EuroProtection")
	WebElement euroProtection;
	
	@FindBy(id="LegalDefenseInsurance")
	WebElement legalDefenseInsurance;
	
    @FindBy(xpath="//select[@id='courtesycar']")
    WebElement courtesyCar;
    
	public void fillForm(ProductData productData) {
		
		populateField("text", productData.getStartDate(), startDate);
		populateField("select", productData.getInsuranceSum(), insuranceSum);
		populateField("select", productData.getMeritRating(), meritRating);
		populateField("select", productData.getDamageInsurance(), damageInsurance);
		populateField("select", productData.getCourtesyCar(), courtesyCar);
		
		for (Iterator<String> iterator = productData.getOptionalProducts().iterator(); iterator.hasNext();) {
			String optionalProduct = (String) iterator.next();
			
			if("EuroProtection".equals(optionalProduct)) {
				populateField("check", optionalProduct, euroProtection);
			}
			if("LegalDefenseInsurance".equals(optionalProduct)) {
				populateField("check", optionalProduct, legalDefenseInsurance);
			}
			
		}
		
	}
    
    
}
