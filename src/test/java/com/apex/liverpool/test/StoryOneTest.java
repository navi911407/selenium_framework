package com.apex.liverpool.test;

import com.apex.liverpool.config.BaseTest;
import com.apex.liverpool.utils.Log;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

import static com.codeborne.selenide.Selenide.*;

public class StoryOneTest extends BaseTest {

    @Test
    @Description("Sample test to demonstrate inheritance from BaseTest")
    public void SearchBarTest() {
        Log.info("Starting sample test");
        open("https://www.liverpool.com.mx/tienda/home");
        Log.info("Navigated to liverpool.com.mx");

    }
}