package com.qa.stepdefinitions;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.model.InsurantData;
import com.qa.model.PriceData;
import com.qa.model.ProductData;
import com.qa.model.QuoteData;
import com.qa.model.VehicleData;
import com.qa.pages.InsurantDataPage;
import com.qa.pages.PriceDataPage;
import com.qa.pages.ProductDataPage;
import com.qa.pages.QuoteDataPage;
import com.qa.pages.VehicleDataPage;
import com.qa.util.TestBase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VehicleInsuranceSteps extends TestBase {
	
	VehicleDataPage vehicleDataPage = new VehicleDataPage();
	InsurantDataPage insurantDataPage = new InsurantDataPage();
	ProductDataPage productDataPage = new ProductDataPage();
	PriceDataPage priceDataPage = new PriceDataPage();
	QuoteDataPage quoteDataPage = new QuoteDataPage();
	
	@Before
	public static void setup() {
		 TestBase.init();
	}

	@Given("^user is on vehicle insurance application$")
	public void user_is_on_vehicle_insurance_application() {
		driver.navigate().to(properties.getProperty("url"));
	}
	
	@And("^user is on automobile form$")
	public void user_is_on_automobile_form() {
		driver.findElement(By.id(properties.getProperty("vehicletype"))).click();
	}	

	@When("^user populates the (.*)$")
	public void user_populates_the_form(String formId, DataTable formData) {
		
		Map<String, String> formMap = formData.asMap(String.class, String.class);
		
		switch (formId) {
	        case "entervehicledata":
	        	
	        	VehicleData vehicleData = new VehicleData();
	        	
	    		for (String key : formMap.keySet()) {
	    			if("make".equals(key)) {
	    				vehicleData.setMake(formMap.get(key));
	    			}
	    			if("engineperformance".equals(key)) {
	    				vehicleData.setEnginePerformance(formMap.get(key));
	    			}
	    			if("dateofmanufacture".equals(key)) {
	    				vehicleData.setDateOfManufacture(formMap.get(key));
	    			}
	    			if("numberofseats".equals(key)) {
	    				vehicleData.setNumberOfSeats(formMap.get(key));
	    			}
	    			if("fuel".equals(key)) {
	    				vehicleData.setFuel(formMap.get(key));
	    			}
	    			if("listprice".equals(key)) {
	    				vehicleData.setListPrice(formMap.get(key));
	    			}
	    			if("licenseplatenumber".equals(key)) {
	    				vehicleData.setLicensePlateNumber(formMap.get(key));
	    			}
	    			if("annualmileage".equals(key)) {
	    				vehicleData.setAnnualMileage(formMap.get(key));
	    			}	    			
	    			
	    		}
	        	vehicleDataPage.fillForm(vehicleData);
	            break;
	        case "enterinsurantdata":
	        	
	        	InsurantData insurantData = new InsurantData();	  
	        	
	    		for (String key : formMap.keySet()) {
	    			if("firstname".equals(key)) {
	    				insurantData.setFirstName(formMap.get(key));
	    			}
	    			if("lastname".equals(key)) {
	    				insurantData.setLastName(formMap.get(key));
	    			}
	    			if("birthdate".equals(key)) {
	    				insurantData.setBirthDate(formMap.get(key));
	    			}
	    			if("gender".equals(key)) {
	    				insurantData.setGender(formMap.get(key));
	    			}
	    			if("streetaddress".equals(key)) {
	    				insurantData.setStreetAddress(formMap.get(key));
	    			}
	    			if("country".equals(key)) {
	    				insurantData.setCountry(formMap.get(key));
	    			}
	    			if("zipcode".equals(key)) {
	    				insurantData.setZipcode(formMap.get(key));
	    			}
	    			if("city".equals(key)) {
	    				insurantData.setCity(formMap.get(key));
	    			}
	    			if("occupation".equals(key)) {
	    				insurantData.setOccupation(formMap.get(key));
	    			}
	    			if("hobbies".equals(key)) {
	    				
	    				String[] fieldValues = formMap.get(key).split(";");
	    				List<String> hobbies = new ArrayList<String>();
	    				
	    				for (int i = 0; i < fieldValues.length; i++) {
	    					hobbies.add(fieldValues[i]);
						}
	    				
	    				insurantData.setHobbies(hobbies);
	    			}	    			
	    		}
	    		insurantDataPage.fillForm(insurantData);
	            break;
	        case "enterproductdata":
	        	
	        	ProductData productData = new ProductData();	
	        	
	    		for (String key : formMap.keySet()) {
	    			if("startdate".equals(key)) {
	    				productData.setStartDate(formMap.get(key));
	    			}
	    			if("insurancesum".equals(key)) {
	    				productData.setInsuranceSum(formMap.get(key));
	    			}
	    			if("meritrating".equals(key)) {
	    				productData.setMeritRating(formMap.get(key));
	    			}
	    			if("damageinsurance".equals(key)) {
	    				productData.setDamageInsurance(formMap.get(key));
	    			}	    			
	    			if("courtesycar".equals(key)) {
	    				productData.setCourtesyCar(formMap.get(key));
	    			}
	    			
	    			if("optionalproducts".equals(key)) {
	    				String[] fieldValues = formMap.get(key).split(";");
	    				List<String> optionalProducts = new ArrayList<String>();
	    				
	    				for (int i = 0; i < fieldValues.length; i++) {
	    					optionalProducts.add(fieldValues[i]);
						}
	    				productData.setOptionalProducts(optionalProducts);
	    			}	    			
	    		}
	    		productDataPage.fillForm(productData);	        	
	        	
	            break;  
	        case "selectpriceoption":
	        	
	        	PriceData priceData = new PriceData();	
	        	
	    		for (String key : formMap.keySet()) {
	    			if("priceoption".equals(key)) {
	    				priceData.setPriceOption(formMap.get(key));
	    			}
	    		}
	    		priceDataPage.fillForm(priceData);		        	
	        	
	            break; 
	        case "sendquote":
	        	
	        	QuoteData quoteData = new QuoteData();	
	        	
	    		for (String key : formMap.keySet()) {
	    			if("email".equals(key)) {
	    				quoteData.setEmail(formMap.get(key));
	    			}
	    			if("phone".equals(key)) {
	    				quoteData.setPhone(formMap.get(key));
	    			}
	    			if("username".equals(key)) {
	    				quoteData.setUsername(formMap.get(key));
	    			}
	    			if("password".equals(key)) {
	    				quoteData.setPassword(formMap.get(key));
	    			}
	    			
	    			if("confirmpassword".equals(key)) {
	    				quoteData.setConfirmPassword(formMap.get(key));
	    			}	    			
    			
	    		}
	    		quoteDataPage.fillForm(quoteData);	 	        	
	        	
	            break;             
	        default:
	            fail("Invalid form " + formId);
		}

	}
	
	@And("^all mandatory fields are populated$")
	public void all_mandatory_fields_populated() {
		boolean mandatoryFieldsPopulated =  validateMandatoryFieldsPopulated();
		
		if(!mandatoryFieldsPopulated) {
			fail("Not all mandatory fields are correctly populated. Please validate the inputs defined");
		}
	}	

	@Then("^user hits (.*) and go to next step$")
	public void hits_next(String buttonId) {
		clickButton(buttonId);
	}
	
	
	@And("^success (.*) is displayed$")
	public void success_message_displayed(String message) {
		
		String selector = "body > div.sweet-alert.showSweetAlert.visible > h2";
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
		WebElement successMessageElement = driver.findElement(By.cssSelector(selector));
		String successMessage = successMessageElement.getText();
		if (message.equals(successMessage)) {
			System.out.println("Finished successfully");
		} else {
			fail("Finished with error");
		}
		driver.close();
	}

}
