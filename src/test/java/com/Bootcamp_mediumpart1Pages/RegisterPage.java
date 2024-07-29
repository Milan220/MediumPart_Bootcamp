package com.Bootcamp_mediumpart1Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public WebDriver driver;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameTextBox;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "input-email")
	private WebElement emailTextBox;
	
	@FindBy(id = "input-telephone")
	private WebElement telTextBox;
	
	@FindBy(id = "input-password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "input-confirm")
	private WebElement confirmpasswordTextBox;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-dismissible')]")
	private WebElement privacyPolicyWarningMessage;
	
	
	@FindBy(name = "agree")
	private WebElement privacyPolicybutton;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement continueButton;
	
	public  RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterFirstName(String first) {
		firstNameTextBox.sendKeys(first);
	}
	
	public void enterLastName(String lastText) {
		lastNameTextBox.sendKeys(lastText);
	}
	
	public void enterEmail(String emailText) {
		emailTextBox.sendKeys(emailText);
	}
	
	public void enterTelephone(String telephoneText) {
		telTextBox.sendKeys(telephoneText);
	}
	
	public void enterPassword(String passwordText) {
		passwordTextBox.sendKeys(passwordText);
	}
	
	public void enterConfirmPassword(String confirmpasswordText) {
		confirmpasswordTextBox.sendKeys(confirmpasswordText);
	}
	
	
	public void checkPrivacyPolicyCheckBox() {
		privacyPolicyWarningMessage.click();
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	

}
