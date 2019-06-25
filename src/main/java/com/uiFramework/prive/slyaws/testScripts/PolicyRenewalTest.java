package com.uiFramework.prive.slyaws.testScripts;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.uiFramework.prive.slyaws.helper.assertion.AssertionHelper;
import com.uiFramework.prive.slyaws.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.prive.slyaws.pageObject.LoginPage;
import com.uiFramework.prive.slyaws.pageObject.PolicyEndorsePage;
import com.uiFramework.prive.slyaws.pageObject.PolicyRenewalPage;
import com.uiFramework.prive.slyaws.testbase.TestBase;

public class PolicyRenewalTest extends TestBase {
	LoginPage login;
	PolicyRenewalPage policyrenewal;
	private final Logger log = Logger.getLogger(LoginTest.class);

	@Test(description="LoginTest with Valid Credential")
	public void testLoginToApplication() throws InterruptedException {

		getApplicationUrl(ObjectReader.reader.getUrl());
		LoginPage login = new LoginPage(driver);
		login.loginToApplication(ObjectReader.reader.getUserName(), ObjectReader.reader.getPassword());
		boolean status = login.verifySuccessLoginMGS();
		
		AssertionHelper.updateTestStatus(status);
		
		
		
}

}
