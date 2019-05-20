package com.inetBanking.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws  InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		logger.info("user Name provided");
		lp.setUserName(username);
		logger.info("Password provided");

		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		AddCustomerPage addCustomerPage=new AddCustomerPage(driver);
		

		addCustomerPage.ClickAddNewCustomer();
		logger.info("Enter customer name");
		addCustomerPage.custName("Rohit");
		logger.info("click Gender");
		addCustomerPage.custgender("Male");
		logger.info(" Enter Date of Birth");
		addCustomerPage.custdob("12","12", "1995");
		logger.info("Enter Address");
		addCustomerPage.custadd("Gomti nagar");
		logger.info("Enter State");
		addCustomerPage.custstate("Bihar");
		logger.info("Enter City");
		addCustomerPage.custcity("Patna");
		logger.info("Enter Pin");
		addCustomerPage.custpin(200169);
		logger.info("Enter contact number");
		addCustomerPage.custtelephoneno("9599256132");
		logger.info("Enter EmailId");
		String email=randomstring()+"@gmail.com";

		addCustomerPage.custemailid(email);
		logger.info("Enter Password");
		addCustomerPage.custpassword("abcds");
		addCustomerPage.custbtnsubmit();
		
		Thread.sleep(3000);
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test cases passed");
		}
		else {
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			logger.warn("Failed cases ");
		}
		
	
	}
	

}
