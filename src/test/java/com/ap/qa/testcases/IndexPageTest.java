package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.qa.pages.IndexPage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.pages.SearchResultPage;
import com.ap.qa.testbase.TestBase;

public class IndexPageTest extends TestBase {

	IndexPage indexpage;
	LoginPage loginpage;
	SearchResultPage searchresultpage;

	@BeforeMethod
	public void setup() {
		launchApplication();
		indexpage = new IndexPage();
	}

	@Test(priority = 1)
	public void validateLogoIconTest() {
		boolean logoPresence = indexpage.validateLogoIconAction();
		Assert.assertTrue(logoPresence);
	}

	@Test(priority = 2)
	public void validateIndexPageTitleTest() {
		String indexPageTitle = indexpage.validateIndexPageTitleAction();
		Assert.assertEquals(indexPageTitle, "My Store");
	}

	@Test(priority = 3)
	public void validateIndexPageCurrentUrlTest() {
		String indexPageCurrentUrl = indexpage.validateIndexPageCurentUrlAction();
		Assert.assertEquals(indexPageCurrentUrl, "http://automationpractice.com/index.php");
	}

	@Test(priority = 4)
	public void searchProductBoxTest() {
		boolean searchProd = indexpage.searchproductBoxAction();
		Assert.assertTrue(searchProd);
	}

	@Test(priority = 5)
	public void clickOnSignInLinkTest() {
		loginpage = indexpage.clickOnSignInLinkAction();
	}

	@Test(priority = 6)
	public void searchProductSubmitButtonTest() {
		searchresultpage = indexpage.searchProductSubmitButtonAction();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
