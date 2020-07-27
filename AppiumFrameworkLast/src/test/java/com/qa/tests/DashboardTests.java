package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.EldDashboardDetailsPage;
import com.qa.pages.EldDashboardPage;
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

public class DashboardTests extends BaseTest {
	LoginPage loginPage;
	EldDashboardPage eldDashboardPage;
	SettingsPage settingsPage;
	EldDashboardDetailsPage eldDashboardDetailsPage;
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
	  public void driverLogin() {
		  loginPage.enterUserName(loginUsers.getJSONObject("validUser").getString("username"));
		  loginPage.enterPassword(loginUsers.getJSONObject("validUser").getString("password"));
		  loginPage.enterRegistration(loginUsers.getJSONObject("validUser").getString("enterRegistration"));
		  eldDashboardPage = loginPage.pressLoginBtn();
		  		  
		  String actualDashboardTitle = eldDashboardPage.getTitle();		  
		  String expectedDashboardTitle = getStrings().get("dashboard_title");
		  
		  Assert.assertEquals(actualDashboardTitle, expectedDashboardTitle);
	  }
	
	
	  @Test 
	  public void validateDashboardOnDashboardPage() { 
	  SoftAssert sa = new SoftAssert();
	  
	  String DriverNameTitle = eldDashboardPage.getDriverNameTitle(); 
	  sa.assertEquals(DriverNameTitle, getStrings().get("eldDashboard_page_driver_name"));
	  
	  String SLBPrice = eldDashboardPage.getDriverIdTitle(); sa.assertEquals(SLBPrice,
	  getStrings().get("eldDashboard_page_driver_id"));
	  
	  sa.assertAll(); 
	  }	

}
