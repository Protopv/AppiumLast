package com.qa.pages;

import com.qa.BaseTest;
import com.qa.MenuPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TroubleshootingPage extends BaseTest {
	TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Troubleshooting Log']")
	@iOSXCUITFindBy
	private MobileElement troubleshootingLogTitle;

	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_text_field")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther")
	private MobileElement troubleshootingPwFld;

//************************************************************************************************

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
	@iOSXCUITFindBy
	private MobileElement nextBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Back']")
	@iOSXCUITFindBy
	private MobileElement backBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
	@iOSXCUITFindBy
	private MobileElement cancelBtn;

//************************************************************************************************	
	// seatbelt state Btn
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Get seatbelt state']")
	@iOSXCUITFindBy
	private MobileElement seatbeltBtn;
	// Get seatbelt state
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_scrolling_text")
	@iOSXCUITFindBy
	private MobileElement seatbeltStateGet;

//************************************************************************************************	
	// ignition state Btn
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Get ignition state']")
	@iOSXCUITFindBy
	private MobileElement ignitionStateBtn;
	// Get ignition state
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_scrolling_text")
	@iOSXCUITFindBy
	private MobileElement ignitionStateGet;

//************************************************************************************************	
	// Load eumulation file Btn
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Load eumulation file']")
	@iOSXCUITFindBy
	private MobileElement loadEumulationFileBtn;
	// Get Load eumulation file
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_scrolling_text")
	@iOSXCUITFindBy
	private MobileElement loadEumulationFileGet;

//************************************************************************************************	
	// Request configuration Btn
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Request configuration']")
	@iOSXCUITFindBy
	private MobileElement requestConfigurationBtn;
	// Get Request configuration
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_scrolling_text")
	@iOSXCUITFindBy
	private MobileElement requestConfigurationGet;

//************************************************************************************************	
	// Send configuration Btn
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Send configuration']")
	@iOSXCUITFindBy
	private MobileElement sendConfigurationBtn;
	// Get Request configuration
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_scrolling_text")
	@iOSXCUITFindBy
	private MobileElement sendConfigurationGet;

//************************************************************************************************	
	// Test satellite Btn
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Test satellite']")
	@iOSXCUITFindBy
	private MobileElement testSatelliteBtn;
	// Get Load eumulation file
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_scrolling_text")
	@iOSXCUITFindBy
	private MobileElement testSatelliteGet;

//************************************************************************************************	
	// Test gprs Btn
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Test gprs']")
	@iOSXCUITFindBy
	private MobileElement testGprsBtn;
	// Get Load eumulation file
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_scrolling_text")
	@iOSXCUITFindBy
	private MobileElement testGprsGet;

//************************************************************************************************	
	// Check odb data
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Check odb data']")
	@iOSXCUITFindBy
	private MobileElement checkOdbDataBtn;
	// Get Check odb data
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_scrolling_text")
	@iOSXCUITFindBy
	private MobileElement checkOdbDataGet;

//************************************************************************************************	
	// Put system to sleep
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Put system to sleep']")
	@iOSXCUITFindBy
	private MobileElement putSystemToSleepBtn;
	// Get Put system to sleep
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_scrolling_text")
	@iOSXCUITFindBy
	private MobileElement putSystemToSleepGet;

//************************************************************************************************	
	// Reboot system
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Reboot system']")
	@iOSXCUITFindBy
	private MobileElement rebootSystemBtn;
	// Get Reboot system
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_scrolling_text")
	@iOSXCUITFindBy
	private MobileElement rebootSystemGet;

//************************************************************************************************	
	// Program New Trailer ID
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Program New Trailer ID']")
	@iOSXCUITFindBy
	private MobileElement programNewTrailerIDBtn;
	// Get TATEL Program New Trailer ID
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Program New Trailer ID']")
	@iOSXCUITFindBy
	private MobileElement programNewTrailerIDTitleGet;
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_text_field")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther")
	private MobileElement troubleshootingTrailerIDFld;
	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_text_field_2")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther")
	private MobileElement troubleshootingConfirmTrailerIDFld;

//enter************************************************************************************************		
	public TroubleshootingPage enterTroubleshootingPassword(String password) {
		clear(troubleshootingPwFld);
		sendKeys(troubleshootingPwFld, password, "Troubleshooting Password is " + password);
		return this;
	}

	public TroubleshootingPage enterTroubleshootingNewTrailerID(String trailerID) {
		clear(troubleshootingTrailerIDFld);
		sendKeys(troubleshootingTrailerIDFld, trailerID, "New Trailer ID is " + trailerID);
		return this;
	}

	public TroubleshootingPage enterTroubleshootingConfirmNewTrailerID(String trailerID) {
		clear(troubleshootingConfirmTrailerIDFld);
		sendKeys(troubleshootingConfirmTrailerIDFld, trailerID, "New Confirm Trailer ID is " + trailerID);
		return this;
	}

