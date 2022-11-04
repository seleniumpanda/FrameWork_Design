package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.testbase.TestBase;

public class OrderPage extends TestBase {

	@FindBy(xpath = "//td[@class = 'cart_unit']/descendant::span[1]")
	WebElement unitPrice;

	@FindBy(xpath = "//td[@id = 'total_price_container']/child::span[1]")
	WebElement totalPrice;

	@FindBy(css = "button btn btn-default standard-checkout button-medium")
	WebElement proceedToCheckOutButton;

	public OrderPage() {
		PageFactory.initElements(driver, this);
	}

	public double getUnitPrice() {
		String firstunit = unitPrice.getText();
		String finalunit = firstunit.replaceAll("[^a-zA-Z0-9]", "");
		double finalunitPrice = Double.parseDouble(finalunit);
		return finalunitPrice / 100;

	}
	
	public double getTotalPrice() {
		String firstTotal = totalPrice.getText();
		String finalTotal = firstTotal.replaceAll("[^a-zA-Z0-9]", "");
		double finalTotalPrice = Double.parseDouble(finalTotal);
		return finalTotalPrice / 100;

	}
	
	public AddressPage clickOnCheckOutButtonAction() {
		proceedToCheckOutButton.click();
		return new AddressPage();
	}

}
