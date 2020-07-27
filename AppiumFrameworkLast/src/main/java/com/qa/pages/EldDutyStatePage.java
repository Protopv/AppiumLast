package com.qa.pages;

import org.openqa.selenium.Keys;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EldDutyStatePage extends BaseTest {

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ELD Log In']")
	@iOSXCUITFindBy
	private MobileElement dutyStateTitle;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
	@iOSXCUITFindBy
	private MobileElement nextBtn;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Personal Use']")
	@iOSXCUITFindBy
	private MobileElement personalUseBtn;

	@AndroidFindBy(id = "com.inthinc.connectApplication:id/wizard_text_field")
	@iOSXCUITFindBy
	private MobileElement driverIndicationCommentFld;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='No']")
	@iOSXCUITFindBy
	private MobileElement answerIsNo;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Yes']")
	@iOSXCUITFindBy
	private MobileElement answerIsYes;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Submit']")
	@iOSXCUITFindBy
	private MobileElement submitBtn;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Off Duty']")
	@iOSXCUITFindBy
	private MobileElement offDutyBtn;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Sleeper Berth']")
	@iOSXCUITFindBy
	private MobileElement sleeperBerthBtn;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Driving']")
	@iOSXCUITFindBy
	private MobileElement drivingBtn;

	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='On-duty Not Driving']")
	@iOSXCUITFindBy
	private MobileElement onDutyNotDrivingBtn;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Off Duty Waiting']")
	@iOSXCUITFindBy
	private MobileElement offDutyWaitingBtn;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Clear Driver, Off Duty']")
	@iOSXCUITFindBy
	private MobileElement clearDriverOffDutyBtn;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Clear Driver, Off Duty Waiting']")
	@iOSXCUITFindBy
	private MobileElement clearDriverOffDutyWaitingBtn;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Clear Driver, Sleeper Berth']")
	@iOSXCUITFindBy
	private MobileElement clearDriverSleeperBerthBtn;
	
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Clear Driver, On-duty Not Driving']")
	@iOSXCUITFindBy
	private MobileElement clearDriverOnDutyNotDrivingBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sleeper Berth']")
	@iOSXCUITFindBy
	private MobileElement sleeperBerthDutyStateTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Personal Use']")
	@iOSXCUITFindBy
	private MobileElement personalUseDutyStateTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Driving']")
	@iOSXCUITFindBy
	private MobileElement drivingDutyStateTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Off Duty']")
	@iOSXCUITFindBy
	private MobileElement offDutyDutyStateTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='No Driver Logged In']")
	@iOSXCUITFindBy
	private MobileElement noDriverLoggedInStateTitle;
//enter************************************************************************************************		
	public EldDutyStatePage enterDriverIndicationCommen(String commen) {
		clear(driverIndicationCommentFld);
		sendKeys(driverIndicationCommentFld, commen, "Driver Indication Comment is " + commen);	
			
		return this;
	}

	
	
//press************************************************************************************************	

	public EldDutyStatePage pressClearDriverOnDutyNotDrivingBtn() {
		click(clearDriverOnDutyNotDrivingBtn, "press Clear Driver, On-duty Not Driving button");
		return new EldDutyStatePage();
	}
	
	public EldDutyStatePage pressClearDriverSleeperBerthBtn() {
		click(clearDriverSleeperBerthBtn, "press Clear Driver, Sleeper Berth button");
		return new EldDutyStatePage();
	}
	
	public EldDutyStatePage pressClearDriverOffDutyWaitingBtn() {
		click(clearDriverOffDutyWaitingBtn, "press Clear Driver, Off Duty Waiting button");
		return new EldDutyStatePage();
	}
	
	public EldDutyStatePage pressClearDriverOffDutyBtn() {
		click(clearDriverOffDutyBtn, "press Clear Driver, Off Duty button");
		return new EldDutyStatePage();
	}
	
	public EldDutyStatePage pressOffDutyWaitingBtn() {
		click(offDutyWaitingBtn, "press Off Duty Waiting button");
		return new EldDutyStatePage();
	}
	
	
	public EldDutyStatePage pressOnDutyNotDrivingBtn() {
		click(onDutyNotDrivingBtn, "press On-duty Not Driving button");
		return new EldDutyStatePage();
	}
	
	public EldDutyStatePage pressDrivingBtn() {
		click(drivingBtn, "press Driving button");
		return new EldDutyStatePage();
	}
	
	public EldDutyStatePage pressSleeperBerthBtn() {
		click(sleeperBerthBtn, "press Sleeper Berth button");
		return new EldDutyStatePage();
	}
	
	public EldDutyStatePage pressOffDutyBtn() {
		click(offDutyBtn, "press Off Duty button");
		return new EldDutyStatePage();
	}
	
	public EldDutyStatePage pressNextBtn() {
		click(nextBtn, "press next button");
		return new EldDutyStatePage();
	}

	public EldDutyStatePage pressPersonalUseBtn() {
		click(personalUseBtn, "press personal Use ");
		return new EldDutyStatePage();
	}
	
	public EldDutyStatePage pressAnswerIsNo() {
		click(answerIsNo, "click No ");
		return new EldDutyStatePage();
	}
	public EldDutyStatePage pressAnswerIsYes() {
		click(answerIsYes, "click Yes ");
		return new EldDutyStatePage();
	}
	public EldDashboardPage pressSubmitBtn() {
		click(submitBtn, "click Submit Button ");
		return new EldDashboardPage();
	}

// get************************************************************************************************
	public String getDutyStateTitle() {
		String title = getText(dutyStateTitle, "Duty State title is - ");
		return title;
	}
	
	public String getSleeperBerthDutyStateTitle() {
		String title = getText(sleeperBerthDutyStateTitle, "Duty State title is - ");
		return title;
	}
	
	public String getPersonalUseDutyStateTitle() {
		String title = getText(personalUseDutyStateTitle, "Duty State title is - ");
		return title;
	}
	
	public String getDrivingDutyStateTitle() {
		String title = getText(drivingDutyStateTitle, "Duty State title is - ");
		return title;
	}
	
	public String getOffDutyDutyStateTitle() {
		String title = getText(offDutyDutyStateTitle, "Duty State title is - ");
		return title;
	}
	
	public String getNoDriverLoggedInStateTitle() {
		String title = getText(noDriverLoggedInStateTitle, "Duty State title is - ");
		return title;
	}

}
