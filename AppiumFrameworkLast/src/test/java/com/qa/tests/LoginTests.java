package com.qa.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.EldDashboardPage;
import com.qa.reports.ExtentReport;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
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

public class LoginTests extends BaseTest{
	LoginPage loginPage;
	EldDashboardPage eldDashboardPage;
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
		  } catch(Exception e) {
			  e.printStackTrace();
			  throw e;
		  } finally {
			  if(datais != null) {
				  datais.close();
			  }
		  }
		  closeApp();
		  launchApp();
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
		  closeApp();
		  launchApp();
	  }

	  @AfterMethod
	  public void afterMethod() {		  
	  }
	  
	  @Test
	  public void employeeIDempty() {
		  loginPage.enterUserName(loginUsers.getJSONObject("invalidUser").getString("username"));
		  loginPage.enterPassword(loginUsers.getJSONObject("invalidUser").getString("password"));
		  loginPage.enterRegistration(loginUsers.getJSONObject("invalidUser").getString("enterRegistration"));
		  loginPage.pressLoginBtn();
		  
		  String actualErrTxt = loginPage.getErrTxt();
		  String expectedErrTxt = getStrings().get("err_invalid_username_or_password");
		  
		  Assert.assertEquals(actualErrTxt, expectedErrTxt);
	  }
	  
	  @Test
	  public void lastNameEmpty() {
		  loginPage.enterUserName(loginUsers.getJSONObject("invalidPassword").getString("username"));
		  loginPage.enterPassword(loginUsers.getJSONObject("invalidPassword").getString("password"));
		  loginPage.enterRegistration(loginUsers.getJSONObject("invalidPassword").getString("enterRegistration"));
		  loginPage.pressLoginBtn();
		  		  
		  String actualErrTxt = loginPage.getErrNameTxt();
		  String expectedErrTxt = getStrings().get("err_empty_name");
		  
		  Assert.assertEquals(actualErrTxt, expectedErrTxt);
	  }
	  
	  @Test
	  public void successfulLogin() {
		  loginPage.enterUserName(loginUsers.getJSONObject("validUser").getString("username"));
		  loginPage.enterPassword(loginUsers.getJSONObject("validUser").getString("password"));
		  loginPage.enterRegistration(loginUsers.getJSONObject("validUser").getString("enterRegistration"));
		  eldDashboardPage = loginPage.pressLoginBtn();
		  		  
		  String actualDashboardTitle = eldDashboardPage.getTitle();		  
		  String expectedDashboardTitle = getStrings().get("dashboard_title");
		  
		  Assert.assertEquals(actualDashboardTitle, expectedDashboardTitle);
	  }
}
