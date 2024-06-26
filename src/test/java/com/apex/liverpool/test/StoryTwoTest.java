package com.apex.liverpool.test;

import com.apex.liverpool.config.BaseTest;
import com.apex.liverpool.data.StoryTwoData;
import com.apex.liverpool.helpers.HomePageHelper;
import com.apex.liverpool.helpers.ProductDetailsHelper;
import com.apex.liverpool.helpers.ResultsPageHelper;
import com.apex.liverpool.pages.ProductDetails;
import com.apex.liverpool.pages.ResultsPage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.sleep;

public class StoryTwoTest extends BaseTest {

    private final HomePageHelper homePageHelper = new HomePageHelper();
    private final ResultsPageHelper resultsPageHelper = new ResultsPageHelper();
    private final ResultsPage resultsPage = new ResultsPage();
    private final ProductDetailsHelper productDetailsHelper = new ProductDetailsHelper();

    @Test(dataProvider = "buyProductData", dataProviderClass = StoryTwoData.class)
    @Description("Search for an item in the search bar and validates the results page")
    public void SelectProductsTest(String item, String brandName, int position, String screenSize) {
        SoftAssert softAssert = new SoftAssert();
        homePageHelper.searchElement(item);
        resultsPageHelper.verifyResultsExistence(item, softAssert);
        resultsPageHelper.verifyResultCardDescriptionContainsSearchedItem(0, item);
        resultsPageHelper.filterByBrand(brandName);
        resultsPage.clickPriceFilterOption(position);
        resultsPage.clickSizeFilterOption(screenSize);
        resultsPage.clickFirstSearchResultCard();
        productDetailsHelper.verifyProductTitle(item);
    }
}
