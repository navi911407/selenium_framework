package com.apex.liverpool.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import com.apex.liverpool.utils.Log;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
  private final SelenideElement loginButton = $("span[class=a-header__topLink]");

    public void clickLogin(){
        loginButton.click();
        Log.info("Login Button Clicked");
    }
}
