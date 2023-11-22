package com.appTestNGextentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SetUpCheck {
	
	public void extentdemo() {
		ExtentReports ex = new ExtentReports();
		
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("D:\\Mphasis Training\\Selenium workspace\\ATE-Phase2-Selenium-TestNG\\extentReport\\report.html");
		ex.attachReporter(sparkreporter);
		
		ex.flush();
	}		
		@Test
		public void extentDemo2() throws IOException {

			ExtentReports ex = new ExtentReports();
			File file = new File("report1.html");

			ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
			ex.attachReporter(sparkreporter);
			ex.flush();
			
            //Automatically open the browser with reporter1
			Desktop.getDesktop().browse(new File("report1.html").toURI());	
		
		
		
		
	}

}
