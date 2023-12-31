package com.ohrm.driver;


import com.ohrm.exceptions.BrowserInvocationFailedException;
import com.ohrm.factories.ConfigFactory;
import com.ohrm.factories.DriverFactory;

import java.net.MalformedURLException;
import java.util.Objects;


public final class Driver {

    private Driver() {
    }

    public static void initDriver() {
        String browser = ConfigFactory.getConfig().browser();
        if (Objects.isNull(DriverManager.getDriver())) {
            try {
                DriverManager.setDriver(DriverFactory.getDriver(browser, ConfigFactory.getConfig().runmode()));

            } catch (MalformedURLException e) {
                throw new BrowserInvocationFailedException("Please check the capabilities of browser");
            }
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
        }
    }

    public static void quitDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
            DriverManager.unload();
        }
    }
}
