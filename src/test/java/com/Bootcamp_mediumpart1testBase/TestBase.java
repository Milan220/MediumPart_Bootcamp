package com.Bootcamp_mediumpart1testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Bootcamp_mediumpart1utilities.utilitie;

public class TestBase {
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	public ChromeOptions option;
	
	public TestBase() throws IOException {
		
		prop = new Properties();
		ip = new FileInputStream("C:\\Users\\benam\\eclipse-workspace\\Bootcamp_Farmework\\src\\main\\java\\com\\Bootcamp_mediumpart1config\\config.properties");
		prop.load(ip);
	}
	public WebDriver initializeBrowser(String browserName) {
		if(browserName.equals("Chrome")) {
			option = new ChromeOptions();
			option.setPageLoadStrategy(PageLoadStrategy.NONE);
			option.addArguments("--start--maximized");
			driver = new ChromeDriver(option);
			
		}else {
			System.out.println("The Browser not mutch");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(utilitie.implicit_wait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(utilitie.pageLoad));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(utilitie.script));
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
