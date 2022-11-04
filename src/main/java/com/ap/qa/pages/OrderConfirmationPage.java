package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.testbase.TestBase;

public class OrderConfirmationPage extends TestBase {

	
	@FindBy(xpath = "//h1[contains(text(), 'Order confirmation')]")
	WebElement orderConfirmationLogo;
	
	@FindBy(xpath = "//strong[contains(text(), 'Your order on My Store is complete.')]")
	WebElement messageConfirmationMySIC;
	
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean orderconfirmationLogoValidationAction() {
		return orderConfirmationLogo.isDisplayed();
	}
	
	public String messageConfirmationAction() {
		String messageConfirmation = messageConfirmationMySIC.getText();
		return messageConfirmation;
	}
}
