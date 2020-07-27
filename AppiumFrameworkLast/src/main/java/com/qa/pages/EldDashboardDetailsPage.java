package com.qa.pages;

import com.qa.BaseTest;
import com.qa.MenuPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EldDashboardDetailsPage extends MenuPage {
	TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.view")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther")
	private MobileElement DriverTitle;

	@AndroidFindBy(xpath = "")
	@iOSXCUITFindBy(xpath = "")
	private MobileElement VehicleTitle;





}
