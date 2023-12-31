package com.ohrm.pages;

import org.openqa.selenium.By;

public class LoginPage {
    private final By txtboxUsername = By.name("username");
    private final By txtboxPassword = By.xpath("//input[@name='password' and @type='password']");
    private final By btnLogin = By.xpath("//button[@type='submit']");

    private LoginPage setUserName(String username) {
        BasePage.sendKeys(txtboxUsername, username, "Username");
        return this;
    }
    private LoginPage setPassword(String password) {
        BasePage.sendKeys(txtboxPassword, password, "Password");
        return this;
    }
    private HomePage clickLogin() {
        BasePage.click(btnLogin, "Login Button");
        return new HomePage();
    }
    public HomePage setLogin(String username, String password) {
        return setUserName(username)
                .setPassword(password)
                .clickLogin();
    }
}
