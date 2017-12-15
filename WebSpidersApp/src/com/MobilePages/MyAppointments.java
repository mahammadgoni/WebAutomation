package com.MobilePages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyAppointments {
	
	
	public AndroidDriver<AndroidElement> driver;
	
	@AndroidFindBy(className = "android.widget.ImageButton")
	private AndroidElement clickOnMenu;
	
	@AndroidFindBy(id = "nhs.ibd.com.nhsibd:id/closeButtonLayout")
	private AndroidElement closePopUpButton;
	
	@AndroidFindBy(id = "	nhs.ibd.com.nhsibd:id/addAppointmentBTN")
	private AndroidElement addNewAppointment;
	
	@AndroidFindBy(id = "nhs.ibd.com.nhsibd:id/typeOfVisitSpinner")
	private MobileElement typeOfVisit;
	
	@AndroidFindBy(id = "nhs.ibd.com.nhsibd:id/dateOfVisitSpinner")
	private MobileElement dateAndTime;
	
		

}
