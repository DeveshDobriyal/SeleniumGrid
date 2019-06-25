package com.uiFramework.prive.slyaws.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.uiFramework.prive.slyaws.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.prive.slyaws.helper.wait.WaitHelper;
import com.uiFramework.prive.slyaws.testbase.TestBase;

/**
 * @author Devesh Dobriyal
 * rate , Quote , Bind and Isssue.
 *
 */
public class PolicyEndorsePage {
	
	private WebDriver driver;
	private final Logger log = Logger.getLogger(LoginPage.class);
	
	WaitHelper waitHelper;
	
	@FindBy(xpath = "//*[@id=\"_145_userAvatar\"]/span/a[2]")
	WebElement SUCCESSMSGOBJEndorse;
	
	
	
	public PolicyEndorsePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

		waitHelper.waitForElement(SUCCESSMSGOBJEndorse, ObjectReader.reader.getExplicitWait());
		//new TestBase().getNavigationScreen(driver); // taking screen shot on obj creation and adding it to extent report
													// and email report
		//TestBase.logExtentReport("Loginin Page obj created");
	}

}
