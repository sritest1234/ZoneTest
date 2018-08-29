package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class TvIconPage extends AbstractMain {
	private static By CLICK_ON_TV_GUIDE= By.cssSelector(".tv-nav-epg-link");
	
	public void select_Tv_Guide() {
		
		driver.findElement(CLICK_ON_TV_GUIDE).click();
	}

}
