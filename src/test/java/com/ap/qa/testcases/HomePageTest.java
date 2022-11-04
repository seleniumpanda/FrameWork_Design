package com.ap.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.IndexPage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.testbase.TestBase;

public class HomePageTest extends TestBase {
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;

	@BeforeMethod
	public void setup() {
		launchApplication();
	}

	@Test
	public void wishlistButtonValidateTest() {
		SoftAssert softassert = new SoftAssert();
		indexpage = new IndexPage();
		loginpage = indexpage.clickOnSignInLinkAction();
		homepage = loginpage.loginAction();
		boolean wish = homepage.wishListButtonvalidateAction();
		softassert.assertTrue(wish);
		softassert.assertAll();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
