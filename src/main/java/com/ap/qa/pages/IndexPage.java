package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.testbase.TestBase;

public class IndexPage extends TestBase {

	// "yourLogo - a new experience"
	@FindBy(css = "img.logo.img-responsive")
	WebElement logoIcon;

	// SignInLink
	@FindBy(className = "login")
	WebElement signInLink;

	// SearchProductBox
	@FindBy(id = "search_query_top")
	WebElement searchProductBox;

	// searchProductSubmitButton
	@FindBy(name = "submit_search")
	WebElement searchProductButton;
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogoIconAction() {
		return logoIcon.isDisplayed();
	}
	
	public String validateIndexPageTitleAction() {
		return driver.getTitle();
	}
	
	public String validateIndexPageCurentUrlAction() {
		return driver.getCurrentUrl();
	}
	
	public boolean searchproductBoxAction() {
		return (searchProductBox.isEnabled() && searchProductBox.isDisplayed());
	}
	
	public SearchResultPage searchProductSubmitButtonAction() {
		searchProductBox.sendKeys("T-Shirt");
		searchProductButton.click();
		return new SearchResultPage();
	}
	
	
	public LoginPage clickOnSignInLinkAction() {
		signInLink.click();
		return new LoginPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
