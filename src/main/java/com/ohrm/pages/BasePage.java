package com.ohrm.pages;

import com.ohrm.driver.DriverManager;
import com.ohrm.enums.WaitType;
import com.ohrm.factories.ConfigFactory;
import com.ohrm.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static void click(By by, String elementName) {
        waitUtilElementPresent(by).click();
        ExtentLogger.pass(elementName + " is clicked successfully");
    }

    public static void sendKeys(By by, String value, String elementName) {
        WebElement element = waitUtilElementPresent(by);
        element.sendKeys(value);
        ExtentLogger.pass(elementName + " is entered " + " successfully in ");
    }

    public static void click(By by, WaitType waitType) {
        WebElement element = null;
        if (waitType == WaitType.PRESENCE) {
            element = waitUtilElementPresent(by);
        } else if (waitType == WaitType.CLICKABLE) {
            element = waitUtilElementClickable(by);
        }
        element.click();
    }

    public static WebElement waitUtilElementPresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofMillis(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static WebElement waitUtilElementClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofMillis(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
