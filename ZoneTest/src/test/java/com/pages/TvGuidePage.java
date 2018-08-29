package com.pages;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TvGuidePage extends AbstractMain{
	private static By EASTENDER_TIME=By.xpath("//h2[contains(text(),'EastEnders')]/../p");

	public void getEastEnderTime() {
		
	for(int i=7;i<=14;i++){
		driver.findElements(By.xpath("//a[contains(@class,'day-nav__link')]")).get(i).click();
			if(driver.findElements(EASTENDER_TIME).size()> 0) {
				String[] parts = driver.getCurrentUrl().split("/");
				System.out.println("The Next EastEnder Program Date is: "+parts[parts.length-1]+ " And Time - "+driver.findElement(EASTENDER_TIME).getText());

			}

		}
	}
		


}


