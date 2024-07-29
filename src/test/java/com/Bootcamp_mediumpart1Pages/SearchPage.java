package com.Bootcamp_mediumpart1Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//img[@title ='HP LP3065']")
	private WebElement productImage;
	
	@FindBy(linkText = "HP LP3065")
	private WebElement productDeatil;
	
	public SearchPage  (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean retreiveProduct() {
		boolean displayStatus = productImage.isDisplayed();
		return displayStatus;
		
	}
	
	public void clickOnProductDeatail() {
		 productDeatil.click();
	}

}
