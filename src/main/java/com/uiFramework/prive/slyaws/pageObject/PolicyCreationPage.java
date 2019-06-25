package com.uiFramework.prive.slyaws.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.log4testng.Logger;

import com.relevantcodes.extentreports.LogStatus;
//import com.uiFramework.prive.slyaws.helper.select;
import com.uiFramework.prive.slyaws.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.prive.slyaws.helper.javaScript.JavaScriptHelper;
import com.uiFramework.prive.slyaws.helper.select.DropDownHelper;
import com.uiFramework.prive.slyaws.helper.wait.WaitHelper;
import com.uiFramework.prive.slyaws.testbase.ExtentTestManager;
import com.uiFramework.prive.slyaws.testbase.TestBase;

public class PolicyCreationPage {

	private WebDriver driver;
	private final Logger log = Logger.getLogger(PolicyCreationPage.class);
	WaitHelper waitHelper;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:acc_tab_set:0:Acc_Ent_Form_cmd_create_new_policy\"]")
	WebElement LINK_Create_New_Policy;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:new_policy_contacts_view_ContactsListView_Table_Pager1:0:new_policy_contacts_view_col_sel_type:_4")
	WebElement RADIOBUTTON_Policy;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:new_policy_contacts_view_Btn_Done\"]")
	WebElement Button_Done;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:state_UI2")
	WebElement DROPDOWN_State_Of_Registeration;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id4:label_OK_UI2")
	WebElement Button_OK;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0.1\"]/div/table/tbody/tr/td")
	WebElement Tab_Policy_Questions;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:j_id149")
	WebElement RadioButton_Signedapp;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:j_id155")
	WebElement RadioButton_Signedum;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:j_id31:j_id32:out\"]")
	WebElement BUTTON_Save;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:flatQuoteMenuBar:j_id7:POLICY_INFO\"]/a/span")
	WebElement TOP_Navigation_Policy_Info;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:flatQuoteMenuBar:j_id7:POLICY_INFO:DRIVERS:out\"]")
	WebElement TAB_Driver;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:j_id317")
	WebElement BUTTON_Add_Driver;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:cvDriver_firstname\"]")
	WebElement TEXTBOX_First_name;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:cvDriver_lastname\"]")
	WebElement TEXTBOX_Last_Name;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:cvDriver_birthdate\"]")
	WebElement DATE_DOB;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:cvDriver_licenseNumber\"]")
	WebElement TEXTBOX_Lisence_no;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:dailyVehicle\"]")
	WebElement TEXTBOX_Daily_vahicle;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:driver_question_dataTable:0:driver_Question_Answer_boolean:_2\"]")
	WebElement RADIO_BUTTON_collector_car;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:driver_question_dataTable:1:driver_ViolationQuestion_Answer_Select\"]")
	WebElement DROP_DOWN_Voilations;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVPolicyInfoPanel_tabSet:0:j_id391\"]")
	WebElement BUTTON_Save_Driver;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:flatQuoteMenuBar:j_id7:GARAGES\"]/a/span")
	WebElement TAB_Garage;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:flatQuoteMenuBar:j_id7:GARAGES:ADD_GARAGE:out\"]")
	WebElement TAB_New_Garage;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVGarage_tabSet:0:j_id499\"]")
	WebElement BUTTON_Copy;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:j_id492:j_id493:out\"]")
	WebElement BUTTON_Save_Garage;
	/* Vahicle */
	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:flatQuoteMenuBar:j_id7:VEHICLES\"]/a/span")
	WebElement TAB_Vehicle;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:flatQuoteMenuBar:j_id7:VEHICLES:ADD_VEHICLE:out\"]")
	WebElement TAB_New_Vehicle;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:cv_Year_select\"]")
	WebElement DROP_DOWN_year;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:cv_make_select\"]")
	WebElement DROP_DOWN_make;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:cv_model_select\"]")
	WebElement DROP_DOWN_model;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:cv_agreedValue\"]")
	WebElement TEXT_BOX_agreed_value;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:cv_vehicleType\"]")
	WebElement DROP_DOWN_Vahicle_type;
	/*
	 * //*[@id=
	 * "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:cv_condition"]
	 * 
	 * @FindBy(xpath =
	 * "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:cv_modificationType\"]")
	 * WebElement DROP_DOWN_modification_type;
	 */

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:cv_vin\"]")
	WebElement TEXT_BOX_VIN;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:cv_condition\"]")
	WebElement DROP_DOWN_Condition;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:cv_garagingLocation\"]")
	WebElement DROP_DOWN_Vehicle_Garage_Location;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:j_id665\"]")
	WebElement Radio_Button_Photo;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:j_id591:j_id592:out\"]")
	WebElement Button_save_vehicle;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0.1\"]/div/table/tbody/tr/td")
	WebElement TAB_Vehicle_Questions;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:CVVehicleQuestions_dataTable:5:risk_answer:_2")
	WebElement Radio_Button_VEHICLE_Reg;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:CVVehiclePanel_tabSet:0:vehicle_AnnualMilageRange\"]")
	WebElement Drop_Down_annual_milage;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:j_id591:j_id592:out\"]")
	WebElement button_save_vehicle_questions;

	@FindBy(id = "_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_CollapseNavPanel_UI2:QUICK_QUOTE")
	WebElement RAte;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:Messages:0:j_id859:0:j_id867\"]")
	WebElement Link_append;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_CollapseNavPanel_UI2:CONVERT_TO_APP\"]")
	WebElement Quote;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id183:j_id281\"]")
	WebElement POP_UP_Quote;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_CollapseNavPanel_UI2:j_id301\"]")
	WebElement LINK_Billing_Info;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:insuredNameLabel\"]")
	WebElement LINK_Billing_Info_edit;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:accountingInfo_panelTabSet:0:billing_contact\"]")
	WebElement LINK_Billing_Info_billing_contact;

	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:j_id1228:menuItem_PolicyInfoPanel_save:out\"]")
	WebElement LINK_Billing_Info_billing_contac_save;

	           
	        //*[@id="_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:Messages:0.0"]/div/table/tbody/tr/td
	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_PolicyContent_UI2:Messages:0.0\"]/div/table/tbody/tr/td")
	WebElement Bind_append_ref;
	
	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_CollapseNavPanel_UI2:BIND\"]")
	WebElement Bind;
	
	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:j_id183:j_id281\"]")
	WebElement Issue_Yes;
	                 
	@FindBy(xpath = "//*[@id=\"_PHYLINSPortlet_WAR_PHYLINSPortlet_INSTANCE_o3P5_:form_CollapseNavPanel_UI2:REQUEST_ISSUED\"]")
	WebElement issue;

	public PolicyCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		// new TestBase().getNavigationScreen(driver);
		/*
		 * waitHelper.waitForElement(LINK_Create_New_Policy,
		 * ObjectReader.reader.getExplicitWait()); new
		 * TestBase().getNavigationScreen(driver); // taking screen shot on obj creation
		 * and adding it to extent report // and email report
		 */ // TestBase.logExtentReport("Policy Create Object is created");

	}

	public void createPolicy() throws InterruptedException, FindFailed {

		try{
			JavaScriptHelper js = new JavaScriptHelper(driver);
		
		js.scrollToElementClick(LINK_Create_New_Policy);
		Thread.sleep(10000l);

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Log from thread Id: " + Thread.currentThread().getId() + "New Policy link is Clicked ");
		
		Thread.sleep(10000l);
		this.RADIOBUTTON_Policy.click();
		Thread.sleep(10000l);
		this.Button_Done.click();
		Thread.sleep(10000l);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		driver.switchTo().activeElement().sendKeys("H");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		DropDownHelper select = new DropDownHelper(driver);
		/*
		 * js.ScrollToElement(DROPDOWN_State_Of_Registeration);
		 * 
		 * select.selectUsingValue(DROPDOWN_State_Of_Registeration, "Hawai");
		 * Thread.sleep(1000l); this.Button_OK.click();
		 */

		Thread.sleep(20000l);
		this.Tab_Policy_Questions.click();
		Thread.sleep(1000l);
		this.RadioButton_Signedapp.click();
		Thread.sleep(1000l);
		this.RadioButton_Signedum.click();
		Thread.sleep(1000l);
		this.BUTTON_Save.click();
		Thread.sleep(20000l); // Takes time to create status= Pending quote
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Log from thread Id: " + Thread.currentThread().getId() + " Policy Info Added ");
		
		/* Driver */
		js.scrollUpVertically();
		js.ScrollToElement(TOP_Navigation_Policy_Info);
		Thread.sleep(1000l);
		this.TOP_Navigation_Policy_Info.click();
		Thread.sleep(1000l);
		this.TAB_Driver.click();
		
		
		this.BUTTON_Add_Driver.click();
		this.TEXTBOX_First_name.sendKeys("test");
		this.TEXTBOX_Last_Name.sendKeys("testing");

		this.DATE_DOB.sendKeys("06/05/1989");
		Thread.sleep(1000l);
		this.RADIO_BUTTON_collector_car.click();

		this.TEXTBOX_Lisence_no.sendKeys("tata234");
		this.TEXTBOX_Daily_vahicle.sendKeys("dl098gs");
		Thread.sleep(1000l);
		select.selectUsingValue(DROP_DOWN_Voilations, "None");
		this.BUTTON_Save_Driver.click();
		Thread.sleep(20000l);
		
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Log from thread Id: " + Thread.currentThread().getId() + " Driver Info Added ");
		
		/* Garage */
		js.scrollUpVertically();
		Thread.sleep(1000l);
		this.TAB_Garage.click();
		Thread.sleep(1000l);
		this.TAB_New_Garage.click();
		Thread.sleep(1000l);
		this.BUTTON_Copy.click();
		Thread.sleep(1000l);
		this.BUTTON_Save_Garage.click();
		Thread.sleep(20000l);
		
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Log from thread Id: " + Thread.currentThread().getId() + " Garage Info Added ");
		
		/* vehicle */
		js.scrollUpVertically();
		Thread.sleep(1000l);
		this.TAB_Vehicle.click();
		Thread.sleep(2000l);
		this.TAB_New_Vehicle.click();
		Thread.sleep(2000l);
		select.selectUsingValue(DROP_DOWN_year, "2019");
		Thread.sleep(4000l);
		select.selectUsingValue(DROP_DOWN_make, "Aston Martin");
		Thread.sleep(4000l);
		select.selectUsingValue(DROP_DOWN_model, "DB11 AMR Coupe");
		// garage location to be selected
		Thread.sleep(4000l);
		this.TEXT_BOX_agreed_value.sendKeys("12345");
		Thread.sleep(4000l);
		select.selectUsingValue(DROP_DOWN_Vahicle_type, "Automobile");
		Thread.sleep(4000l);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		Thread.sleep(4000l);

		this.TEXT_BOX_VIN.sendKeys("asd76");
		Thread.sleep(4000l);
		select.selectUsingValue(DROP_DOWN_Condition, "Excellent");
		Thread.sleep(4000l);
		this.Radio_Button_Photo.click();

		Thread.sleep(4000l);
		this.TAB_Vehicle_Questions.click();
		Thread.sleep(10000l);
		this.Radio_Button_VEHICLE_Reg.click();
		Thread.sleep(4000l);
		select.selectUsingValue(Drop_Down_annual_milage, "0-100");
		Thread.sleep(10000l);
		this.button_save_vehicle_questions.click();
		// Takes time
		Thread.sleep(40000l);

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Log from thread Id: " + Thread.currentThread().getId() + " Vehicle Info Added ");
		
		this.RAte.click();
		Thread.sleep(40000l);
		// Takes time
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Log from thread Id: " + Thread.currentThread().getId() + " Policy RATED");
		this.Link_append.click();

		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		// Takes time
		Thread.sleep(40000l);
		this.Quote.click();
		Thread.sleep(4000l);
		
		this.POP_UP_Quote.click();
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Log from thread Id: " + Thread.currentThread().getId() + " Policy QUOTED");
		Thread.sleep(100000l);

		this.LINK_Billing_Info.click();
		Thread.sleep(30000l);
		// js.ScrollToElement(LINK_Billing_Info_edit);
		this.LINK_Billing_Info_edit.click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(20000l);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(20000l);
		
		/*driver.switchTo().activeElement().sendKeys(Keys.ALT.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ALT.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ALT.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ALT.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ALT.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ALT.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);*/

		this.LINK_Billing_Info_billing_contac_save.click();
		
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Log from thread Id: " + Thread.currentThread().getId() + " Billing Info Added");
		
		Thread.sleep(50000l);
		this.Bind.click();
		Thread.sleep(80000l);
		this.Bind_append_ref.click();
		Thread.sleep(2000l);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(10000l);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(10000l);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		//driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(10000l);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		
		Thread.sleep(40000l);
		
		this.Bind.click();
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Log from thread Id: " + Thread.currentThread().getId() + " Policy BINDED");
		Thread.sleep(80000l);
		/*this.Issue_Yes.click();
		Thread.sleep(10000l);*/
		this.issue.click();
		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Log from thread Id: " + Thread.currentThread().getId() + " Policy ISSUED");
		
		Thread.sleep(20000l);
		this.Issue_Yes.click();
		Thread.sleep(100000l);
		}
		catch(Exception e)
		{
			log.info(e.getMessage());
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Log from thread Id: " + Thread.currentThread().getId());
		}
	}
}
