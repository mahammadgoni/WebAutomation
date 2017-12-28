package com.TestCases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjects.Pages.ChnageMyPin;
import com.PageObjects.Pages.CreateAccountPage;
import com.PageObjects.Pages.LoginPage;
import com.PageObjects.Pages.MyHospitalName;
import com.PageObjects.Pages.MyProfile;
import com.Utils.AndroidSetup;
import com.Utils.ScreenRecorder;

public class IDBTestCases extends AndroidSetup {

	ScreenRecorder sr = new ScreenRecorder();

	// @Parameters({"DeviceName", "UDID", "PlatformVersion", "Url"})
	@BeforeClass
	public void setUp() throws Exception {
		sr.StartRecord();

		prepareAndStartAppium("Google Nexus 5", "192.168.57.101:5555", "6.0", "127.0.0.1:4723/wd/hub");

	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
		sr.StopRecord();

	}

	@Test(priority = 1)
	public void inValidLoginTest() throws InterruptedException {
		System.out.println("Executing Invalid Login Test");
		new LoginPage(driver).accountLogin("fatma@mailinator.com", "4700");
	}

	@Test(priority = 2)
	public void validLoginTest() throws InterruptedException {
		System.out.println("Executing Valid Login Test");
		new LoginPage(driver).accountLogin("fatman@mailinator.com", "4700");
	}

	@Test(priority = 3)
	public void changeMyNameAndPhoneNoTest() throws InterruptedException, MalformedURLException {
		
		System.out.println("Executing Change My Name and Phone No Test");
		prepareAndStartAppium("Google Nexus 5", "192.168.57.101:5555", "6.0", "127.0.0.1:4723/wd/hub");
		new MyProfile(driver).changeMynameAndPhoneNo("fatman@mailinator.com", "4700", "Kavin P", "01234567890");
	}

	@Test(priority = 4)
	public void changeMyPinNoTest() throws InterruptedException, MalformedURLException {
		System.out.println("Executing Change My No Test");
		prepareAndStartAppium("Google Nexus 5", "192.168.57.101:5555", "6.0", "127.0.0.1:4723/wd/hub");
		new ChnageMyPin(driver).chnageMyPin("fatman@mailinator.com", "4700", "1234");
	}
	@Test(priority = 5)
	public void changeHospitalNameTest() throws InterruptedException, MalformedURLException {
		System.out.println("Executing Change Hospital Name Test");
		prepareAndStartAppium("Google Nexus 5", "192.168.57.101:5555", "6.0", "127.0.0.1:4723/wd/hub");
		new MyHospitalName(driver).myHospital("fatman@mailinator.com", "1234", "Royal");
	}

	@Test(priority = 6)
	public void createAccountWithInvalidDetailsTest() throws InterruptedException, MalformedURLException {
		System.out.println("Executing Create Account With Invalid Details Test");
		prepareAndStartAppium("Google Nexus 5", "192.168.57.101:5555", "6.0", "127.0.0.1:4723/wd/hub");
		new CreateAccountPage(driver).createAccount("Abc Bd", "abc@gmail.com", "2345", "", "Royal");
	}



}
