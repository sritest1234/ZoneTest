package com.stepdefinations;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.When;

public class SearchResultsPageStepDef extends AbstractMain {
	
	@When("^I should see EastEnders search results page$")
	public void i_should_see_EastEnders_search_results_page() throws Throwable {
		searchresultspage.is_Search_Results_Page_Displayed();
	    
	}

	@When("^I select EastEnders header link$")
	public void i_select_EastEnders_header_link() throws Throwable {
		searchresultspage.select_EastEnders_Header_Link();
	    
	}

}
