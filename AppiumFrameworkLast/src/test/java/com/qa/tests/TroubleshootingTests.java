package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.MenuPage;
import com.qa.pages.LoginPage;
import com.qa.pages.EldDashboardDetailsPage;
import com.qa.pages.EldDashboardPage;
import com.qa.pages.SettingsPage;
import com.qa.pages.TroubleshootingPage;
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

public class TroubleshootingTests extends BaseTest {
	LoginPage loginPage;
	EldDashboardPage eldDashboardPage;
	SettingsPage settingsPage;
	EldDashboardDetailsPage eldDashboardDetailsPage;
	JSONObject loginUsers;
	MenuPage menuPage;
	TroubleshootingPage troubleshootingPage;
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
		  

		/*
		 * eldDashboardPage =
		 * loginPage.login(loginUsers.getJSONObject("validUser").getString("username"),
		 * loginUsers.getJSONObject("validUser").getString("password"),
		 * loginUsers.getJSONObject("validUser").getString("enterRegistration"));
		 */
	}

	@AfterMethod
	public void afterMethod() {
		//settingsPage = eldDashboardPage.pressSettingsBtn();
		//loginPage = settingsPage.pressLogoutBtn();
	}

	  @Test
	  public void TroubleshootingOnPage() {
		  
		  SoftAssert sa = new SoftAssert();
		  
		  loginPage.enterUserName(loginUsers.getJSONObject("validUser").getString("username"));
		  loginPage.enterPassword(loginUsers.getJSONObject("validUser").getString("password"));
		  loginPage.enterRegistration(loginUsers.getJSONObject("validUser").getString("enterRegistration"));
		  eldDashboardPage = loginPage.pressLoginBtn();
		  String actualDashboardTitle = eldDashboardPage.getTitle();		  
		  String expectedDashboardTitle = getStrings().get("dashboard_title");
		  Assert.assertEquals(actualDashboardTitle, expectedDashboardTitle);
		  
		  menuPage = eldDashboardPage.pressMenuBtn();
		  settingsPage = menuPage.pressSettingsBtn();
		  
		  
		  
			
			  String TroublBtn = settingsPage.scrollToTroubleshootingBtn();
			  //sa.assertEquals(TroublBtn, getStrings().get("troubleshooting_btn"));
			  

		  
		  
		  troubleshootingPage = settingsPage.pressTroubleshootingBtn();
		  
		  
		  troubleshootingPage.enterTroubleshootingPassword(loginUsers.getJSONObject("troubleshootingPw").getString("password"));
		  troubleshootingPage.pressNextBtn();
		  
		  sa.assertAll();
	  }
		  
		  @Test
		  public void TroubleshootingSeatbeltOnPage() {
			  
			  
			  SoftAssert sa = new SoftAssert();
		  
		  troubleshootingPage.pressSeatbeltBtn();
		  troubleshootingPage.pressNextBtn();
		  
		  String actualTroublLogTxt = troubleshootingPage.getTroubleshootingLogTitle();
		  String expectedTroublLogTxt = getStrings().get("troubleshooting_log_title");
		  Assert.assertEquals(actualTroublLogTxt, expectedTroublLogTxt);		  		  
		  
		  String actualSeatbeltStateTxt = troubleshootingPage.getSeatbeltState();
		  String expectedSeatbeltStateTxt = getStrings().get("get_seatbelt_state");
		  Assert.assertEquals(actualSeatbeltStateTxt, expectedSeatbeltStateTxt);		  
		  
		  troubleshootingPage.pressBackBtn();
		  
		  sa.assertAll();
		  }
		  
		  
		  @Test
		  public void TroubleshootingIgnitionOnPage() {
		  SoftAssert sa = new SoftAssert();
		  
		  troubleshootingPage.pressIgnitionBtn();
		  troubleshootingPage.pressNextBtn();
		  
		  String actualIgnitionStateTxt = troubleshootingPage.getIgnitionState();
		  String expectedIgnitionStateTxt = getStrings().get("get_ignition_state");
		  Assert.assertEquals(actualIgnitionStateTxt, expectedIgnitionStateTxt);
		  troubleshootingPage.pressBackBtn();
		  
		  sa.assertAll();
		  }
		  
		  @Test
		  public void TroubleshootingLoadEumulationOnPage() {
		  SoftAssert sa = new SoftAssert();
			  
		  troubleshootingPage.pressLoadEumulationFileBtn();
		  troubleshootingPage.pressNextBtn();
		  
		  String actualLoadEumulationTxt = troubleshootingPage.getLoadEumulationFile();
		  String expectedLoadEumulationTxt = getStrings().get("get_load_eumulation_file");
		  Assert.assertEquals(actualLoadEumulationTxt, expectedLoadEumulationTxt);
		  troubleshootingPage.pressBackBtn();
		  
		  sa.assertAll();
		  }
		  
		  @Test
		  public void TroubleshootingRequestConfigurationOnPage() {
		  SoftAssert sa = new SoftAssert();
		  
		  troubleshootingPage.pressRequestConfigurationBtn();
		  troubleshootingPage.pressNextBtn();
		  
			
		  String actualBackRequestConfBtn = troubleshootingPage.getBackBtn();
		  String expectedBackRequestConfBtn = getStrings().get("get_back_btn");
		  Assert.assertEquals(actualBackRequestConfBtn, expectedBackRequestConfBtn);
			
			
			  String actualRequestConfigurationTxt =
			  troubleshootingPage.getRequestConfiguration(); String
			  expectedRequestConfigurationTxt =
			  getStrings().get("get_request_configuration");
			  Assert.assertEquals(actualRequestConfigurationTxt,
			  expectedRequestConfigurationTxt);	 
			 			 
			  troubleshootingPage.pressBackBtn();
		  sa.assertAll();
		  }
		  
		  @Test
		  public void TroubleshootingSendConfigurationOnPage() {
		  SoftAssert sa = new SoftAssert();
		  
		  troubleshootingPage.pressSendConfigurationBtn();
		  troubleshootingPage.pressNextBtn();
		  
		  
		  String actualBackConfBtn = troubleshootingPage.getBackBtn();
		  String expectedBackConfBtn = getStrings().get("get_back_btn");
		  Assert.assertEquals(actualBackConfBtn, expectedBackConfBtn);
		  
			
			  String actualSendConfigurationTxt =
			  troubleshootingPage.getSendConfiguration(); String
			  expectedSendConfigurationTxt = getStrings().get("get_send_configuration");
			  Assert.assertEquals(actualSendConfigurationTxt,
			  expectedSendConfigurationTxt);
			 
			  troubleshootingPage.pressBackBtn();
		  sa.assertAll();
		  }
		  
		  @Test
		  public void TroubleshootingTestSatelliteOnPage() {
		  SoftAssert sa = new SoftAssert();
		  
		  
		  
		  troubleshootingPage.pressTestSatelliteBtn();
		  troubleshootingPage.pressNextBtn();
		  
		  String actualTestSatelliteTxt = troubleshootingPage.getTestSatellite();
		  String expectedTestSatelliteTxt = getStrings().get("get_test_satellite");
		  Assert.assertEquals(actualTestSatelliteTxt, expectedTestSatelliteTxt);
		  troubleshootingPage.pressBackBtn();
		  sa.assertAll();
		  }
		  
		  @Test
		  public void TroubleshootingTestGprsOnPage() {
		  SoftAssert sa = new SoftAssert();
		  
		  troubleshootingPage.pressTestGprsBtn();
		  troubleshootingPage.pressNextBtn();
		  		  
		  String actualBackBtn = troubleshootingPage.getBackBtn();
		  String expectedBackBtn = getStrings().get("get_back_btn");
		  Assert.assertEquals(actualBackBtn, expectedBackBtn);
		  		  
		  String actualTestGprsTxt = troubleshootingPage.getTestGprs();
		  String expectedTestGprsTxt = getStrings().get("get_test_gprs");
		  Assert.assertEquals(actualTestGprsTxt, expectedTestGprsTxt);
		  troubleshootingPage.pressBackBtn();
	  
		  
		  sa.assertAll();
		  

	  }
		  
		  @Test
		  public void TroubleshootingCheckOdbDataBtnOnPage() {
		  SoftAssert sa = new SoftAssert();
		  
		  troubleshootingPage.pressCheckOdbDataBtn();
		  troubleshootingPage.pressNextBtn();
		  		  
		  String actualBackBtn = troubleshootingPage.getBackBtn();
		  String expectedBackBtn = getStrings().get("get_back_btn");
		  Assert.assertEquals(actualBackBtn, expectedBackBtn);
		  		  
		  troubleshootingPage.pressBackBtn();
	  
		  
		  sa.assertAll();
		  

	  }
		  
		  @Test
		  public void TroubleshootingPutSystemToSleepBtnOnPage() {
		  SoftAssert sa = new SoftAssert();
		  
		  troubleshootingPage.pressPutSystemToSleepBtn();
		  troubleshootingPage.pressNextBtn();
		  		  
		  String actualTxt = troubleshootingPage.getPutSystemToSleepBtn();
		  String expectedTxt = getStrings().get("get_put_system_to_sleep");
		  Assert.assertEquals(actualTxt, expectedTxt);
		  troubleshootingPage.pressBackBtn();
	  
		  
		  sa.assertAll();
		  

	  }
		  @Test
		  public void TroubleshootingRebootSystemBtnOnPage() {
		  SoftAssert sa = new SoftAssert();
		  
		  troubleshootingPage.pressRebootSystemBtn();
		  troubleshootingPage.pressNextBtn();
		  		  
		  String actualTxt = troubleshootingPage.getRebootSystemBtn();
		  String expectedTxt = getStrings().get("get_reboot_system");
		  Assert.assertEquals(actualTxt, expectedTxt);
		  troubleshootingPage.pressBackBtn();
	  
		  
		  sa.assertAll();
		  

	  }
		
		  @Test public void TroubleshootingProgramNewTrailerIDTitleOnPage() {
		  SoftAssert sa = new SoftAssert();
		  
		  troubleshootingPage.pressProgramNewTrailerIDBtn();
		  troubleshootingPage.pressNextBtn();
		  
		  String actualTxt = troubleshootingPage.getProgramNewTrailerIDTitle(); String
		  expectedTxt = getStrings().get("get_program_trailer_title");
		  Assert.assertEquals(actualTxt, expectedTxt);
		  
		  
		 
		  
		  
		  troubleshootingPage.enterTroubleshootingNewTrailerID(loginUsers.getJSONObject("newtrailerID").getString("trailerID"));
		  troubleshootingPage.enterTroubleshootingConfirmNewTrailerID(loginUsers.getJSONObject("newtrailerID").getString("trailerID"));
		  troubleshootingPage.pressNextBtn();
		  
		  
		  
		  sa.assertAll();
		  

		  }
		 
	
	

}
