package com.ohrm.tests;

import com.ohrm.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
 
	@BeforeMethod
	protected void setUp()
	{
		Driver.initDriver();
	}
	@AfterMethod
	protected void tearDown(){
		Driver.quitDriver();
	}

}
