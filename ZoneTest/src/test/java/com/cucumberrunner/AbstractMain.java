package com.cucumberrunner;


import org.openqa.selenium.WebDriver;

import com.pages.EastEndersMainPage;
import com.pages.HomePage;
import com.pages.IplayerPage;
import com.pages.SearchResultsPage;
import com.pages.TvGuidePage;
import com.pages.TvIconPage;

public class AbstractMain {
	
	public static WebDriver driver;
	public static HomePage homepage=new HomePage();
	public static TvIconPage tviconpage=new TvIconPage();
	public static TvGuidePage tvguidepage=new TvGuidePage();
	public static SearchResultsPage searchresultspage=new SearchResultsPage();
	public static EastEndersMainPage eemainpage=new EastEndersMainPage();
	public static IplayerPage iplayerpage=new IplayerPage();


}
