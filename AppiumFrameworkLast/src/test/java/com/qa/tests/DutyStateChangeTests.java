package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.MenuPage;
import com.qa.pages.LoginPage;

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

public class DutyStateChangeTests extends BaseTest {
	LoginPage loginPage;
	SettingsPage settingsPage;
	EldDashboardPage eldDashboardPage;
	EldDutyStatePage eldDutyStatePage;
	MenuPage menuPage;

	JSONObject loginUsers;
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
	public void LogInDutyStatePersonalUse() {

		SoftAssert sa = new SoftAssert();

		loginPage.enterUserName(loginUsers.getJSONObject("validUser").getString("username"));
		loginPage.enterPassword(loginUsers.getJSONObject("validUser").getString("password"));
		loginPage.enterRegistration(loginUsers.getJSONObject("validUser").getString("enterRegistration"));
		eldDashboardPage = loginPage.pressLoginBtn();
		String actualDashboardTitle = eldDashboardPage.getTitle();
		String expectedDashboardTitle = getStrings().get("dashboard_title");
		Assert.assertEquals(actualDashboardTitle, expectedDashboardTitle);

		String DriverNameTitle = eldDashboardPage.getDriverNameTitle();
		sa.assertEquals(DriverNameTitle, getStrings().get("eldDashboard_page_driver_name"));
		
		
		  String SLBPrice = eldDashboardPage.getDriverIdTitle();
		  sa.assertEquals(SLBPrice, getStrings().get("eldDashboard_page_driver_id"));
		 

		
		  menuPage = eldDashboardPage.pressMenuBtn(); 
		  menuPage = eldDashboardPage.pressEldDashboardBtn();
		  
		  menuPage = eldDashboardPage.pressMenuBtn(); 
		  menuPage = eldDashboardPage.pressEldDashboardBtn();
		  
		  menuPage = eldDashboardPage.pressMenuBtn(); 
		  menuPage = eldDashboardPage.pressEldDashboardBtn();
		  
		  menuPage = eldDashboardPage.pressMenuBtn(); 
		  menuPage = eldDashboardPage.pressEldDashboardBtn();
		 
		
		eldDutyStatePage = eldDashboardPage.pressDutyStateWizard();

		String actualDutyStateTitle = eldDutyStatePage.getDutyStateTitle();
		String expectedDutyStateTitle = getStrings().get("duty_state_title");
		Assert.assertEquals(actualDutyStateTitle, expectedDutyStateTitle);
		
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressPersonalUseBtn();
		eldDutyStatePage.pressNextBtn();
		//eldDutyStatePage.enterDriverIndicationCommen(loginUsers.getJSONObject("driverIndicationCommen").getString("commen"));
		
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressAnswerIsNo();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressAnswerIsNo();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressAnswerIsYes();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressAnswerIsNo();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressSubmitBtn();
		
		String actualIndDutyStateTitle = eldDutyStatePage.getPersonalUseDutyStateTitle();
		String expectedIndDutyStateTitle = getStrings().get("duty_state_personal_use_title");
		Assert.assertEquals(actualIndDutyStateTitle, expectedIndDutyStateTitle);
		
		sa.assertAll();
	}

	@Test
	public void DutyStateDriving() {
		SoftAssert sa = new SoftAssert();
		
		eldDutyStatePage = eldDashboardPage.pressDutyStateWizard();
		
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressDrivingBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressSubmitBtn();
		
		String actualDutyStateTitle = eldDutyStatePage.getDrivingDutyStateTitle();
		String expectedDutyStateTitle = getStrings().get("duty_state_driving_title");
		Assert.assertEquals(actualDutyStateTitle, expectedDutyStateTitle);
		
		sa.assertAll();
	}
	
	@Test
	public void DutyStateOffDuty() {
		SoftAssert sa = new SoftAssert();
		
		eldDutyStatePage = eldDashboardPage.pressDutyStateWizard();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressOffDutyBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressSubmitBtn();
		
		String actualDutyStateTitle = eldDutyStatePage.getOffDutyDutyStateTitle();
		String expectedDutyStateTitle = getStrings().get("duty_state_off_duty_title");
		Assert.assertEquals(actualDutyStateTitle, expectedDutyStateTitle);
		
		sa.assertAll();
	}
	
	@Test
	public void SleeperBerth() {
		SoftAssert sa = new SoftAssert();
		
		eldDutyStatePage = eldDashboardPage.pressDutyStateWizard();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressSleeperBerthBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressSubmitBtn();
		
		String actualDutyStateTitle = eldDutyStatePage.getSleeperBerthDutyStateTitle();
		String expectedDutyStateTitle = getStrings().get("duty_state_sleeper_berth_title");
		Assert.assertEquals(actualDutyStateTitle, expectedDutyStateTitle);
		
		
		
		sa.assertAll();
	}
	
	@Test
	public void ClearDriverOffDuty() {
		SoftAssert sa = new SoftAssert();
		
		eldDutyStatePage = eldDashboardPage.pressDutyStateWizard();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressClearDriverOffDutyBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressAnswerIsYes();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressAnswerIsNo();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressNextBtn();
		eldDutyStatePage.pressSubmitBtn();
		
		String actualDutyStateTitle = eldDutyStatePage.getNoDriverLoggedInStateTitle();
		String expectedDutyStateTitle = getStrings().get("duty_state_no_driver_logged_in_title");
		Assert.assertEquals(actualDutyStateTitle, expectedDutyStateTitle);
		
		sa.assertAll();
	}
		
	
}
