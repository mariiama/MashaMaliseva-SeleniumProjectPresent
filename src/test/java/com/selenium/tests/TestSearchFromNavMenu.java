package com.selenium.tests;

import org.testng.annotations.Test;

public class TestSearchFromNavMenu extends TestBase {

    @Test
    public void searchFromNavMenuTest() throws InterruptedException {
       appManager.getNavMenuHelper().fillingOutTheSearchForm();
        Thread.sleep(3000);
        appManager.getNavMenuHelper().openPageCenterJerusalim();
    }

}
