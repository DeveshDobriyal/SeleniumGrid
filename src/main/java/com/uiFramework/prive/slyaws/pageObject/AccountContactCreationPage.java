package com.uiFramework.prive.slyaws.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.LogStatus;
import com.uiFramework.prive.slyaws.helper.assertion.VerificationHelper;
import com.uiFramework.prive.slyaws.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.prive.slyaws.helper.javaScript.JavaScriptHelper;
import com.uiFramework.prive.slyaws.helper.wait.WaitHelper;
import com.uiFramework.prive.slyaws.testbase.ExtentTestManager;
import com.uiFramework.prive.slyaws.testbase.TestBase;

import junit.framework.Assert;

import com.uiFramework.prive.slyaws.helper.logger.LoggerHelper;
import com.uiFramework.prive.slyaws.helper.select.DropDownHelper;;

public class AccountContactCreationPage {

	private WebDriver driver;
	private final Logger log = Logger.getLogger(AccountContactCreationPage.class);

	WaitHelper waitHelper;

	/*
	 * @FindBy(xpath = "//*[@id=\"_58_fm\"]/div/span/span/input") WebElement
	 * BUTTON_LOGIN;
	 * 
	 * @FindBy(xpath = "//*[@id=\"_58_login\"]") WebElement TEXTBOX_USERNAME;
	 * 
	 * @FindBy(xpath = "//*[@id=\"_58_password\"]") WebElement TEXTBOX_PASSWORD;
	 * 
	 * @FindBy(xpath = "//*[@id=\"_145_userAvatar\"]/span/span/a") WebElement
	 * LINK_LOGOUT;
	 * 
	 * @FindBy(xpath = "//*[@id=\"_145_userAvatar\"]/span/a[2]") WebElement
	 * SUCCESSMSGOBJ;
	 */

@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:_dup_btn_reject\"]")
	WebElement BUTTON_Create_New;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:Form_CollapseSearchPanel:j_id110\"]")
	WebElement LINK_New_Account;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_acc_in_name\"]")
	WebElement TEXTBOX_Account_Name;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_acc_in_addressLine1\"]")
	WebElement TEXTBOX_Line1;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_acc_in_city\"]")
	WebElement TEXTBOX_City;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_acc_in_state\"]")
	WebElement DROPDOWN_State;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_acc_in_zipCode\"]")
	WebElement TEXTBOX_Zip;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_acc_target_product\"]")
	WebElement DROPDOWN_Target_prod;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_acc_btn_save\"]")
	WebElement BUTTON_Save;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_acc_in_phone\"]")
	WebElement TEXTBOX_Phone;
                     
	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:Acc_Ent_Form_Choose_this_address\"]")
	WebElement LINK_choose_this_add;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:Acc_Ent_Form_out_keep_phone\"]")
	WebElement LINK_choose_this_phone;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:j_id195\"]")
	WebElement Link_Contact;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:acc_btn_create_contact\"]")
	WebElement Link_new_Contact;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_contact_in_firstname\"]")
	WebElement TEXTBOX_first_Name_co;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_contact_in_lastname\"]")
	WebElement TEXTBOX_Last_Name_co;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:phly_contact_address_input_line1\"]")
	WebElement TEXTBOX_AddressL1_co;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:phly_contact_address_input_city\"]")
	WebElement TEXTBOX_City_co;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:phly_contact_address_input_provState\"]")
	WebElement DROPDOWN_State_co;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:phly_contact_address_input_zipPostal\"]")
	WebElement DROPDOWN_Zip_co;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:phly_contact_address_contact_in_phone\"]")
	WebElement TEXTBOX_ph_co;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:phly_contact_address_contact_btn_save\"]")
	WebElement BUTTON_Save_Co;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:Acc_Ent_Form_Choose_this_address")
	WebElement LINK_choose_this_add_co;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:Acc_Ent_Form_out_keep_phone")
	WebElement LINK_keepthe_phone_asentered;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:Acc_Ent_Form_Choose_this_address")
	WebElement LINK_choosethis_address_co_2;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:Acc_Ent_Form_out_keep_phone")
	WebElement LINK_Keep_phoneas_entered;

	public AccountContactCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

		// waitHelper.waitForElement(BUTTON_LOGIN,
		// ObjectReader.reader.getExplicitWait());
		//new TestBase().getNavigationScreen(driver); // taking screen shot on obj creation and adding it to extent report
													// and email report
		//TestBase.logExtentReport("Loginin Page obj created");
	}

	public void createNewAccount(String Account_Name,String Phone_No) throws InterruptedException {

		log.info("Clicked on the new Account link");
		this.LINK_New_Account.click();
		Thread.sleep(10000l);
		this.TEXTBOX_Account_Name.sendKeys(Account_Name);
		this.TEXTBOX_Line1.sendKeys("noidasector");
		this.TEXTBOX_Phone.sendKeys(Phone_No);
		this.TEXTBOX_Zip.sendKeys("59852");

		this.TEXTBOX_City.sendKeys("Hawai");

		DropDownHelper drop = new DropDownHelper(driver);
		drop.selectVisibleText(DROPDOWN_Target_prod, "Collector Vehicle");

		// this.DROPDOWN_Alt_Billing_Add.sendKeys("Hawsdfdsfai");

		this.DROPDOWN_State.sendKeys("Haaasdfsdfi");

		Thread.sleep(1000l);
		this.BUTTON_Save.click();
		Thread.sleep(1000l);
		this.LINK_choose_this_add.click();
		Thread.sleep(10000l);
		this.LINK_choose_this_phone.click();
		Thread.sleep(2000l);
		Thread.sleep(4000l);
		this.BUTTON_Create_New.click();
		Thread.sleep(4000l);
		// Contact creation
		JavaScriptHelper js = new JavaScriptHelper(driver);
		js.scrollDownVertically();
		js.ScrollToElement(Link_Contact);
		this.Link_Contact.click();
		this.Link_new_Contact.click();
		Thread.sleep(1000l);
		this.TEXTBOX_first_Name_co.sendKeys("sdua");
		this.TEXTBOX_Last_Name_co.sendKeys("iggasfla");
		this.TEXTBOX_AddressL1_co.sendKeys("gfgdf");
		this.TEXTBOX_City_co.sendKeys("Hawai");
		this.DROPDOWN_State_co.sendKeys("Hawai");
		this.DROPDOWN_Zip_co.sendKeys("32354");
		this.TEXTBOX_ph_co.sendKeys("3658744698");

		Thread.sleep(10000l);

		js.ScrollToElement(BUTTON_Save_Co);

		this.BUTTON_Save_Co.click();
		Thread.sleep(10000l);

		// js.ScrollToElement(LINK_choose_this_add_co);

		this.LINK_choose_this_add_co.click();
		Thread.sleep(10000l);

		this.LINK_keepthe_phone_asentered.click();
		Thread.sleep(10000l);

		this.LINK_choosethis_address_co_2.click();
		Thread.sleep(10000l);

		this.LINK_Keep_phoneas_entered.click();
		Thread.sleep(10000l);
			}

	/*
	 * public void enterUserName(String USERNAME) {
	 * log.info("entering the user id");
	 * this.TEXTBOX_USERNAME.sendKeys(Keys.CONTROL, "a");
	 * this.TEXTBOX_USERNAME.sendKeys(Keys.DELETE);
	 * this.TEXTBOX_USERNAME.sendKeys(USERNAME); }
	 * 
	 * public void enterPassword(String PASSWORD) {
	 * log.info("entering the password"); this.TEXTBOX_PASSWORD.sendKeys(PASSWORD);
	 * }
	 * 
	 * public HomePage clickOnLoginButton() { log.info("Login button Clicked");
	 * //logExtentReport("clicking on Login button...");
	 * 
	 * JavaScriptHelper javaScriptHelper = new JavaScriptHelper(driver);
	 * javaScriptHelper.scrollDownVertically();
	 * 
	 * BUTTON_LOGIN.click(); return new HomePage(driver); }
	 * 
	 * 
	 * 
	 * 
	 * public boolean verifySuccessLoginMGS() {
	 * 
	 * return new VerificationHelper(driver).isDisplayed(SUCCESSMSGOBJ);
	 * 
	 * }
	 * 
	 * public void loginToApplication(String USERNAME, String PASSWORD) {
	 * 
	 * enterUserName(USERNAME); enterPassword(PASSWORD); clickOnLoginButton(); }
	 * 
	 * public void logout() { waitHelper.waitForElement(LINK_LOGOUT,
	 * ObjectReader.reader.getExplicitWait()); LINK_LOGOUT.click();
	 * log.info("clicked on logout link");
	 * 
	 * }
	 */
	/*
	 * public void logExtentReport(String s1) { TestBase.test.log(Status.INFO, s1);
	 * }
	 */
}
