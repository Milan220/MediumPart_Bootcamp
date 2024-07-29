package com.Bootcamp_mediumpart1testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bootcamp_mediumpart1Pages.HomePage;
import com.Bootcamp_mediumpart1Pages.NavigateToDetailPage;
import com.Bootcamp_mediumpart1Pages.SearchPage;
import com.Bootcamp_mediumpart1testBase.TestBase;

public class SearchProductTest extends TestBase {

	public SearchProductTest() throws IOException {
		super();
		
	}
public 	WebDriver driver;
	
	@BeforeMethod
	
	public void setupPage() {
		driver =  initializeBrowser(prop.getProperty("browser"));
		
	}
	
	@Test
	public void retreiveSearchResult() {
		HomePage homePage = new HomePage(driver);
		homePage.enterProduct(prop.getProperty("product "));
		homePage.clickOnSearchButton();
		SearchPage searchPage = new SearchPage(driver);
		Assert.assertTrue(searchPage.retreiveProduct());
		searchPage.clickOnProductDeatail();
		NavigateToDetailPage navigateDetail = new NavigateToDetailPage(driver);
		Assert.assertTrue(navigateDetail.retreiveProductDetails());
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
