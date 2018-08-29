package com.stepdefinations;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.When;
import org.junit.Assert;

public class TvIconPageStepDef extends AbstractMain {

	@When("^I should see the TV icon Page$")
	public void i_should_see_the_TV_icon_Page() throws Throwable {
		Assert.assertEquals("BBC - TV - On Now", driver.getTitle());
	}
	
	@When("^I select TV Guide$")
	public void i_select_TV_Guide() throws Throwable {
	    tviconpage.select_Tv_Guide();
	}

}
