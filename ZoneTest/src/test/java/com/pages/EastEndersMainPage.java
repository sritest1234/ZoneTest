package com.pages;

import com.cucumberrunner.AbstractMain;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EastEndersMainPage extends AbstractMain{
    private static By EPISODE_TIME = By.cssSelector(".br-box-secondary .gel-great-primer-bold");

    public void is_EastEnders_Page_Displayed(){

        Assert.assertEquals("BBC One - EastEnders",driver.getTitle());
    }
    public boolean isEpisodeTimeDisplayedOnRight(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(EPISODE_TIME));
        return driver.findElement(EPISODE_TIME).isDisplayed();
    }

}
