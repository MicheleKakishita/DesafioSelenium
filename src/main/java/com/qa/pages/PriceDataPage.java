package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.model.PriceData;
import com.qa.util.TestBase;

public class PriceDataPage extends TestBase{
	
	
	public PriceDataPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="selectsilver")
	WebElement silver;
	
	@FindBy(id="selectgold")
	WebElement gold;
	
	@FindBy(id="selectplatinum")
	WebElement platinum;
	
	@FindBy(id="selectultimate")
	WebElement ultimate;
    
	public void fillForm(PriceData priceData) {
		
		if("selectsilver".equals(priceData.getPriceOption())) {
			populateField("check", priceData.getPriceOption(), silver);
		}
		
		if("selectgold".equals(priceData.getPriceOption())) {
			populateField("check", priceData.getPriceOption(), gold);
		}
		
		if("selectplatinum".equals(priceData.getPriceOption())) {
			populateField("check", priceData.getPriceOption(), platinum);
		}
		
		if("selectultimate".equals(priceData.getPriceOption())) {
			populateField("check", priceData.getPriceOption(), ultimate);
		}
		
	}
}
