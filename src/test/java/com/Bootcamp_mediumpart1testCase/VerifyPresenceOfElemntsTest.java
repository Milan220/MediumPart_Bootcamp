package com.Bootcamp_mediumpart1testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bootcamp_mediumpart1Pages.HomePage;
import com.Bootcamp_mediumpart1Pages.ReturnsPage;
import com.Bootcamp_mediumpart1testBase.TestBase;

public class VerifyPresenceOfElemntsTest extends TestBase {

	public VerifyPresenceOfElemntsTest() throws IOException {
		super();
		
	}
public WebDriver driver;
	
	@BeforeMethod
	
	public void setupPage() {
		driver =  initializeBrowser(prop.getProperty("browser"));
		HomePage homePage = new HomePage(driver);
	
	}
	@Test
	public void verifyPresenceOfReturnsLink() {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.retreiveLink());
		homePage.clickOnReturnsLink();
		ReturnsPage returns = new ReturnsPage(driver);
		Assert.assertTrue(returns.retreiveFirstNameBox());
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
