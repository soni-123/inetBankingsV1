package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.inetBanking.pageObjects.EditCustomer;
import com.inetBanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass {
	@Test
	public void editCustomer() throws  InterruptedException, IOException
	{
	LoginPage lp=new LoginPage(driver);
	logger.info("user Name provided");
	lp.setUserName(username);
	logger.info("Password provided");

	lp.setPassword(password);
	lp.clickSubmit();
	Thread.sleep(3000);
	EditCustomer editCustomer=new EditCustomer(driver);
	editCustomer.ClickEditCustomer();
	logger.info("Edit customer link clicked");
	editCustomer.custId("76968");
	logger.info("Enter customer id");
	editCustomer.custAccSubmit();
	Thread.sleep(3000);
	boolean res=driver.getPageSource().contains("Edit Customer");
	
	if(res==true)
	{
		Assert.assertTrue(true);
		logger.info("Test cases passed");
	}
	else {
		captureScreen(driver,"EditCustomer");
		Assert.assertTrue(false);
		logger.warn("Failed cases ");
	}
	
	}
}
