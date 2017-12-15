package com.MobilePages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CreatAccount {
	
	public static AndroidDriver<AndroidElement> driver = null;
	
	public WebDriverWait wait;
	
//	public WebDriver driver;
	
	
//	String registerNow  = "nhs.ibd.com.nhsibd:id/registerNowTV";
//	
//	String fullName  = "nhs.ibd.com.nhsibd:id/nameET";
//	
//	String emailId  = "nhs.ibd.com.nhsibd:id/emailET";
//
//	String hospitalNo  = "nhs.ibd.com.nhsibd:id/hospitalNumberET";
//	
//	String phoneNo  = "nhs.ibd.com.nhsibd:id/phoneET";
//	
//	String selectHospital  = "nhs.ibd.com.nhsibd:id/hospitalNumberInputLayout";
//	
//	String searchHospital  = "nhs.ibd.com.nhsibd:id/searchHospitalACTV";
//	
//	String chooseHospital  = "//android.widget.RelativeLayout[@bounds = '[132,600][948,729]']";
//	
//	String completeReg  = "nhs.ibd.com.nhsibd:id/registerBTN";
	
	
//	MobileElement registerNow = (MobileElement) driver.findElement(By.id("nhs.ibd.com.nhsibd:id/registerNowTV"));
	
//	MobileElement registerNow = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView"));
	
	MobileElement registerNow = driver.findElement(By.name("Don't have an account? REGISTER NOW!"));
	
	MobileElement fullName = driver.findElement(By.id("nhs.ibd.com.nhsibd:id/nameET"));
	
//	MobileElement fullName = driver.findElement(By.xpath("//android.widget.LinearLayout[@text = 'Full Name']"));
	
//	MobileElement fullName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	MobileElement emailId = driver.findElement(By.id("nhs.ibd.com.nhsibd:id/emailET"));
	
//	MobileElement emailId = driver.findElement(By.xpath("//android.widget.LinearLayout[@text = 'Your Email']"));
	
//	MobileElement emailId = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
//	MobileElement hospitalNo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	MobileElement hospitalNo = driver.findElement(By.id("nhs.ibd.com.nhsibd:id/hospitalNumberET"));
	
	MobileElement phoneNo = driver.findElement(By.id("nhs.ibd.com.nhsibd:id/phoneET"));
	
//	MobileElement phoneNo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.EditText"));
	
	MobileElement selectHospital = driver.findElement(By.id("nhs.ibd.com.nhsibd:id/hospitalNumberInputLayout"));
	
//	MobileElement selectHospital = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
	
	MobileElement searchHospital = driver.findElement(By.id("nhs.ibd.com.nhsibd:id/searchHospitalACTV"));
	
//	MobileElement searchHospital = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));
	
	MobileElement chooseHospital = driver.findElement(By.xpath("//android.widget.RelativeLayout[@bounds = '[132,600][948,729]']"));
	
//	MobileElement chooseHospital = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]"));
	
	MobileElement completeReg = driver.findElement(By.id("nhs.ibd.com.nhsibd:id/registerBTN"));
	
//	MobileElement completeReg = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.Button"));

	
//	@Test
	public void CreateAccountTest(/*String fName, String email, String hosNo, String hosName, String phNo*/){
		
//	
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(registerNow)));
//		driver.findElementById(registerNow).click();
//		
		// Click on Don't have account
		
		if (registerNow.isDisplayed()) {
			
			
			
			registerNow.click();
			
			System.out.println("Clicked on Register Now");
			
		}
		
		
		
		// Entering Full Name
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(fullName)));
//		driver.findElementById(fullName).sendKeys("Sk Goni");
		
		fullName.sendKeys("Sk Goni");
		
		// Entering Email Id 
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(emailId)));
//		driver.findElementById(emailId).sendKeys("skmahammad.goni@webspiders.com");
//		
		
		emailId.sendKeys("skmahammad.goni@webspiders.com");
		
		// Entering Hospital No
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(hospitalNo)));
//		driver.findElementById(hospitalNo).sendKeys("1637");
//		
		hospitalNo.sendKeys("1637");
		
		// Entering phone No
		
	    try {
	    	
//	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id(phoneNo)));
//			driver.findElementById(phoneNo).sendKeys("");
	    	
	    	
	    	phoneNo.sendKeys("");
			
		} catch (Exception e) {
			
		}
	    
	    // Select Hospital
	    
//	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id(selectHospital)));
//		driver.findElementById(selectHospital).click();
	    
	    selectHospital.click();
	    
	    // Search Hospital
	    
//	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id(searchHospital)));
//		driver.findElementById(searchHospital).sendKeys("Ashford Hospiatl");
	    
	    searchHospital.sendKeys("Ashford Hospiatl");
	    
	    // Choose the Hospital
	    
//	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(chooseHospital)));
//		driver.findElementByXPath(chooseHospital).click();
//	    
	    chooseHospital.click();
	    
	    // Click on Complete Registration 
	    
//	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id(completeReg)));
//		driver.findElementById(completeReg).click();
	    
	    completeReg.click();
	    
	
	
	
	
}
}
