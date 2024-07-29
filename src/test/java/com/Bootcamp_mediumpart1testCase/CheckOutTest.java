package com.Bootcamp_mediumpart1testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bootcamp_mediumpart1Pages.HomePage;
import com.Bootcamp_mediumpart1Pages.ShoppingCardPage;
import com.Bootcamp_mediumpart1testBase.TestBase;

public class CheckOutTest extends TestBase{
	
	public CheckOutTest() throws IOException {
		super();
		
	}

	public WebDriver driver;
	public HomePage homePage;
	@BeforeMethod
	public void setupPage() {
		driver =  initializeBrowser(prop.getProperty("browser"));
	}
	
	@Test
	public void checkoutTest() {
		
		homePage = new HomePage(driver);
		homePage.clickOnAddToCard();
		homePage.clickOnShoppingCard();
		ShoppingCardPage shoopingCard = new ShoppingCardPage(driver);
		shoopingCard.retreiveProductImage();
		shoopingCard.clickOnCheckoutButton();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	

}
