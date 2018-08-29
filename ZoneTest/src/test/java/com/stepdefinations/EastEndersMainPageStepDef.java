package com.stepdefinations;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class EastEndersMainPageStepDef extends AbstractMain {
	
	@When("^I should see EastEnders HomePage$")
	public void i_should_see_EastEnders_HomePage() throws Throwable {
		eemainpage.is_EastEnders_Page_Displayed();
	   
	}

	@Then("^The time for the next episode is displayed on the right$")
	public void i_verfiy_the_time_of_next_episode_is_displayed() throws Throwable {
		Assert.assertTrue("The time for the next episode is not displayed on the right",eemainpage.isEpisodeTimeDisplayedOnRight());



	}

}
