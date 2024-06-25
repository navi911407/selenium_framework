package com.apex.liverpool.config;

import com.apex.liverpool.utils.Log;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import io.qameta.allure.testng.AllureTestNg;
import io.qameta.allure.Attachment;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.*;
import com.apex.liverpool.utils.ConfigReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BaseTest extends AllureTestNg {

    @BeforeMethod
    public void setUp() {
        Log.info("Setting up the test environment");
        Configuration.baseUrl = ConfigReader.getProperty("base.url");
        Configuration.browserSize = ConfigReader.getProperty("browser.size");
        Configuration.timeout = Integer.parseInt(ConfigReader.getProperty("global.timeout"));
        open(Configuration.baseUrl);
        Log.info(Configuration.baseUrl);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        Log.info("Tearing down the test environment");

        if (ITestResult.FAILURE == result.getStatus()) {
            captureScreenshot(result.getName());
        }

        closeWebDriver();
    }

    @Attachment(value = "Screenshot of {0}", type = "image/png")
    public byte[] captureScreenshot(String testName) {
        File screenshot = Screenshots.takeScreenShotAsFile();
        try {
            return new FileInputStream(screenshot).readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }
}
