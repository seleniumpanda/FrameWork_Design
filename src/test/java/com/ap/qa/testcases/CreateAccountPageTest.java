package com.ap.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ap.qa.pages.CreateAccountPage;
import com.ap.qa.pages.IndexPage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.testbase.TestBase;

public class CreateAccountPageTest extends TestBase {

	IndexPage indexpage;
	LoginPage loginpage;
	CreateAccountPage createaccountpage;

	@BeforeMethod
	public void setup() {
		launchApplication();
	}

	@Test
	public void createNewAccountPageTest() {
		SoftAssert softassert = new SoftAssert();
		indexpage = new IndexPage();
		loginpage = indexpage.clickOnSignInLinkAction();
		createaccountpage = loginpage.createAccountAction();
		boolean create = createaccountpage.validatereateAccountTitleAction();
		softassert.assertTrue(create);
		softassert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
