package com.Utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class AndroidSetup {
    @SuppressWarnings("rawtypes")
	protected static AndroidDriver driver;

    @SuppressWarnings("rawtypes")
	protected void prepareAndroidForAppium() throws MalformedURLException {
    	
        DesiredCapabilities capabilities = new DesiredCapabilities();
        
        capabilities.setCapability("appium-version", "1.7.1");
        
        capabilities.setCapability("platformName", "Android");
        
        capabilities.setCapability("platformVersion", "4.4.4");
        
        capabilities.setCapability("deviceName", "Google Nexus 5");
        
        capabilities.setCapability("app", "/Users/goni/Downloads/AppiumDemo-master/apps/MyIDBCare.apk");
        
        capabilities.setCapability("appPackage", "nhs.ibd.com.nhsibd");
        
        capabilities.setCapability("appActivity", "nhs.ibd.com.nhsibd.Features.Login.FreshLogin.FreshLoginActivity");
        
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
