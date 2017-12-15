package com.MobilePages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewAppoinment {
	
	@AndroidFindBy(id = "nhs.ibd.com.nhsibd:id/addAppointmentLayout")
	private MobileElement newAppoinment;
	
	@AndroidFindBy(id = "nhs.ibd.com.nhsibd:id/typeOfVisitSpinner")
	private MobileElement typeOfVisit;
	
	@AndroidFindBy(id = "nhs.ibd.com.nhsibd:id/dateOfVisitSpinner")
	private MobileElement dateAndTime;
	
	@AndroidFindBy(id = "nhs.ibd.com.nhsibd:id/addAppointmentBTN")
	private MobileElement addNewAppoinment;
	
	
	
	public void getNewAppointment(){
		
		
		
	}
	
	
	
	

}
