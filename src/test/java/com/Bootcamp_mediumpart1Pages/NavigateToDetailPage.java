package com.Bootcamp_mediumpart1Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigateToDetailPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//li[contains(text(),'Price in reward points:400')]")
	private WebElement productDeatil;


	public  NavigateToDetailPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean retreiveProductDetails() {
		boolean displayStatus = productDeatil.isDisplayed();
		return displayStatus;
	}
	
	
	
	
	
	
}
