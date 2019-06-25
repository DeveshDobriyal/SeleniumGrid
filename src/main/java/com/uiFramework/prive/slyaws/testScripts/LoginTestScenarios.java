package com.uiFramework.prive.slyaws.testScripts;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.uiFramework.prive.slyaws.pageObject.LoginPage;
import com.uiFramework.prive.slyaws.pageObject.LoginPage_Parameterized;
import com.uiFramework.prive.slyaws.helper.assertion.AssertionHelper;
import com.uiFramework.prive.slyaws.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.prive.slyaws.helper.logger.LoggerHelper;
import com.uiFramework.prive.slyaws.helper.wait.WaitHelper;
import com.uiFramework.prive.slyaws.pageObject.HomePage;
import com.uiFramework.prive.slyaws.pageObject.LoginPage;
import com.uiFramework.prive.slyaws.testbase.TestBase;
import com.uiFramework.prive.slyaws.pageObject.LoginPage;

public class LoginTestScenarios extends TestBase {

	private final Logger log = LoggerHelper.getLogger(LoginTestScenarios.class);

	LoginPage_Parameterized login;
	HomePage homepage;
	WaitHelper waitHelper;

	@DataProvider(name = "testData")
	public Object[][] testData() {
		Object[][] data = getExcelData("testData.xlsx", "LoginData");
		return data;
	}

	@BeforeClass
	public void beforeClass() {
		getApplicationUrl(ObjectReader.reader.getUrl());
		login = new LoginPage_Parameterized(driver);
	}

	@Test(dataProvider="testData")
	public void loginTest(String USERNAME , String PASSWORD ,String TEXTBOX_Account_Name, String TEXTBOX_City, String TEXTBOX_Line1, String DROPDOWN_Alt_Billing_Add, String TEXTBOX_Phone, String TEXTBOX_Zip, String DROPDOWN_State,String TEXTBOX_first_Name_co,String TEXTBOX_Last_Name_co, String TEXTBOX_AddressL1_co, String TEXTBOX_City_co, String DROPDOWN_State_co, String DROPDOWN_Zip_co, String TEXTBOX_ph_co, String runMode) throws InterruptedException  {
		if(runMode.equalsIgnoreCase("n")) {
		throw new SkipException("Run Mode for this set of Data is set to N");	
		}
	login.loginToApplication(USERNAME, PASSWORD);
	boolean status = login.verifySuccessLoginMGS();
	AssertionHelper.updateTestStatus(status);
	login.createNewAccount( TEXTBOX_Account_Name,  TEXTBOX_City, TEXTBOX_Line1, DROPDOWN_Alt_Billing_Add, TEXTBOX_Phone, TEXTBOX_Zip,DROPDOWN_State, TEXTBOX_first_Name_co, TEXTBOX_Last_Name_co	, TEXTBOX_AddressL1_co,  TEXTBOX_City_co, DROPDOWN_State_co, DROPDOWN_Zip_co, TEXTBOX_ph_co);
	
	login.logout();
	}

}
