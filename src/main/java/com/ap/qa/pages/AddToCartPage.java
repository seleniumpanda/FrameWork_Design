package com.ap.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ap.qa.testbase.TestBase;

public class AddToCartPage extends TestBase{
	
	@FindBy(id = "quantity_wanted")
	WebElement quantity;
	
	
	@FindBy(id = "group_1")
	WebElement size;
	
	@FindBy(xpath = "//button[@class = 'exclusive']")
	WebElement addToCartButton;
	
	@FindBy(xpath = "//span[@class = 'cross']/following-sibling::h2[1]")
	WebElement addedProductConfirmationText;
	
	@FindBy(css = "a.btn.btn-default.button.button-medium")
	WebElement proceedToCheckOutButton;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterQuantityAction() {
		quantity.clear();
		quantity.sendKeys("1");
	}
	
	public void selectSizeAction() {
		Select select = new Select(driver.findElement(By.id("group_1")));
		select.selectByVisibleText("L");
	}
	
	public boolean clickOnAddtoCartButtonAction() {
		addToCartButton.click();
		return addedProductConfirmationText.isDisplayed();
	}
	
	public OrderPage proceedToCheckOutButtonAction() {
		proceedToCheckOutButton.click();
		return new OrderPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
