package com.selenium.tests.tests;

import com.selenium.tests.fw.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSearchFronSite extends TestBase {

    @Test
    public void searchFromSite() throws InterruptedException {

        appManager.getSiteHelper().type(By.cssSelector("[id='SearchInput']"), "רשות האוכלוסין במרכז ירושלים");
        appManager.getSiteHelper().stop();
        appManager.getSiteHelper().openPageJerusalimCenter();
    }
}