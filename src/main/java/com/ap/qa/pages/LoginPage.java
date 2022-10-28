package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id = "email")
	WebElement username;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(id = "SubmitLogin")
	WebElement signInButton;
	
	@FindBy(id = "email_create")
	WebElement emailforNewAccount;
	
	@FindBy(id = "SubmitCreate")
	WebElement createNewAccountButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginPageTitleAction() {
		return driver.getTitle();
	}
	
	public String loginPageCurrentUrlAction() {
		return driver.getCurrentUrl();
	}
	
	public HomePage loginAction() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		signInButton.click();
		return new HomePage();
	}
	
	
	public CreateAccountPage createAccountAction() {
		emailforNewAccount.sendKeys(prop.getProperty("newemail"));
		createNewAccountButton.click();
		return new CreateAccountPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
