package com.BaseSetup;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseSetUp {

	public AppiumDriver<MobileElement> driver;
	
//	public WebDriver driver;

	@BeforeClass(alwaysRun = true)
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
//			driver.closeApp();
			
			driver.quit();

			System.out.println("Logout Success");

		} catch (Exception e) {

			System.out.println("Logout Failed");
			e.printStackTrace();

		}
	}

}
