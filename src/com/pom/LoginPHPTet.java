package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPHPTet{
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BHARATHI_V\\eclipse-workspace\\PommPOGO\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		PageFactory.initElements(driver, PHPTravelLoginPOM.class);
		PHPTravelLoginPOM.username.sendKeys("user@phptravels.com");
		PHPTravelLoginPOM.password.sendKeys("demouser");
		PHPTravelLoginPOM.sumbit.click();
	}

}
