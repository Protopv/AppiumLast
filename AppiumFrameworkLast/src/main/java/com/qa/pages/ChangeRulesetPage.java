package com.qa.pages;

import org.openqa.selenium.Keys;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ChangeRulesetPage extends BaseTest {

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Non DOT']")
	@iOSXCUITFindBy
	private MobileElement nonDotRuleset;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='US 8 Day']")
	@iOSXCUITFindBy
	private MobileElement us8DayRuleset;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='US Oil 8 Day']")
	@iOSXCUITFindBy
	private MobileElement usOil8DayRuleset;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='US Home Office']")
	@iOSXCUITFindBy
	private MobileElement usHomeOfficeRuleset;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Texas Oil 7']")
	@iOSXCUITFindBy
	private MobileElement texasOil7Ruleset;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Canada 2007 Cycle 1']")
	@iOSXCUITFindBy
	private MobileElement canada2007Cycle1Ruleset;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Canada 2007 Cycle 2']")
	@iOSXCUITFindBy
	private MobileElement canada2007Cycle2Ruleset;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Canada 2007 60 Degrees Cycle 1']")
	@iOSXCUITFindBy
	private MobileElement canada200760DegreesCycle1;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Canada 2007 60 Degrees Cycle 2']")
	@iOSXCUITFindBy
	private MobileElement canada200760DegreesCycle2;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Canada 2007 Oil Field Permit']")
	@iOSXCUITFindBy
	private MobileElement canada2007OilFieldPermit;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Canada 2007 60 Degrees Oil Field Permit']")
	@iOSXCUITFindBy
	private MobileElement canada200760DegreesOilFieldPermit;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='US 7 Day']")
	@iOSXCUITFindBy
	private MobileElement us7DayRuleset;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='US Water Well Driller 7 Day']")
	@iOSXCUITFindBy
	private MobileElement usWaterWellDriller7Day;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='US Water Well Driller 8 Day']")
	@iOSXCUITFindBy
	private MobileElement usWaterWellDriller8Day;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='US Oil 8 Day - No Wait Exemption']")
	@iOSXCUITFindBy
	private MobileElement usOil8DayNoWaitExemption;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='US Passenger Carrying 8 Day']")
	@iOSXCUITFindBy
	private MobileElement usPassengerCarrying8Day;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Oklahoma 8 Day']")
	@iOSXCUITFindBy
	private MobileElement oklahoma8Day;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Oklahoma 7 Day']")
	@iOSXCUITFindBy
	private MobileElement oklahoma7Day;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Alaska 8 Day']")
	@iOSXCUITFindBy
	private MobileElement alaska8Day;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='California 8 day']")
	@iOSXCUITFindBy
	private MobileElement california8day;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
	@iOSXCUITFindBy
	private MobileElement nextBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
	@iOSXCUITFindBy
	private MobileElement submitBtn;
//enter************************************************************************************************		

//press************************************************************************************************	
	

	
	
	
	
	public ChangeRulesetPage pressNextBtn() {
		click(nextBtn, "press next button");
		return new ChangeRulesetPage();
	}

	public EldDashboardPage pressSubmitBtn() {
		click(submitBtn, "click Submit Button ");
		return new EldDashboardPage();
	}

	public ChangeRulesetPage pressCalifornia8day() {
		click(california8day, "press California 8 day");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressAlaska8Day() {
		click(alaska8Day, "press Alaska 8 Day");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressOklahoma7Day() {
		click(oklahoma7Day, "press Oklahoma 7 Day");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressOklahoma8Day() {
		click(oklahoma8Day, "press Oklahoma 8 Day");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressUsPassengerCarrying8Day() {
		click(usPassengerCarrying8Day, "press US Passenger Carrying 8 Day");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressUsOil8DayNoWaitExemption() {
		click(usOil8DayNoWaitExemption, "press US Oil 8 Day - No Wait Exemption");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressUsWaterWellDriller8Day() {
		click(usWaterWellDriller8Day, "press US Water Well Driller 8 Day");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressUsWaterWellDriller7Day() {
		click(usWaterWellDriller7Day, "press US Water Well Driller 7 Day");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressUs7DayRuleset() {
		click(us7DayRuleset, "press US 7 Day");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressCanada200760DegreesOilFieldPermit() {
		click(canada200760DegreesOilFieldPermit, "press Canada 2007 60 Degrees Oil Field Permit Ruleset");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressCanada2007OilFieldPermit() {
		click(canada2007OilFieldPermit, "press Canada 2007 Oil Field Permit Ruleset");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressCanada200760DegreesCycle2() {
		click(canada200760DegreesCycle2, "press Canada 2007 60 Degrees Cycle 2 Ruleset");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressCanada200760DegreesCycle1() {
		click(canada200760DegreesCycle1, "press Canada 2007 60 Degrees Cycle 1 Ruleset");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressCanada2007Cycle2RulesetRuleset() {
		click(canada2007Cycle2Ruleset, "press Canada 2007 Cycle 2 Ruleset");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressCanada2007Cycle1RulesetRuleset() {
		click(canada2007Cycle1Ruleset, "press Canada 2007 Cycle 1 Ruleset");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressTexasOil7Ruleset() {
		click(texasOil7Ruleset, "press Texas Oil 7 Ruleset");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressusHomeOfficeRulesetBtn() {
		click(usHomeOfficeRuleset, "press US Home Office Ruleset");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressUsOil8DayRulesetBtn() {
		click(usOil8DayRuleset, "press US Oil 8 Day Ruleset");
		return new ChangeRulesetPage();
	}

	public ChangeRulesetPage pressNonDotRulesetBtn() {
		click(nonDotRuleset, "press Non DOT Ruleset");
		return new ChangeRulesetPage();
	}

	public EldDashboardPage pressUs8DayRulesetBtn() {
		click(us8DayRuleset, "press US 8 Day Ruleset");
		return new EldDashboardPage();
	}
// get************************************************************************************************


	public String scrollToTroubleshootingBtn() {
		return getText(scrollToElement(), "scroll To Element");
	}

	

	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='US 8 Day']") 
	@iOSXCUITFindBy 
	private MobileElement eldDashboardRuleSetUs8Day;
	
	public String getRuleSetUs8Day() {
		String title = getText(eldDashboardRuleSetUs8Day, "RulSeta is - US 8 Day");
		return title;
	}
	
	
	
}