//press************************************************************************************************ 
	public TroubleshootingPage pressNextBtn() {
		click(nextBtn, "press next button");
		return new TroubleshootingPage();
	}

	public TroubleshootingPage pressBackBtn() {
		click(backBtn, "press back button");
		return new TroubleshootingPage();
	}

	public TroubleshootingPage pressCancelBtn() {
		click(cancelBtn, "press cancel button");
		return new TroubleshootingPage();
	}

	public TroubleshootingPage pressSeatbeltBtn() {
		click(seatbeltBtn, "press Seatbelt button");
		return new TroubleshootingPage();
	}

	public TroubleshootingPage pressIgnitionBtn() {
		click(ignitionStateBtn, "press ignition button");
		return new TroubleshootingPage();
	}

	public TroubleshootingPage pressLoadEumulationFileBtn() {
		click(loadEumulationFileBtn, "press Eumulation File button");
		return new TroubleshootingPage();
	}

	public TroubleshootingPage pressRequestConfigurationBtn() {
		click(requestConfigurationBtn, "press Request Configuration button");
		return new TroubleshootingPage();
	}

	public TroubleshootingPage pressSendConfigurationBtn() {
		click(sendConfigurationBtn, "press Send Configuration button");
		return new TroubleshootingPage();
	}

	public TroubleshootingPage pressTestSatelliteBtn() {
		click(testSatelliteBtn, "press Test satellite button");
		return new TroubleshootingPage();
	}

	// Test gprs Btn
	public TroubleshootingPage pressTestGprsBtn() {
		click(testGprsBtn, "press Test gprs button");
		return new TroubleshootingPage();
	}

	// checkOdbDataBtn
	public TroubleshootingPage pressCheckOdbDataBtn() {
		click(checkOdbDataBtn, "press Check odb data button");
		return new TroubleshootingPage();
	}

	// Put system to sleep
	public TroubleshootingPage pressPutSystemToSleepBtn() {
		click(putSystemToSleepBtn, "press Put system to sleep button");
		return new TroubleshootingPage();
	}

	// Reboot system
	public TroubleshootingPage pressRebootSystemBtn() {
		click(rebootSystemBtn, "press Reboot system button");
		return new TroubleshootingPage();
	}

	// programNewTrailerID
	public TroubleshootingPage pressProgramNewTrailerIDBtn() {
		click(programNewTrailerIDBtn, "press program New Trailer ID button");
		return new TroubleshootingPage();
	}

//get************************************************************************************************				
	public String getTroubleshootingLogTitle() {
		String title = getText(troubleshootingLogTitle, "Troubleshooting title is - ");
		return title;
	}

	// Get seatbelt state
	public String getSeatbeltState() {
		String title = getText(seatbeltStateGet, "seatbelt state is - ");
		return title;
	}

	// Get ignition state
	public String getIgnitionState() {
		String title = getText(ignitionStateGet, "ignition state is - ");
		return title;
	}

	// Get Load eumulation file
	public String getLoadEumulationFile() {
		String title = getText(loadEumulationFileGet, "Load eumulation file is - ");
		return title;
	}

	// Get Request Configuration
	public String getRequestConfiguration() {
		String title = getText(requestConfigurationGet, "Request Configuration is - Request settings succeeded ");
		return title;
	}

	// Get Send configuration
	public String getSendConfiguration() {
		String title = getText(sendConfigurationGet, "Send Configuration is -  ");
		return title;
	}

	// Get Test satellite
	public String getTestSatellite() {
		String title = getText(testSatelliteGet, "Test satellite is -  ");
		return title;
	}

	// Get Test gprs
	public String getTestGprs() {
		String title = getText(testGprsGet, "Test Gprs is -  ");
		return title;
	}

	// Get BackBtn
	public String getBackBtn() {
		String title = getText(backBtn, "Back Btn is visible is -  ");
		return title;
	}

	// Get checkOdbDataBtn
	public String getCheckOdbDataBtn() {
		String title = getText(checkOdbDataGet, "Check odb data is -  ");
		return title;
	}

	// Get Put system to sleep Btn
	public String getPutSystemToSleepBtn() {
		String title = getText(putSystemToSleepGet,
				"Put system to sleep is - Please turn ignition off, wait 10s, and try again  ");
		return title;
	}

	// Get Reboot system Btn
	public String getRebootSystemBtn() {
		String title = getText(rebootSystemGet, "Get Reboot system is - Rebooting...  ");
		return title;
	}

	// Get programNewTrailerID Title
	public String getProgramNewTrailerIDTitle() {
		String title = getText(programNewTrailerIDTitleGet,
				"Get New Trailer ID Title is - Program New Trailer ID...  ");
		return title;
	}
}
