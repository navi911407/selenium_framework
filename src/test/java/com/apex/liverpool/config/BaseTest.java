package com.apex.liverpool.config;

import com.apex.liverpool.utils.Log;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest extends AllureTestNg {

    @BeforeMethod
    public void setUp() {
        Log.info("Setting up the test environment");
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @AfterMethod
    public void tearDown() {
        Log.info("Tearing down the test environment");
        closeWebDriver();
    }
}
