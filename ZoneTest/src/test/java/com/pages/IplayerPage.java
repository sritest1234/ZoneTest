package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IplayerPage extends AbstractMain {
	private static By CLICK_ON_TV_GUIDE = By.linkText("TV Guide");

	public void is_Iplayer_Page_Displayed(){
		Assert.assertEquals("BBC iPlayer",driver.getTitle());
	}
	
	public void select_Tv_Guide_On_Iplayer_Page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(CLICK_ON_TV_GUIDE));
		driver.findElement(CLICK_ON_TV_GUIDE).click();
	}



}
