package com.MobilePages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomePage {
	
	public AndroidDriver<AndroidElement> driver;
	
//	AndroidElement dashboard = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.view.View/android.widget.TextView"));
	
	AndroidElement loggedUserName = driver.findElement(By.id("userNameTV"));
	
	
	public void verifyHomePage(String ActTitle){
		
		String ExpTitle = driver.getContext();
		
		if (ActTitle==ExpTitle) {
			
			System.out.println("Home Page Successfuly Loaded !");
			
		} else {
			
			System.out.println("This is not Home Page !");

		}		
		
		
		
		
	}

}
