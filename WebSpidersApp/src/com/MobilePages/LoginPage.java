package com.MobilePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

//	AppiumDriver<MobileElement> driver;
	
	public AndroidDriver<AndroidElement> driver;

	
	//WebElement emailId = driver.findElement(By.xpath("//android.widget.LinearLayout[@text = 'Your Email']"));
	
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@text = 'Your Email']")
	private AndroidElement emailId;
	
	@AndroidFindBy(id="nhs.ibd.com.nhsibd:id/pinFirstDigitET")
	private AndroidElement pin1;
//	
//	@FindBy(id="nhs.ibd.com.nhsibd:id/pinSecondDigitET")
//	private MobileElement pin2;
//	
//	@FindBy(id="nhs.ibd.com.nhsibd:id/pinThirdDigitET")
//	private MobileElement pin3;
//	
//	@FindBy(id="nhs.ibd.com.nhsibd:id/pinFourthDigitET")
//	private MobileElement pin4;
	 
//	MobileElement emailId = driver.findElementById("nhs.ibd.com.nhsibd:id/emailInputLayout");
//	 
//	MobileElement pin1 = driver.findElementById("nhs.ibd.com.nhsibd:id/pinFirstDigitET");
	
//	MobileElement pin2 = driver.findElementById("nhs.ibd.com.nhsibd:id/pinSecondDigitET");
//	
//	MobileElement pin3 = driver.findElementById("nhs.ibd.com.nhsibd:id/pinThirdDigitET");
//	
//	MobileElement pin4 = driver.findElementById("nhs.ibd.com.nhsibd:id/pinFourthDigitET");
	
	public LoginPage(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
		
	}
	 

	public void LoginToAccount(String email, String p1/*, String p2, String p3, String p4*/) throws InterruptedException {
		
//		MobileElement emailId = driver.findElementById("nhs.ibd.com.nhsibd:id/emailInputLayout");
		
//		MobileElement pin1 = driver.findElementById("nhs.ibd.com.nhsibd:id/pinFirstDigitET");
		
		//JavascriptExecutor js = driver;
		
		
		// Entering Email to box

		/*if (emailId.isDisplayed()) {

			emailId.sendKeys(email);

		}*/
		
		//System.out.println(emailId);
		//driver.findElement(By.xpath("//android.widget.LinearLayout[@text = 'Your Email']")).sendKeys(email);
		
		//Thread.sleep(10000);
		
		//MobileElement expEmail  = (MobileElement)(new WebDriverWait(driver,15)).until(ExpectedConditions.presenceOfElementLocated((By.xpath("//android.widget.LinearLayout[@text = 'Your Email']"))));
		
		emailId.sendKeys(email);
		
//		driver.findElementById("nhs.ibd.com.nhsibd:id/emailInputLayout").sendKeys(email);

		//js.executeScript("arguments[0].value='email';", emailId);
		
		System.out.println("User Name is : " + email);

		// Entering pin to box

		/*if (pin1.isDisplayed()) {

			pin1.sendKeys(p1);

		}*/
		
		pin1.sendKeys(p1);

		/*if (pin2.isDisplayed()) {

			pin2.sendKeys(p2);

		}*/
		
//		pin2.sendKeys(p2);
//
//	/*	if (pin3.isDisplayed()) {
//
//			pin3.sendKeys(p3);
//
//		}*/
//		
//		pin3.sendKeys(p3);
//
//		/*if (pin4.isDisplayed()) {
//
//			pin4.sendKeys(p4);
//
//		}*/
//		
//		pin4.sendKeys(p4);
//
//		System.out.println("Password is : " + p1 + p2 + p3 + p4);

	}

		
		
}

