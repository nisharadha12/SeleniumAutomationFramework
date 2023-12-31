package com.ohrm.pages;


import com.ohrm.driver.DriverManager;

public class HomePage {

    public String getPageTitle(){
        return DriverManager.getDriver().getTitle();
    }
}
