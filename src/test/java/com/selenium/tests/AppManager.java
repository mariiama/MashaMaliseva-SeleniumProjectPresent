package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AppManager {
    WebDriver wd;
    NavMenuHelper navMenuHelper;
    SiteHelper siteHelper;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait (20, TimeUnit.SECONDS);
        openSite("https://www.gov.il/");
        navMenuHelper = new NavMenuHelper(wd);
        siteHelper = new SiteHelper(wd);
    }

    public NavMenuHelper getNavMenuHelper() {
        return navMenuHelper;
    }

    public SiteHelper getSiteHelper() {
        return siteHelper;
    }

    public void openSite(String url) {
        wd.navigate().to(url); }
}
