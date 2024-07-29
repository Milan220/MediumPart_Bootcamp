package com.Bootcamp_mediumpart1testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bootcamp_mediumpart1Pages.HomePage;
import com.Bootcamp_mediumpart1Pages.RegisterPage;
import com.Bootcamp_mediumpart1Pages.SuccessPage;
import com.Bootcamp_mediumpart1testBase.TestBase;
import com.Bootcamp_mediumpart1utilities.utilitie;


public class RegisterTest extends TestBase{
	public RegisterTest() throws IOException {
		super();
		
	}
	public WebDriver driver;
	
	@BeforeMethod
	
	public void setupPage() {
		driver =  initializeBrowser(prop.getProperty("browser"));
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccountDropdown();
		homePage.clickOnRegister();
	
		
	}
	@Test
public void registerWithValidCredentianls() {
		RegisterPage registerPage = new RegisterPage(driver);
	registerPage.enterFirstName(prop.getProperty("firstName"));
	registerPage.enterLastName(prop.getProperty("lastName"));
	registerPage.enterEmail( utilitie.dateStampEmail());
	registerPage.enterTelephone(prop.getProperty("telephone"));
	registerPage. enterPassword(prop.getProperty("password"));
	registerPage.enterConfirmPassword(prop.getProperty("confirmPaaword"));
	registerPage.checkPrivacyPolicyCheckBox();
	registerPage.clickOnContinueButton();
	SuccessPage successPage = new SuccessPage(driver);
	Assert.assertTrue(successPage.validateAccountSuccessMessage());
	
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
