package com.stepdefinations;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.When;

public class IplayerPageStepDef extends AbstractMain {
	
	
	@When("^I select TV Guide on iPlayer page$")
	public void i_select_TV_Guide_on_iPlayer_page() throws Throwable {
		
		iplayerpage.select_Tv_Guide_On_Iplayer_Page();
	    
	}
	@When("^I should see the iPlayer page$")
	public void i_should_see_the_iPlayer_page() throws Throwable {
		iplayerpage.is_Iplayer_Page_Displayed();
	    
	}


}
