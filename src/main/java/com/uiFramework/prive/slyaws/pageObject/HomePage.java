package com.uiFramework.prive.slyaws.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.uiFramework.prive.slyaws.helper.wait.WaitHelper;

public class HomePage {

	private WebDriver driver;
	private final Logger log = Logger.getLogger(AccountContactCreationPage.class);
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
}
