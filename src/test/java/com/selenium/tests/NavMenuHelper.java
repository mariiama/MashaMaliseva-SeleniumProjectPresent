package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavMenuHelper extends HelperBase{
    public NavMenuHelper(WebDriver wd) {
        super(wd);
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
}
