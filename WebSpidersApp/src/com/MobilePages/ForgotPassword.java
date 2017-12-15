package com.MobilePages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ForgotPassword {
	
	protected AndroidDriver<MobileElement> driver;
	
	MobileElement forgotPass = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Forgot your PIN?']"));
	
	MobileElement enterMail = driver.findElement(By.xpath("//android.widget.LinearLayout[@text = 'Your Email']"));
	
	MobileElement resendPin = driver.findElement(By.xpath("//android.widget.Button[@text = 'RESEND PIN']"));
	
	MobileElement errorMsg = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Please enter a valid email.']"));
	
	MobileElement goBack = driver.findElement(By.id("nhs.ibd.com.nhsibd:id/backBtnLayout"));
	
	MobileElement userNotFound = driver.findElement(By.id("nhs.ibd.com.nhsibd:id/snackbar_text"));
	
	public void ForgotPass(String fEmail){
		
		// Click on Forgot Password
		forgotPass.click();
		
		// Enter Email id 
		enterMail.sendKeys(fEmail);
		
		// Click on RESEND PIN
		
		resendPin.click();
		
		// Click on back
		
		goBack.click();
	}
	
	
	
	
	
	

}
