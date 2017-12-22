package com.PageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetUp.BasePageSetUp;

public class LoginPage extends BasePageSetUp {
//    By userId = By.id("mobileNo");
//    By password = By.id("et_password");
//    By login_Button = By.id("btn_mlogin");
//    By existingUser_login = By.id("btn_mlogin");
    
    By userId = By.id("emailInputLayout");
    By password = By.id("pinFirstDigitET");
//    By login_Button = By.id("btn_mlogin");
//    By existingUser_login = By.id("btn_mlogin");
    

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage accountLogin(String userName, String pin) {
//        waitForVisibilityOf(existingUser_login);
//        driver.findElement(existingUser_login).click();
        driver.findElement(userId).clear();
        driver.findElement(userId).sendKeys(userName);
        driver.findElement(password).sendKeys(pin);
//        driver.findElement(login_Button).click();
//        Assert.assertTrue(driver.findElement(By.id("userNameTV")).getText().equalsIgnoreCase("Sk Goni"));
        return new LoginPage(driver);
    }
}
