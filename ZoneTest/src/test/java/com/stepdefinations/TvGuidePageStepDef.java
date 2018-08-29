package com.stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.When;

public class TvGuidePageStepDef extends AbstractMain {
	
	@When("^I should see TV Guide Page$")
	public void i_should_see_TV_Guide_Page() throws Throwable {
		String expectedTitle="BBC iPlayer - TV Guide - London - ";

		Assert.assertTrue("TV Guide page not displayed", driver.getTitle().contains(expectedTitle));

	}


	@And("^EastEnder time is shown under BBC one rows and check the time for the next episode$")
	public void eastenderTimeIsShownUnderBBCOneRowsAndCheckTheTimeForTheNextEpisode() throws Throwable {
		tvguidepage.getEastEnderTime();
	}
}
