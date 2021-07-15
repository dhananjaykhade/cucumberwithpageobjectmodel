package com.cas.tests.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cas.framework.Keywords;

public class LoginPage {
	@CacheLookup
	@FindBy(xpath = "//button[@name='login']")
	WebElement SignIn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='email']")
	WebElement emailid;

	@CacheLookup
	@FindBy(xpath = "//input[@name='pass']")
	WebElement passwd;

	public void enterUname(String value) {

		emailid.sendKeys(value);
	}

	public void enterPass(String password) {

		passwd.sendKeys(password);
	}

	public void clickOnSignButton() {
		SignIn.click();

	}

}
