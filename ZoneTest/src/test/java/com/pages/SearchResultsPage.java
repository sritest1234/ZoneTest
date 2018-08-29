package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage extends AbstractMain{
	private static By CLICK_ON_HEADER_LINK= By.linkText("EastEnders");
	
	public void select_EastEnders_Header_Link() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(CLICK_ON_HEADER_LINK));
		driver.findElement(CLICK_ON_HEADER_LINK).click();
	}

	public void is_Search_Results_Page_Displayed(){
		Assert.assertEquals("BBC - Search results for EastEnders",driver.getTitle());
	}

}
