package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.testbase.TestBase;

public class PaymentPage extends TestBase{
	
	@FindBy(xpath = "//h1[contains(text(), 'Please choose your payment method')]")
	WebElement paymentText;
	
	@FindBy(className = "bankwire")
	WebElement payByBankWire;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean choosePayMentMethodAction() {
		return payByBankWire.isDisplayed();	
	}
	
	public OrderSummaryPage clickOnWirePaymentMethodAction() {
		payByBankWire.click();
		return new OrderSummaryPage();
	}

}
