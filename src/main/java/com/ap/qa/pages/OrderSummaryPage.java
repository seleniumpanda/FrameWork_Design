package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.testbase.TestBase;

public class OrderSummaryPage extends TestBase{
	
	@FindBy(css = "button.button.btn.btn-default.button-medium")
	WebElement iconfirmMyOrderButton;
	
	public OrderSummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderConfirmationPage clickOniConfirmMyOrderAction() {
		iconfirmMyOrderButton.click();
		return new OrderConfirmationPage();
	}

}
