package org.anitha.tests;
import org.anitha.base.DriverManager;
import org.anitha.pom.DashboardPage;
import org.anitha.pom.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.anitha.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin02_propertyReader {

    @Description("TC#1- Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {
        // Driver Manager Code - 1
        DriverManager.init();
        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));
        // Assertions - 3
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));
        DriverManager.getDriver().quit();

    }
    @Description("TC#2-Verify that valid credits dashboard page is loaded")
    @Test
    public void testLoginPositiveVWO() {

        LoginPage loginPage_VWO = new LoginPage(DriverManager.getDriver());
        loginPage_VWO.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashboardPage dashBoardPage  = new DashboardPage(DriverManager.getDriver());
        String usernameLoggedIn = dashBoardPage.loggedInUserName();
        Assert.assertEquals(usernameLoggedIn,PropertiesReader.readKey("expected_username"));

    }

}

