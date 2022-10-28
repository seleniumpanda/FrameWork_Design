package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.qa.pages.CreateAccountPage;
import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.IndexPage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {
	
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	CreateAccountPage createaccountpage;
	
	@BeforeMethod
	public void setup() {
		launchApplication();
		indexpage = new IndexPage();
		loginpage = new LoginPage();
		
	}
	
	@Test(priority = 1)
	public void validateLoginPageTitleTest() {
		String loginpageTitle = loginpage.loginPageTitleAction();
		Assert.assertEquals(loginpageTitle, "My Store");
	}

	@Test(priority = 2)
	public void validateLoginPageCurrentUrlTest() {
		String loginPageCurrentUrl = loginpage.loginPageCurrentUrlAction();
		Assert.assertEquals(loginPageCurrentUrl, "http://automationpractice.com/index.php");
	}
	
	@Test(priority = 3)
	public void loginTest() {
		homepage = loginpage.loginAction();
	}
	
	@Test(priority = 4)
	public void createNewAccountTest() {
		createaccountpage = loginpage.createAccountAction();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
