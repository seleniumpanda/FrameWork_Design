package com.ap.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ap.qa.pages.IndexPage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.pages.SearchResultPage;
import com.ap.qa.testbase.TestBase;

public class SearchResultPageTest extends TestBase {

	IndexPage indexpage;
	LoginPage loginpage;
	SearchResultPage searchresultpage;

	@BeforeMethod
	public void setup() {
		launchApplication();
	}

	@Test
	public void isProductAvailableSearchTest() {
		SoftAssert softassert = new SoftAssert();
		indexpage = new IndexPage();
		loginpage = indexpage.clickOnSignInLinkAction();
		searchresultpage = indexpage.searchProductSubmitButtonAction();
		boolean availability = searchresultpage.isProductAvailableAction();
		softassert.assertTrue(availability);
		softassert.assertAll();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
