package com.Bootcamp_mediumpart1Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	@FindBy(id = "input-email")
	private WebElement emailTextBox;
	

	@FindBy(id = "input-password")
	private WebElement paswordTextBox;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement loginButton;
	
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterEmail(String emailText) {
		emailTextBox.sendKeys(emailText);
	}
	
	public void enterPassword(String passwordText) {
		paswordTextBox.sendKeys(passwordText);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	
	
	
	

}
