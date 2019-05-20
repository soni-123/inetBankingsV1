package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer {
	WebDriver Idriver;
	 public EditCustomer(WebDriver rdriver)
	 {
		 Idriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 @FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[3]/a") 
	 @CacheLookup 	
	 WebElement lnkEditCustomer;
		
	 @FindBy(how=How.NAME, using="cusid") 
	 @CacheLookup 	
	 WebElement txtcusid;
		
		@FindBy(how=How.NAME,using="AccSubmit") 
		@CacheLookup 	
		WebElement btnaccsubmit;
		
		
		public void ClickEditCustomer()
		{
			lnkEditCustomer.click();
		}
		
		public void custId(String cid)
		{
			txtcusid.sendKeys(cid);
		}
		
		public void custAccSubmit()
		{
			btnaccsubmit.click();
		}
		
		
		

}
