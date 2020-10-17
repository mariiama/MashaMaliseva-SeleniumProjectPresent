package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchMisradApnim {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait (20, TimeUnit.SECONDS);
        openSite("https://www.gov.il/");

    }

    @Test
    public void searchFromSite() throws InterruptedException {

        type(By.cssSelector("[id='SearchInput']"), "רשות האוכלוסין במרכז ירושלים");
        Thread.sleep(2000);
        openPageJerusalimCenter();
    }

    @Test
    public void searchFromNavMenuTest() throws InterruptedException {
        fillingOutTheSearchForm();
        Thread.sleep(3000);
        openPageCenterJerusalim();
    }

    public void type(By locator, String text) throws InterruptedException {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
    public void openPageJerusalimCenter() {
        wd.findElement(By.cssSelector("[data-index='0']")).click();
    }
    public void fillingOutTheSearchForm() {
        wd.findElement(By.cssSelector("#tm-4")).click();
        wd.findElement(By.cssSelector("[id='FreeText']")).sendKeys("מרכז");
        wd.findElement(By.cssSelector("[id='autocompleteInput']")).sendKeys("רשות האוכלוסין");
        wd.findElement(By.cssSelector("[index='0']")).click();
        wd.findElement(By.cssSelector("[id='city']"));
        wd.findElement(By.xpath("//option[contains(text(),'ירושלים')]")).click();
    }
    public void openPageCenterJerusalim() {
        wd.findElement(By.cssSelector("[ng-click='isOpen=!isOpen;getStationStatus(item.StationID,isOpen)']")).click();
        wd.findElement(By.xpath("//span[contains(text(),'לפרטים נוספים')]")).click();
    }

    @AfterMethod (enabled = false)
    public void tearDown(){ wd.quit(); }
    
    public void openSite(String url) {
    wd.navigate().to(url);
}

}
