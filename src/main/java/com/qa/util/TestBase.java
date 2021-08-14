package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties properties;
	
	public static void init() {
		
		try {
			properties = new Properties();
			String projectPath = System.getProperty("user.dir");
			FileInputStream input = new FileInputStream(projectPath + 
					"/src/main/java/com/qa/config/config.properties"
			);
			properties.load(input);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		String browser = properties.getProperty("browser");
		String projectPath = System.getProperty("user.dir");	
		
		if(driver == null) {
			
			if("chrome".equals(browser)) {
				System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			
	  	}
		driver.manage().window().maximize();
	}
	
	public void populateField(String type, String value, WebElement element) {
		
		if(! value.isEmpty()) {
	    	switch (type) {
		        case "text":
		        	element.sendKeys(value);
		            break;
		        case "select":
		        	Select select = new Select(element);
		        	select.selectByValue(value);
		            break;
		        case "check":
		        	element.sendKeys(Keys.SPACE);
	    	}
		}
	}
	
	public void clickButton(String buttonId) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement button = driver.findElement(By.id(buttonId));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
	}
	
	public boolean validateMandatoryFieldsPopulated() {
		
		boolean mandatoryFieldsPopulated = true;
		
		try {
			driver.findElement(By.xpath("//span[@class='counter zero']"));
		} catch (NoSuchElementException e) {
			mandatoryFieldsPopulated = false;
		}
		
		return mandatoryFieldsPopulated;
	}	
		
}
