package com.cas.glue.stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.cas.framework.Keywords;
import com.cas.tests.pageobject.LoginPage;

import io.cucumber.java.en.Given;

public class steps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		Keywords.openBrowser();
		Keywords.launchUrl();

		LoginPage lp = PageFactory.initElements(Keywords.driver, LoginPage.class);
		lp.enterUname("Test@ymail.com");
		lp.enterPass("Admin321@");
		lp.clickOnSignButton();
	}

}
