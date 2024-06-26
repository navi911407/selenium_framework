package com.apex.liverpool.test;

import com.apex.liverpool.config.BaseTest;
import com.apex.liverpool.data.StoryOneData;
import com.apex.liverpool.helpers.ResultsPageHelper;
import com.apex.liverpool.pages.SearchBar;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import com.apex.liverpool.helpers.HomePageHelper;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static com.codeborne.selenide.Selenide.sleep;

public class StoryOneTest extends BaseTest {
    HomePageHelper homePageHelper = new HomePageHelper();
    ResultsPageHelper resultsPageHelper = new ResultsPageHelper();
    SearchBar searchBar= new SearchBar();

    @Test(dataProvider = "searchBarData", dataProviderClass = StoryOneData.class)
    @Description("Search for an item in the search bar and validates the results page")
    public void SearchBarTest(String item) {
        SoftAssert softAssert = new SoftAssert();
        homePageHelper.searchElement(item);
        resultsPageHelper.verifyResultsExistence(item, softAssert);
    }

    @Test(dataProvider = "searchBarNegativeData", dataProviderClass = StoryOneData.class)
    @Description("Search for an item in the search bar and validates no results found")
    public void SearchBarNegativeTest(String item) {
        homePageHelper.searchElement(item);
        resultsPageHelper.verifyResultsCountLabelNoVisible();
        resultsPageHelper.verifyNoResultsLabel(item);
    }

    @Test(dataProvider = "searchBarRecursiveData", dataProviderClass = StoryOneData.class)
    @Description("Search for an item in the search bar and validates no results found")
    public void SearchBarRecursiveSearchTest(List<String> items) {
        SoftAssert softAssert = new SoftAssert();
        for(String item : items){
            searchBar.cleanSearchText();
            searchBar.enterSearchText(item);
            searchBar.searchValue();
            sleep(1500);
            resultsPageHelper.verifyResultsExistence(item, softAssert);
        }
    }

    @Test(dataProvider = "searchBarAlternativeData", dataProviderClass = StoryOneData.class)
    @Description("Search for an item in the search bar and validates no results found")
    public void SearchBarEdgeTest(String item) {
        SoftAssert softAssert = new SoftAssert();
        homePageHelper.searchElement(item);
        resultsPageHelper.verifyResultsExistence(item, softAssert);
    }
}