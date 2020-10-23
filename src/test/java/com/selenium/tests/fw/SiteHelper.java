package com.selenium.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SiteHelper extends HelperBase {

    public SiteHelper(WebDriver wd) {
        super(wd);
    }

    public void type(By locator, String text) throws InterruptedException {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
    public void stop() throws InterruptedException {
        Thread.sleep(2000);
    }
    public void openPageJerusalimCenter() {
        wd.findElement(By.cssSelector("[data-index='0']")).click();
    }
}