package com.apex.liverpool.pages;

import com.apex.liverpool.utils.Log;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class SearchBar {
    private  final SelenideElement searchBar = $("#mainSearchbar");

    public void enterSearchText(String searchValue){
        searchBar.sendKeys(searchValue);
        Log.info("Value send to Search Bar :" + searchValue);
    }

    public void searchValue(){
        searchBar.sendKeys(Keys.ENTER);
        Log.info("Enter sent to Search Bar");
    }

    public void cleanSearchText(){
        searchBar.clear();
        Log.info("Search Bar field cleaned");
    }
}
