package com.TestCases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjects.Pages.CreateAccountPage;
import com.PageObjects.Pages.LoginPage;
import com.Utils.AndroidSetup;

public class IDBTestCaes extends AndroidSetup{
	
	
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test (priority = 1)
    public void validLoginTest() throws InterruptedException {
        new LoginPage(driver).accountLogin("fatma@mailinator.com", "4700");
    }
    
    @Test (priority = 2)
    public void inValidLoginTest() throws InterruptedException {
        new LoginPage(driver).accountLogin("fatman@mailinator.com", "4700");
    }
    
    @Test (priority = 3)
    public void createAccountTest() throws InterruptedException, MalformedURLException {
    	prepareAndroidForAppium();
    	new CreateAccountPage(driver).createAccount("  ", "", "", "", "");
    }

}
