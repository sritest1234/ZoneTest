package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberrunner.AbstractMain;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends AbstractMain {
	private static String BASE_URL = "https://www.bbc.co.uk/";
	private static By SEARCH_TEXTBOX = By.cssSelector("#orb-search-q");
	private static By SELECT_FROM_LIST = By.cssSelector(".se-search-suggestion");
	private static By TOPBAR_ICON(String topItemName) {
		return By.cssSelector((".orb-nav-"+topItemName));
	}
	public void start() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to(BASE_URL);
		driver.manage().window().maximize();

	}
	public void selectTopBarItem(String topItemName) {
		driver.findElement(TOPBAR_ICON(topItemName)).click();
			
	}
	public void search_With_EastEnders(String searchterm) {
		
		driver.findElement(SEARCH_TEXTBOX).clear();
		driver.findElement(SEARCH_TEXTBOX).sendKeys(searchterm);
		
		
	}
	public void select_First_EastEnders_From_List() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SELECT_FROM_LIST));
		driver.findElements(SELECT_FROM_LIST).get(0).click();
	}


}
