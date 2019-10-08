package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PHPTravelLoginPOM {
	public WebDriver driver;
	@FindBy(how=How.NAME,using="username")
	public  static WebElement username;
	@FindBy(name="password")
	public  static WebElement password;
	@FindBy(xpath="//button[text()='Login']")
	public  static WebElement sumbit;

}
