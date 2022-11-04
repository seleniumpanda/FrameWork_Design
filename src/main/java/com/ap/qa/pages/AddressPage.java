package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.testbase.TestBase;

public class AddressPage extends TestBase{
	
	
	@FindBy(name = "processAddress")
	WebElement proceedToCheckOutButton;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ShippingPage clickOnCheckOutAddressButtonAction() {
		proceedToCheckOutButton.click();
		return new ShippingPage();
	}

}
