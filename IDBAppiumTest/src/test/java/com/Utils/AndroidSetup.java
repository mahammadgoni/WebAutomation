package com.Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class AndroidSetup {
    @SuppressWarnings("rawtypes")
	protected static AndroidDriver driver;
    
    String appiumServiceUrl;
    
    AppiumDriverLocalService appiumService;

    @SuppressWarnings("rawtypes")
	protected void prepareAndStartAppium(String DeviceName,String UDID,String PlatformVersion,String Url) throws MalformedURLException {
    	
//    	System.out.println("Starting the Appium Server ");
//    	
//    	appiumService = AppiumDriverLocalService.buildDefaultService();
//    	
//    	appiumService.start();
//    	
//    	appiumServiceUrl = appiumService.getUrl().toString();
//    	
//    	System.out.println("Appium Server Address Url : - "+appiumServiceUrl);
//    	
        DesiredCapabilities capabilities = new DesiredCapabilities();
        
		System.out.println("Setting Up the Device Configuaration ");
        
//        capabilities.setCapability("appium-version", "1.7.1");
        
        capabilities.setCapability("platformName", "Android");
        
        capabilities.setCapability("platformVersion", PlatformVersion);
        
//        capabilities.setCapability("platformVersion", "4.4.4");
        
//        capabilities.setCapability("deviceName", "emulator-5554");
//        
//        capabilities.setCapability("udid", "emulator-5554");
//        
        capabilities.setCapability("deviceName", DeviceName);
        
        capabilities.setCapability("udid", UDID);
        
        capabilities.setCapability("app", "/Users/goni/Documents/Automation/IDBAppiumTest/apps/MyIDBCare.apk");
        
        capabilities.setCapability("appPackage", "nhs.ibd.com.nhsibd");
        
        capabilities.setCapability("appActivity", "nhs.ibd.com.nhsibd.Features.Login.FreshLogin.FreshLoginActivity");
        
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
        driver = new AndroidDriver(new URL("http://"+Url), capabilities);
        
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        
        
    }



//    protected void startAppiumServer(){
//    	
//    	System.out.println("Starting the Appium Server ");
//    	
//    	appiumService = AppiumDriverLocalService.buildDefaultService();
//    	
//    	appiumService.start();
//    	
//    	appiumServiceUrl = appiumService.getUrl().toString();
//    	
//    	System.out.println("Appium Server Address Url : - "+appiumServiceUrl);
//    	
//    	
//    	
//    }
    
//    protected void stopAppiumServer(){
//    	
//    	System.out.println("Stoping the Appium Server ");
//  
//    	appiumService.stop();
//    	
//    }
    
}
