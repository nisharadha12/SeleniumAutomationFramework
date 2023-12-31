package com.ohrm.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    public static ThreadLocal<WebDriver> webdriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return webdriver.get();
    }

    public static void setDriver(WebDriver wedref) {
        webdriver.set(wedref);
    }

    public static void unload() {
        webdriver.remove();
    }

}
