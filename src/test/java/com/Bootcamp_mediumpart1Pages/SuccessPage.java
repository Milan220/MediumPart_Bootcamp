package com.Bootcamp_mediumpart1Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//h1[text() = 'Your Account Has Been Created!']")
	private WebElement createAccoutText;
	
	public SuccessPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateAccountSuccessMessage() {
		boolean displayStatus = createAccoutText.isDisplayed();
		return displayStatus;
	}
	

}
