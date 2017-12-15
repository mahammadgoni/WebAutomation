package com.Utils;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TestRecorder {
	
	
	ATUTestRecorder recorder;
	
	String videoDir = "RecordedTest";
	
	
	public void StartRecord() throws ATUTestRecorderException{
		
		new File(videoDir).mkdir();
		
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		
		Date date = new Date();
		
		recorder = new ATUTestRecorder("RecordedTest", "TestRecord-"+ dateFormat.format(date), false);
		
		recorder.start();
	
		
	}
	
	public void StopRecord() throws ATUTestRecorderException{
		
		recorder.stop();
	}

}
