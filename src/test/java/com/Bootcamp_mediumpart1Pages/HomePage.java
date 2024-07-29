package com.Bootcamp_mediumpart1Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	
	@FindBy(linkText = "My Account")

	private WebElement myAccountDropdown;
	
	
	@FindBy(linkText = "Register")
     private WebElement registerOption;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMyAccountDropdown() {
		myAccountDropdown.click();
		
	}
	
	
	public void clickOnRegister() {
		registerOption.click();
	}
	
	@FindBy(xpath = "//p[@class = 'price'][contains(text() , '$602.00 ')]/following::button[1]")
	private WebElement addToCardLink;
	
	@FindBy(linkText = "Shopping Cart")
	private WebElement shoppingCardLink;
	
	@FindBy(linkText = "Returns")
	private WebElement clickOnReturn;
	
	@FindBy(linkText = "Login")
	private WebElement loginLink;
	
	@FindBy(name = "search")
	private WebElement searchBox;
	
	@FindBy(css = "i.fa.fa-search")
	private WebElement searchButton;
	
	
	
	
	public void clickOnAddToCard() {
		addToCardLink.click();
	}
	
	public void clickOnShoppingCard() {
		shoppingCardLink.click();
	
	}
	
	public boolean retreiveLink() {
		boolean displayStatus = clickOnReturn.isDisplayed();
		return displayStatus;
		
	}
	
	public void clickOnReturnsLink() {
		clickOnReturn.click();
	}
	
	public void clickOnLoginLink() {
		loginLink.click();
	}
	
	public void enterProduct(String productName) {
		searchBox.sendKeys(productName);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
}


