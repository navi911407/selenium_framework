package com.apex.liverpool.helpers;

import com.apex.liverpool.pages.SearchBar;

public class HomePageHelper {

    private final SearchBar searchBar = new SearchBar();
    private final ResultsPageHelper resultsPageHelper = new ResultsPageHelper();

    public void searchElement(String element){
        searchBar.enterSearchText(element);
        searchBar.searchValue();
    }
}
