package com.Bootcamp_mediumpart1Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCardPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//td[@class = 'text-center']/following::img")
	private WebElement productImage;
	
	@FindBy(css = "a.btn.btn-primary")
	private WebElement clickOncheckout;
	
	public ShoppingCardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean retreiveProductImage() {
		boolean displayStatus = productImage.isDisplayed();
		return  displayStatus;
	}
	
	public void clickOnCheckoutButton() {
		clickOncheckout.click();
		
	}
	
	
	
	
	

}
