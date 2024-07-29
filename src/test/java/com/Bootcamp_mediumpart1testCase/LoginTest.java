package com.Bootcamp_mediumpart1testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bootcamp_mediumpart1Pages.HomePage;
import com.Bootcamp_mediumpart1Pages.LoginPage;
import com.Bootcamp_mediumpart1Pages.MyAccountPage;
import com.Bootcamp_mediumpart1testBase.TestBase;

public class LoginTest extends TestBase{

	public LoginTest() throws IOException {
		super();
	
	}
	
	public 	WebDriver driver;
	
	@BeforeMethod
	
	public void setupPage() {
		driver =  initializeBrowser(prop.getProperty("browser"));
		
	}
	
	@Test
	public void verifySuccessLogin() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccountDropdown();
		homePage.clickOnLoginLink();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail(prop.getProperty("validEmail" ));
		loginPage.enterPassword("validPassword");
		loginPage.clickOnLoginButton();
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(myAccountPage.retreiveMyOrdersLink());
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
