package com.apex.liverpool.helpers;

import com.apex.liverpool.pages.SearchBar;
import io.qameta.allure.Step;

public class HomePageHelper {

    private final SearchBar searchBar = new SearchBar();
    private final ResultsPageHelper resultsPageHelper = new ResultsPageHelper();

    @Step
    public void searchElement(String element){
        searchBar.enterSearchText(element);
        searchBar.searchValue();
    }
}
