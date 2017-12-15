package com.TestCases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MobilePages.CreatAccount;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class IDBTestCases{
	
//	public static AppiumDriver<MobileElement> driver;
	public static AndroidDriver<AndroidElement> driver = null;
	
	public WebDriverWait wait;
	
//	public static WebDriver driver;
	
	
	
	@BeforeTest(alwaysRun = true)
	public void SetUp() {

		File classPath = new File(System.getProperty("user.dir"));

		File appDir = new File(classPath, "/APK");

		File app = new File(appDir, "MyIDBCare.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "Google Nexus 5 - 4.4.4 - API 19 - 1080x1920");

		// capabilities.setCapability("deviceName", "Hol-U19");

		capabilities.setCapability("udid", "192.168.56.101:5555"); // Give Device ID of your mobile phone

		// capabilities.setCapability("udid", "IJYHMFAIZT65CAQK");

		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("platformVersion", "4.4.4");

		capabilities.setCapability("appPackage", "nhs.ibd.com.nhsibd");

		capabilities.setCapability("appActivity", "nhs.ibd.com.nhsibd.Features.Login.FreshLogin.FreshLoginActivity");

		capabilities.setCapability("noReset", "true");

		capabilities.setCapability("app", app.getAbsolutePath());

		try {
			driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		wait = new WebDriverWait(driver, 30);
		
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		try {

			Thread.sleep(5000);
//			driver.closeApp();
			
			driver.close();

			System.out.println("Logout Success");

		} catch (Exception e) {

			System.out.println("Logout Failed");
			e.printStackTrace();

		}
	}
	

		
	
	@Test (priority = 1)
	public void AccountTest() throws InterruptedException{
		
//		CreatAccount ca = new CreatAccount();
//		
//		ca.CreateAccountTest();
//		
//		driver.findElement(By.xpath("//*[@id='registerNowLayout']")).click();
		
		driver.findElement(By.id("registerNowLayout")).click();

//		driver.findElement(By.xpath("//*[@text='Don't have an account? REGISTER NOW!']")).click();

		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("nameET")));

//		driver.findElement(By.xpath("//*[@id='nameET']")).sendKeys("Md Goni");
		
		driver.findElement(By.id("nameET")).sendKeys("Md Goni");

		driver.getKeyboard().sendKeys("{TAB}");

		driver.getKeyboard().sendKeys("skmahammad.goni@webspiders.com");

		driver.getKeyboard().sendKeys("{TAB}");

		driver.getKeyboard().sendKeys("1637");

		driver.getKeyboard().sendKeys("{TAB}");

		driver.getKeyboard().sendKeys("\\");

		driver.getKeyboard().sendKeys("{TAB}");

		driver.findElement(By.xpath("//*[@text='Select Hospital']")).click();

		driver.findElement(By.xpath("//*[@hint='Search Hospitals']")).sendKeys("Ashford Hospital");

		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Ashford Hospital']")));

		driver.findElement(By.xpath("//*[@text='Ashford Hospital']")).click();

		driver.findElement(By.xpath("//*[@text='COMPLETE REGISTRATION']")).click();

		driver.findElement(By.xpath("//*[@id='emailET']")).sendKeys("skmahammad.goni@webspiders.com");

		driver.getKeyboard().sendKeys("{TAB}");

		driver.getKeyboard().sendKeys("5045");
		
		
	}

}
