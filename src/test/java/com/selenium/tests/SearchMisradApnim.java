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
        wd.navigate().to("https://www.gov.il/");

    }
    @Test
    public void searchFromNavMenuTest(){
        //click on Kablat Kahal
        wd.findElement(By.cssSelector("#tm-4")).click();
        // get page titel
        // hello
        String pageTitle = wd.findElement(By.cssSelector("h1")).getText();
        System.out.println(pageTitle);



    }
    @AfterMethod (enabled = false)
    public void tearDown(){
        wd.quit();

    }
}
