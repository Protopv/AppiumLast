package com.qa.pages;

import com.qa.BaseTest;
import com.qa.MenuPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EldDashboardPage extends MenuPage {
	TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ELD Dashboard']")
	@iOSXCUITFindBy(xpath = "//widget.TextView[@text='ELD Dashboard']")
	private MobileElement dashboardTitleTxt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Admin01 Admin01']")
	@iOSXCUITFindBy(xpath = "//widget.TextView[@text='Admin01 Admin01']")
	private MobileElement DriverNameTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='id: ADMIN01']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"test-Price\"])[1]")
	private MobileElement DriverIdTitle;

	@AndroidFindBy(className = "android.widget.ImageButton")
	@iOSXCUITFindBy(className = "android.widget.Button")
	private MobileElement menuBtn;

	@AndroidFindBy (id = "com.inthinc.connectApplication:id/eld_dashboard_hos_card")
	@iOSXCUITFindBy
	private MobileElement dutyStateWizard;
	
	
	@AndroidFindBy (className = "android.widget.FrameLayout")  
	@iOSXCUITFindBy 
	private MobileElement chengeRulSetaBtn;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='US 8 Day']") 
	@iOSXCUITFindBy 
	private MobileElement eldDashboardRuleSetUs8Day;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='US Oil 8 Day']") 
	@iOSXCUITFindBy 
	private MobileElement eldDashboardRuleSetUsOil8Day;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='US Home Office']") 
	@iOSXCUITFindBy 
	private MobileElement eldDashboardRuleUSHomeOffice;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Texas Oil 7']") 
	@iOSXCUITFindBy 
	private MobileElement eldDashboardRuleTexasOil7;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Canada 2007 Cycle 1']") 
	@iOSXCUITFindBy 
	private MobileElement eldDashboardRuleCanada2007Cycle1;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Canada 2007 Cycle 2']") 
	@iOSXCUITFindBy 
	private MobileElement eldDashboardRuleCanada2007Cycle2;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Canada 2007 60 Degrees Cycle 1']") 
	@iOSXCUITFindBy 
	private MobileElement eldDashboardRuleCanada200760DegreesCycle1;

// press***********************************************************************************************	
	public MenuPage pressMenuBtn() {
		click(menuBtn, "press Menu button");
		return new MenuPage();
	}

	public EldDutyStatePage pressDutyStateWizard() {
		click(dutyStateWizard, "press Duty State Wizard");
		return new EldDutyStatePage();
	}

	public ChangeRulesetPage pressChengeRulSetaBtn() {
		click(chengeRulSetaBtn, "press Chenge RulSeta");
		return new ChangeRulesetPage();
	}

// get***********************************************************************************************	
	public String getCanada200760DegreesCycle1() {
		String title = getText(eldDashboardRuleCanada200760DegreesCycle1, "RulSeta is - Canada 2007 60 Degrees Cycle 1");
		return title;
	}
	
	public String getCanada2007Cycle2() {
		String title = getText(eldDashboardRuleCanada2007Cycle2, "RulSeta is - Canada 2007 Cycle 2");
		return title;
	}
	
	public String getCanada2007Cycle1() {
		String title = getText(eldDashboardRuleCanada2007Cycle1, "RulSeta is - Canada 2007 Cycle 1");
		return title;
	}
	public String getTexasOil7() {
		String title = getText(eldDashboardRuleTexasOil7, "RulSeta is - Texas Oil 7");
		return title;
	}
	
	public String getRuleUSHomeOffice() {
		String title = getText(eldDashboardRuleUSHomeOffice, "RulSeta is - US Home Office");
		return title;
	}
	public String getRuleSetUs8Day() {
		String title = getText(eldDashboardRuleSetUs8Day, "RulSeta is - US 8 Day");
		return title;
	}
	
	public String getRuleSetUsOil8Day() {
		String title = getText(eldDashboardRuleSetUsOil8Day, "RulSeta is - US Oil 8 Day");
		return title;
	}
	
	public String getTitle() {
		String title = getText(dashboardTitleTxt, "dashboard page title is - ");
		return title;
	}

	public String getDriverNameTitle() {
		String title = getText(DriverNameTitle, "title is - ");
		return title;
	}

	public String getDriverIdTitle() {
		String title = getText(DriverIdTitle, "Driver ID is - ");
		return title;
	}

}
