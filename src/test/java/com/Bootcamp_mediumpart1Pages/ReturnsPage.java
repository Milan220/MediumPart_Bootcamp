package com.Bootcamp_mediumpart1Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnsPage {
	
	public WebDriver driver;
	
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameBox;

	public ReturnsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean retreiveFirstNameBox() {
		boolean displayStatus = firstNameBox.isDisplayed();
		return displayStatus;
	}
	
	
	
	
	
}
