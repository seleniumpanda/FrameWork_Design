package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.testbase.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(css = "i.icon-heart + span")
	WebElement MyWishListButton;
	
	@FindBy(css = "i.icon-list-ol + span")
	WebElement orderHistoryandDetailsButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean wishListButtonvalidateAction() {
		return MyWishListButton.isDisplayed();
	}
	
	public boolean orderHistoryandDetailsButtonvalidateAction() {
		return orderHistoryandDetailsButton.isDisplayed();
	}
	
	

}
