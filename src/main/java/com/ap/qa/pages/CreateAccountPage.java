package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.testbase.TestBase;

public class CreateAccountPage extends TestBase{
	
	@FindBy(xpath = "//h3[contains(text(), 'Create an account')]")
	WebElement createAccountTitleText;
	
	
	public CreateAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatereateAccountTitleAction() {
		return createAccountTitleText.isDisplayed();
	}

}
