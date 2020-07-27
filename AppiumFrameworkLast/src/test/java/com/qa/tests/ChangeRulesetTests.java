package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.MenuPage;
import com.qa.pages.LoginPage;

import com.qa.pages.ChangeRulesetPage;
import com.qa.pages.EldDashboardDetailsPage;
import com.qa.pages.EldDashboardPage;
import com.qa.pages.EldDutyStatePage;
import com.qa.pages.SettingsPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ChangeRulesetTests extends BaseTest {
	LoginPage loginPage;
	EldDashboardPage eldDashboardPage;
	MenuPage menuPage;
	JSONObject loginUsers;
	ChangeRulesetPage changeRulesetPage;
	SettingsPage settingsPage;
	TestUtils utils = new TestUtils();

	@BeforeClass
	public void beforeClass() throws Exception {
		InputStream datais = null;
		try {
			String dataFileName = "data/loginUsers.json";
			datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			JSONTokener tokener = new JSONTokener(datais);
			loginUsers = new JSONObject(tokener);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (datais != null) {
				datais.close();
			}
		}

	}

	@AfterClass
	public void afterClass() {
		 closeApp();
		  launchApp();
	}

	@BeforeMethod
	public void beforeMethod(Method m) {
		utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
		loginPage = new LoginPage();

	}

	@AfterMethod
	public void afterMethod() {


	}

	@Test
	public void LoginUsers() {
		SoftAssert sa = new SoftAssert();

		loginPage.enterUserName(loginUsers.getJSONObject("validUser").getString("username"));
		loginPage.enterPassword(loginUsers.getJSONObject("validUser").getString("password"));
		loginPage.enterRegistration(loginUsers.getJSONObject("validUser").getString("enterRegistration"));
		eldDashboardPage = loginPage.pressLoginBtn();




		
		  menuPage = eldDashboardPage.pressMenuBtn(); eldDashboardPage =
		  menuPage.pressEldDashboardBtn();
		  
		  menuPage = eldDashboardPage.pressMenuBtn(); eldDashboardPage =
		  menuPage.pressEldDashboardBtn();
		  
		  menuPage = eldDashboardPage.pressMenuBtn(); eldDashboardPage =
		  menuPage.pressEldDashboardBtn();
		  
		  menuPage = eldDashboardPage.pressMenuBtn(); eldDashboardPage =
		  menuPage.pressEldDashboardBtn();
		  
		  
		  menuPage = eldDashboardPage.pressMenuBtn(); eldDashboardPage =
		  menuPage.pressEldDashboardBtn();
		  
		  menuPage = eldDashboardPage.pressMenuBtn(); eldDashboardPage =
		  menuPage.pressEldDashboardBtn();
		  
		  menuPage = eldDashboardPage.pressMenuBtn(); eldDashboardPage =
		  menuPage.pressEldDashboardBtn();
		 
		
		  String DriverNameTitle = eldDashboardPage.getDriverNameTitle(); 
		  sa.assertEquals(DriverNameTitle, getStrings().get("eldDashboard_page_driver_name"));
		sa.assertAll();
	
	}
	@Test
	public void RuleSetUs8Day() {

		SoftAssert sa = new SoftAssert();

	
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//US 8 Day
		changeRulesetPage.pressUs8DayRulesetBtn();
		changeRulesetPage.pressNextBtn();
		eldDashboardPage = changeRulesetPage.pressSubmitBtn();
		
		/*
		 * String RuleSetTitle = eldDashboardPage.getRuleSetUs8Day();
		 * sa.assertEquals(RuleSetTitle, getStrings().get("title_rul_Seta_us_8_day"));
		 */
		
		
			/*
			 * String actualTitleRulSeta = eldDashboardPage.getRuleSetUs8Day(); String
			 * expectedTitleRulSeta = getStrings().get("title_rul_Seta_us_8_day");
			 * Assert.assertEquals(actualTitleRulSeta, expectedTitleRulSeta);
			 */
		
		sa.assertAll();
	}
		
		@Test
		public void UsOil8DayRuleset() {
		SoftAssert sa = new SoftAssert();
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//US Oil 8 Day
		changeRulesetPage.pressUsOil8DayRulesetBtn();
		changeRulesetPage.pressNextBtn();
		eldDashboardPage = changeRulesetPage.pressSubmitBtn();
		/*
		 * String actualTitleRulSeta = eldDashboardPage.getRuleSetUsOil8Day(); String
		 * expectedTitleRulSeta = getStrings().get("title_rul_Seta_us_Oil_8_day");
		 * Assert.assertEquals(actualTitleRulSeta, expectedTitleRulSeta);
		 */
		
		sa.assertAll();
	}
		
		@Test
		public void HomeOfficeRuleset() {
		SoftAssert sa = new SoftAssert();
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//US Home Office
		changeRulesetPage.pressusHomeOfficeRulesetBtn();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		/*
		 * String actualTitleRulSeta = eldDashboardPage.getRuleUSHomeOffice(); String
		 * expectedTitleRulSeta = getStrings().get("title_rul_Seta_us_home_office");
		 * Assert.assertEquals(actualTitleRulSeta, expectedTitleRulSeta);
		 */
		sa.assertAll();
	}
		
		@Test
		public void TexasOil7Ruleset() {
		SoftAssert sa = new SoftAssert();	
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//Texas Oil 7
		changeRulesetPage.pressTexasOil7Ruleset();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		/*
		 * String actualTitleRulSeta = eldDashboardPage.getTexasOil7(); String
		 * expectedTitleRulSeta = getStrings().get("title_rul_seta_texas_oil_7");
		 * Assert.assertEquals(actualTitleRulSeta, expectedTitleRulSeta);
		 */
		
		sa.assertAll();
	}
		
		@Test
		public void Canada2007Cycle1RulesetRuleset() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//Canada 2007 Cycle 1
		changeRulesetPage.pressCanada2007Cycle1RulesetRuleset();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		/*
		 * String actualTitleRulSeta = eldDashboardPage.getCanada2007Cycle1(); String
		 * expectedTitleRulSeta =
		 * getStrings().get("title_rul_seta_canada_2007_cycle_1");
		 * Assert.assertEquals(actualTitleRulSeta, expectedTitleRulSeta);
		 */
		sa.assertAll();
	}
		
		@Test
		public void Canada2007Cycle2RulesetRuleset() {
		SoftAssert sa = new SoftAssert();
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//Canada 2007 Cycle 2
		changeRulesetPage.pressCanada2007Cycle2RulesetRuleset();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		/*
		 * String actualTitleRulSeta = eldDashboardPage.getCanada2007Cycle2(); String
		 * expectedTitleRulSeta =
		 * getStrings().get("title_rul_seta_canada_2007_cycle_2");
		 * Assert.assertEquals(actualTitleRulSeta, expectedTitleRulSeta);
		 */
		
		sa.assertAll();
	}
		
		@Test
		public void Canada200760DegreesCycle1() {
		SoftAssert sa = new SoftAssert();
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//Canada 2007 60 Degrees Cycle 1
		changeRulesetPage.pressCanada200760DegreesCycle1();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		/*
		 * String actualTitleRulSeta = eldDashboardPage.getCanada200760DegreesCycle1();
		 * String expectedTitleRulSeta =
		 * getStrings().get("title_rul_seta_canada_2007_60_degrees_cycle_1");
		 * Assert.assertEquals(actualTitleRulSeta, expectedTitleRulSeta);
		 */
		
		sa.assertAll();
	}
		
		@Test
		public void Canada200760DegreesCycle2() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//Canada 2007 60 Degrees Cycle 2
		changeRulesetPage.pressCanada200760DegreesCycle2();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		
		sa.assertAll();
	}
		
		@Test
		public void Canada2007OilFieldPermit() {
		SoftAssert sa = new SoftAssert();

		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//Canada 2007 Oil Field Permit
		changeRulesetPage.pressCanada2007OilFieldPermit();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		
		sa.assertAll();
	}
		
		@Test
		public void Canada200760DegreesOilFieldPermit() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//Canada 2007 60 Degrees Oil Field Permit
		changeRulesetPage.pressCanada200760DegreesOilFieldPermit();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		
		sa.assertAll();
	}
		
		@Test
		public void Us7DayRuleset() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//US 7 Day
		changeRulesetPage.pressUs7DayRuleset();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		

		sa.assertAll();
	}

		@Test
		public void UsWaterWellDriller7Day() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//Us Water Well Driller 7 Day
		changeRulesetPage.pressUsWaterWellDriller7Day();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		

		sa.assertAll();
	}
		
		@Test
		public void UsWaterWellDriller8Day() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//Us Water WellDriller 8 Day
		//String TroublBtn = changeRulesetPage.scrollToTroubleshootingBtn();
		changeRulesetPage.pressUsWaterWellDriller8Day();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		

		sa.assertAll();
	}
		
		@Test
		public void UsOil8DayNoWaitExemption() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//US Oil 8 Day - No Wait Exemption
		//String TroublBtn = changeRulesetPage.scrollToTroubleshootingBtn();
		changeRulesetPage.pressUsOil8DayNoWaitExemption();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		

		sa.assertAll();
	}
		
		@Test
		public void UsPassengerCarrying8Day() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		//US Passenger Carrying 8 Day
		String TroublBtn = changeRulesetPage.scrollToTroubleshootingBtn();
		changeRulesetPage.pressUsPassengerCarrying8Day();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		

		sa.assertAll();
	}
		
		@Test
		public void Oklahoma8Day() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		changeRulesetPage.pressOklahoma8Day();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		

		sa.assertAll();
	}
		
		@Test
		public void Oklahoma7Day() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		changeRulesetPage.pressOklahoma7Day();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		

		sa.assertAll();
	}
		
		@Test
		public void Alaska8Day() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		changeRulesetPage.pressAlaska8Day();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		

		sa.assertAll();
	}
		
		@Test
		public void California8day() {
		SoftAssert sa = new SoftAssert();
		
		changeRulesetPage = eldDashboardPage.pressChengeRulSetaBtn();
		changeRulesetPage.pressCalifornia8day();
		changeRulesetPage.pressNextBtn();
		changeRulesetPage.pressSubmitBtn();
		

		sa.assertAll();
	}
		
}
