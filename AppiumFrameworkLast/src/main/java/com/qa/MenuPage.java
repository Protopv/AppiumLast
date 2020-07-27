package com.qa;

import com.qa.pages.DriverPerformancePage;
import com.qa.pages.EldDashboardPage;
import com.qa.pages.EldDriverMenualPage;
import com.qa.pages.SettingsPage;
import com.qa.pages.TeamManagementPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MenuPage extends BaseTest{
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (className = "android.widget.ImageButton") 
	@iOSXCUITFindBy (className = "android.widget.Button")
	private MobileElement settingsBtn;
	
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='ELD Driver Manual']")  //class and text
	@iOSXCUITFindBy (className = "android.widget.Button")
	private MobileElement eldDriverMenualBtn;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Driver Performance']") 
	@iOSXCUITFindBy (className = "android.widget.Button")
	private MobileElement driverPerformanceBtn;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Team Management']") 
	@iOSXCUITFindBy (className = "android.widget.Button")
	private MobileElement teamManagementBtn;
	
	@AndroidFindBy (id = "eld_dashboard_driver_name") 
	@iOSXCUITFindBy (className = "android.widget.Button")
	private MobileElement menuDriverNameGet;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='ELD Dashboard']") 
	@iOSXCUITFindBy (className = "android.widget.Button")
	private MobileElement eldDashboardBtn;
//*****************************************************************************************************	
	
// press
	
	public SettingsPage pressSettingsBtn() {
		click(settingsBtn, "press Settings button");
		return new SettingsPage();
	}
	
	public EldDriverMenualPage pressEldDriverMenualBtn() {
		click(eldDriverMenualBtn, "press Eld Driver Menuals button");
		return new EldDriverMenualPage();
	}
	
	public DriverPerformancePage pressDriverPerformanceBtn() {
		click(driverPerformanceBtn, "press Driver Performance button");
		return new DriverPerformancePage();
	}
	
	public TeamManagementPage pressTeamManagementBtn() {
		click(driverPerformanceBtn, "press Driver Performance button");
		return new TeamManagementPage();
	}
	
	public EldDashboardPage pressEldDashboardBtn() {
		click(eldDashboardBtn, "press Eld Dashboard Page button");
		return new EldDashboardPage();
	}
//***************************************************************************************************
	
	public String getTitle() {
		String title = getText(menuDriverNameGet, "dashboard page title is - ");
		return title;
	}

}
