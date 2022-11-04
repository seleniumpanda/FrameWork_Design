package com.ap.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ap.qa.pages.AddToCartPage;
import com.ap.qa.pages.AddressPage;
import com.ap.qa.pages.IndexPage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.pages.OrderPage;
import com.ap.qa.pages.SearchResultPage;
import com.ap.qa.testbase.TestBase;

public class AddressPageTest extends TestBase{
	
	IndexPage indexpage;
	LoginPage loginpage;
	SearchResultPage searchresultpage;
	AddToCartPage addtocartpage;
	OrderPage orderpage;
	AddressPage addresspage;

	@BeforeMethod
	public void setup() {
		launchApplication();
	}

	@Test
	public void addressPageTest() {
		SoftAssert softassert = new SoftAssert();
		indexpage = new IndexPage();
		loginpage = indexpage.clickOnSignInLinkAction();
		searchresultpage = indexpage.searchProductSubmitButtonAction();
		addtocartpage = searchresultpage.clickOnProductAction();
		addtocartpage.enterQuantityAction();
		addtocartpage.selectSizeAction();
		addtocartpage.clickOnAddtoCartButtonAction();
		orderpage = addtocartpage.proceedToCheckOutButtonAction();
		double unitprice = orderpage.getUnitPrice();
		double totalprice = orderpage.getTotalPrice();
		double totalExpectedPrice = (unitprice * 1) + 2;
		softassert.assertEquals(totalprice, totalExpectedPrice);
		
		softassert.assertAll();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
}

}
