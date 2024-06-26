package com.apex.liverpool.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import com.apex.liverpool.utils.Log;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private  final SelenideElement searchBar = $("#mainSearchbar");

    private void setSearchBarText(String searchValue){
        searchBar.sendKeys(searchValue);
        Log.info("Value send to Search Bar :" + searchValue);
    }

    private void searchValue(){
        searchBar.sendKeys(Keys.ENTER);
        Log.info("Enter sent to Search Bar");
    }

}
