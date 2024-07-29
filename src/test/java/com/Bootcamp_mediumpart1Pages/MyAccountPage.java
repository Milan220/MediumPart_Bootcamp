package com.Bootcamp_mediumpart1Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	public WebDriver driver;
	
	
	

	@FindBy(xpath = "//h2[text()='My Orders']")
	private WebElement myOrdersLink;
	
	public MyAccountPage  (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean retreiveMyOrdersLink() {
		boolean displayStatus = myOrdersLink.isDisplayed();
		return displayStatus;
	}
	
	

}
