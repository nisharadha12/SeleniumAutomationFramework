package com.ohrm.tests;

import com.ohrm.annotations.FrameworkAnnotation;
import com.ohrm.pages.LoginPage;
import com.ohrm.testdata.TestData;
import com.ohrm.utils.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

@FrameworkAnnotation
@Test(description = "To Validate the title of OrangeHRM ",dataProvider = "getData",dataProviderClass = DataProviderUtils.class)
public void titleValidationTest(TestData testData)  {
    LoginPage loginPage=new LoginPage();
        String pageTitle = loginPage.
            setLogin(testData.username,testData.password)
            .getPageTitle();
    Assert.assertEquals(pageTitle,testData.expectedtitle);
}
}
