package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.testbase.TestBase;

public class ShippingPage extends TestBase {

	@FindBy(id = "cgv")
	WebElement checkboxTnC;

	@FindBy(name = "processCarrier")
	WebElement proceedtoCheckOutShippingButton;

	public ShippingPage() {
		PageFactory.initElements(driver, this);

	}
	
	public boolean clickOnTandCAction() {
		checkboxTnC.click();
		return checkboxTnC.isSelected();
	}
	
	public PaymentPage proceedtoCheckoutShippingPageButtonAction() {
		proceedtoCheckOutShippingButton.click();
		return new PaymentPage();
	}

}
