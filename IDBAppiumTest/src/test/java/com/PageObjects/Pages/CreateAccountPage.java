package com.PageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetUp.BasePageSetUp;

public class CreateAccountPage extends BasePageSetUp{
	
  By registerNow = By.id("registerNowLayout");
  
  By fullName = By.id("nameET");
  
  By emailId = By.id("emailET");
  
  By hospitalNo = By.id("hospitalNumberET");
  
  By phoneNo = By.id("phoneET");
  
  By selectHospital = By.id("selectedHospitalTV");
  
  By searchHospital = By.id("searchHospitalACTV");
  
  By chooseHospital = By.id("nameTV");
  
  By completeReg = By.id("registerBTN");

  

  public CreateAccountPage(WebDriver driver) {
      super(driver);
  }

  public CreateAccountPage createAccount(String FullName, String EmailId, String HospitalNo, String PhoneNo, String HospitalName) {
      
  try {

		// Click on Don't have account
		
		System.out.println("Clicking on Register Now");

		driver.findElement(registerNow).click();

		// Entering Full Name
		
		System.out.println("Entering the Full Name :"+FullName);

		driver.findElement(fullName).sendKeys(FullName);
		
		// Entering Email Id
		
		System.out.println("Entering the Email :"+EmailId);

		driver.findElement(emailId).sendKeys(EmailId);

		// Entering Hospital No
		
		System.out.println("Entering the Hospital No : "+HospitalNo);

		driver.findElement(hospitalNo).sendKeys(HospitalNo);
						
		// Entering phone No
		
		System.out.println("Entering the Phone No : "+PhoneNo);

		driver.findElement(phoneNo).sendKeys(PhoneNo);
				
		// Select Hospital
		
		System.out.println("Clicking on Hospital List");

		driver.findElement(selectHospital).click();
		
		// Search Hospital
		
		System.out.println("Searching the Hospital Name : "+HospitalName);

		driver.findElement(searchHospital).sendKeys(HospitalName);
				
		// Choose the Hospital
		
		System.out.println("Choosing the Hospital");

		driver.findElement(chooseHospital).click();

		// Click on Complete Registration
		
		System.out.println("Clicking on Complete Registration Button");

		driver.findElement(completeReg).click();

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
  
  return new CreateAccountPage(driver);

 }
}
