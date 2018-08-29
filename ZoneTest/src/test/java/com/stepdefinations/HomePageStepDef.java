package com.stepdefinations;



import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStepDef extends AbstractMain {

	@Given("^I am in HomePage$")
	public void i_am_in_HomePage() throws Throwable {
		homepage.start();
		Assert.assertEquals("BBC - Home",driver.getTitle());

	}

	@When("^I select the \"([^\"]*)\" icon in top bar$")
    public void i_select_the_something_icon_in_top_bar(String topItemName) throws Throwable {
		homepage.selectTopBarItem(topItemName.toLowerCase());
        
    }
	@When("^I enter \"([^\"]*)\" into search textbox$")
	public void i_enter_data_into_search_textbox_something(String searchTerm) throws Throwable {
		homepage.search_With_EastEnders(searchTerm);
	}

	@When("^I select first EastEnders on the search suggestion list$")
	public void i_select_first_EastEnders_on_the_search_suggestion_list() throws Throwable {
		homepage.select_First_EastEnders_From_List();
	    
	}
	
	@When("^I select the \"([^\"]*)\" Page$")
	public void i_select_the_iPlayer_tab(String topItemName) throws Throwable {
		homepage.selectTopBarItem(topItemName.toLowerCase());
	   
	}


}
