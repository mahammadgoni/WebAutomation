package com.PageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetUp.BasePageSetUp;

public class LoginPage extends BasePageSetUp {

    By userId = By.id("emailInputLayout");
    
    By password = By.id("pinFirstDigitET");

    

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage accountLogin(String userName, String pin) {
    	
		System.out.println("Clicking on  Your Email ");

        driver.findElement(userId).clear();
        
		System.out.println("Entering the Email  :"+userName);
        
        driver.findElement(userId).sendKeys(userName);
        
		System.out.println("Entering the Pin  :"+pin);
        
        driver.findElement(password).sendKeys(pin);
        
        return new LoginPage(driver);
    }
}
