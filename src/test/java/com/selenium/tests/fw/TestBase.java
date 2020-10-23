package com.selenium.tests.fw;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public static AppManager appManager = new AppManager();

    @BeforeMethod
    public void setUp(){
        appManager.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown(){ appManager.wd.quit(); }

}
