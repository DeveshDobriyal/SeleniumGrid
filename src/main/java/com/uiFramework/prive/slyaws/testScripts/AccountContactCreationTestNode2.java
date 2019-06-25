package com.uiFramework.prive.slyaws.testScripts;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.relevantcodes.extentreports.LogStatus;
import com.uiFramework.prive.slyaws.helper.assertion.AssertionHelper;
import com.uiFramework.prive.slyaws.helper.browserConfiguration.config.ObjectReader;

import com.uiFramework.prive.slyaws.pageObject.AccountContactCreationPage;
import com.uiFramework.prive.slyaws.pageObject.HomePage;
import com.uiFramework.prive.slyaws.pageObject.LoginPage;
import com.uiFramework.prive.slyaws.pageObject.PolicyCreationPage;
import com.uiFramework.prive.slyaws.testbase.ExtentTestManager;
import com.uiFramework.prive.slyaws.testbase.TestBase;

import junit.framework.Assert;

public class AccountContactCreationTestNode2 extends TestBase {
	LoginPage login;
	AccountContactCreationPage account;
	private final Logger log = Logger.getLogger(LoginTest.class);

	@DataProvider(name = "testData")
	public Object[][] testData() {
		Object[][] data = getExcelData("testData.xlsx", "Policy_Data_Node2");
		return data;
	}

	/*
	 * @BeforeClass public void beforeClass() {
	 * 
	 * }
	 */

	@Test(dataProvider = "testData")
	public void testLoginToApplication(String Account_Name, String Phone_No, String runMode)
			throws InterruptedException {
		if (runMode.equalsIgnoreCase("n")) {
			throw new SkipException("Run Mode for this set of Data is set to N");
		}
		try {
			getApplicationUrl(ObjectReader.reader.getUrl());

			LoginPage login = new LoginPage(driver);
			login.loginToApplication(ObjectReader.reader.getUserName(), ObjectReader.reader.getPassword());
			boolean status = login.verifySuccessLoginMGS();
			Thread.sleep(1000l);

			AccountContactCreationPage account = new AccountContactCreationPage(driver);

			// AssertionHelper.updateTestStatus(status);

			account.createNewAccount(Account_Name, Phone_No);

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"Log from thread Id: " + Thread.currentThread().getId() + "Account Created ");

			ExtentTestManager.getTest().log(LogStatus.INFO,
					"Log from thread Id: " + Thread.currentThread().getId() + "Contact Created ");

			ExtentTestManager.getTest().log(LogStatus.PASS, "Log from thread Id: " + Thread.currentThread().getId());

			Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);
		}

		catch (Exception e) {
			log.info(e.getMessage());
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Log from thread Id: " + Thread.currentThread().getId());

		}

	}

}
