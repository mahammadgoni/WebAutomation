package com.TestCases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MobilePages.LoginPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SmokeTest {

	AndroidDriver<MobileElement> driver;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@text = 'Your Email']")
	private MobileElement emailId;
	
	@AndroidFindBy(id="nhs.ibd.com.nhsibd:id/pinFirstDigitET")
	private MobileElement pin1;
	
	private LoginPage login;
	
	public SmokeTest(AndroidDriver<MobileElement> driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
		
//		PageFactory.initElements(driver, this);
		
	}

	@BeforeTest (alwaysRun= true)
	public void SetUp() {

		File classPath = new File(System.getProperty("user.dir"));

		File appDir = new File(classPath, "/APK");

		File app = new File(appDir, "MyIDBCare.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "Google Nexus 5 - 4.4.4 - API 19 - 1080x1920");

		// capabilities.setCapability("deviceName", "Hol-U19");

		capabilities.setCapability("udid", "192.168.56.101:5555"); 

		// capabilities.setCapability("udid", "IJYHMFAIZT65CAQK");

		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("platformVersion", "4.4.4");

		capabilities.setCapability("appPackage", "nhs.ibd.com.nhsibd");

		capabilities.setCapability("appActivity", "nhs.ibd.com.nhsibd.Features.Login.FreshLogin.FreshLoginActivity");

		capabilities.setCapability("noReset", "true");

		capabilities.setCapability("app", app.getAbsolutePath());

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {

		try {

			Thread.sleep(5000);
			driver.closeApp();

			System.out.println("Logout Success");

		} catch (Exception e) {

			System.out.println("Logout Failed");
			e.printStackTrace();

		}
	}

	@Test(priority = 1)
	public void loginTest() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		emailId.sendKeys("skmahammad.goni@webspiders.com");
//		Thread.sleep(5000);
//		pin1.sendKeys("5045");

		try {
			
			login.LoginToAccount("skmahammad.goni@webspiders.com", "5045");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}

}
