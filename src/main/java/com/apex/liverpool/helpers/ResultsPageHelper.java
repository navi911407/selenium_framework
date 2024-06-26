package com.apex.liverpool.helpers;

import com.apex.liverpool.pages.ResultsPage;
import com.apex.liverpool.pages.SearchBar;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class ResultsPageHelper {

    private final SearchBar searchBar = new SearchBar();
    private final ResultsPage resultsPage = new ResultsPage();

    public void searchElement(String element){
        searchBar.enterSearchText(element);
        searchBar.searchValue();
    }

    public void verifyResultsCount(int expectedCount){
        assertEquals(resultsPage.getResultedProducts(), expectedCount,
                "Actual results count don´t match with expected count");
    }

    public void verifyResultsCountLabelNoVisible(){
        assertFalse(resultsPage.isResultCountVisible());
    }

    public void verifyNoResultsLabel(String item){
        assertTrue(resultsPage.getNoResultsLabel().contains("Lo sentimos, no encontramos nada para \"" + item + "\""));
    }

    public void verifyResultsExistence(String item, SoftAssert softAssert){
        softAssert.assertTrue(resultsPage.getSearcherTitle().contains(item),
                "Searched Item text is not present in Title, Expected: " + item);
        softAssert.assertTrue(resultsPage.getResultedProducts()> 0,
                "No Result Found");
        softAssert.assertAll();
    }
}