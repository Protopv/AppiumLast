package com.qa.pages;

import org.openqa.selenium.Keys;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BaseTest {
	TestUtils utils = new TestUtils();
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='Employee ID']") 
	@iOSXCUITFindBy (id = "test-Employee")
	private MobileElement employeeIdFld;
	

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Last Name']") 
	@iOSXCUITFindBy (id = "test-Password")
	private MobileElement lastNameFld;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Registration code']")
	
	@iOSXCUITFindBy (id = "Registration code")
	private MobileElement registrationTxtFld;
	

	
	@AndroidFindBy (className = "android.widget.Button") 
	@iOSXCUITFindBy (id = "test-LOGIN")
	private MobileElement loginBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Last name is empty']")
	@iOSXCUITFindBy (id = "Last name is empty")
	private MobileElement errNameTxt;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Employee ID is empty']") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
	private MobileElement errTxt;
	
public LoginPage enterUserName(String username) {
	clear(employeeIdFld);	
	sendKeys(employeeIdFld, username, "login with " + username);
	return this;
}

public LoginPage enterPassword(String password) {
	clear(lastNameFld);
	sendKeys(lastNameFld, password, "Last Name is " + password);
	return this;
}

public LoginPage enterRegistration(String registration) {
	clear(registrationTxtFld);
	sendKeys(registrationTxtFld, registration, "registration is " + registration);
	return this;
}	

public EldDashboardPage pressLoginBtn() {
	click(loginBtn, "press login button");
	return new EldDashboardPage();
}

public EldDashboardPage login(String username, String password, String registration) {
	enterUserName(username);
	enterPassword(password);
	enterRegistration(registration);
	return pressLoginBtn();
}

public String getErrTxt() {
	String err = getText(errTxt, "error text is - " + errTxt);
	return err;
}
public String getErrNameTxt() {
	String err = getText(errNameTxt, "error text is - " + errNameTxt);
	return err;
}

}
