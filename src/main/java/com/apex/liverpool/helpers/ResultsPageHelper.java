package com.apex.liverpool.helpers;

import com.apex.liverpool.pages.ResultsPage;
import com.apex.liverpool.pages.SearchBar;
import com.apex.liverpool.utils.Log;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;
import static com.codeborne.selenide.Condition.text;

import static org.testng.Assert.*;

public class ResultsPageHelper {

    private final SearchBar searchBar = new SearchBar();
    private final ResultsPage resultsPage = new ResultsPage();

    @Step
    public void searchElement(String element){
        searchBar.enterSearchText(element);
        searchBar.searchValue();
    }

    @Step
    public void verifyResultsCount(int expectedCount){
        assertEquals(resultsPage.getResultedProducts(), expectedCount,
                "Actual results count don´t match with expected count");
    }

    @Step
    public void verifyResultsCountLabelNoVisible(){
        assertFalse(resultsPage.isResultCountVisible());
    }

    @Step
    public void verifyNoResultsLabel(String item){
        assertTrue(resultsPage.getNoResultsLabel().contains("Lo sentimos, no encontramos nada para \"" + item + "\""));
    }

    @Step
    public void verifyResultsExistence(String item, SoftAssert softAssert){
        softAssert.assertTrue(resultsPage.getSearcherTitle().contains(item),
                "Searched Item text is not present in Title, Expected: " + item);
        softAssert.assertTrue(resultsPage.getResultedProducts()> 0,
                "No Result Found");
        softAssert.assertAll();
    }

    @Step
    public void selectSpecificResultCard(int position){
        resultsPage.getSearchResultsCards().get(position).click();
        Log.info("Result Card: " + position + " Clicked");
    }

    @Step
    public void verifyResultCardDescriptionContainsSearchedItem(int position, String item){
        resultsPage.getResultCardDescription(position).shouldHave(text(item));
    }

    @Step
    public void filterByBrand(String brandName){
        resultsPage.setBrandFilterText(brandName);
        resultsPage.clickBrandCheckbox(brandName);
    }
}
