package com.apex.liverpool.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.apex.liverpool.utils.Log;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class ResultsPage {

    private final SelenideElement resultedProducts = $(".a-plp-results-title > span");
    private final SelenideElement searcherTitle = $(".searcherTitle-result");
    private final SelenideElement noResultsLabel = $(".o-nullproduct-title-query");
    private final ElementsCollection searchResultsCards = $$(".m-product__card");
    private final String searchResultsCardsDescription = ".a-card-description";
    private final String brandFilterSection = "//div[contains(@class, 'm-plp__filterSection') and .//label[@title='WILDCARD']]";
    private final String brandFilterSearchBar = "input[id=searchBrand]";
    private final String brandFilterBrandCheckbox = "input[id=brand-BRAND_NAME]";
    private final String filterRadioButtonTemplate = "input[type = radio]";
    private final String filterCheckboxTemplate = "input[id=\"WILDCARD pulgadas\"]";

    public int getResultedProducts(){return Integer.parseInt(resultedProducts.getText());}
    public boolean isResultCountVisible(){return resultedProducts.isDisplayed();}
    public String getNoResultsLabel(){return  noResultsLabel.getText();}
    public String getSearcherTitle(){return  searcherTitle.getText();}
    public ElementsCollection getSearchResultsCards(){return  searchResultsCards;}
    public void clickFirstSearchResultCard(){
        searchResultsCards.first().click();
        Log.info("First Result Card Clicked");
    }
    public SelenideElement getResultCardDescription(int position){
        return searchResultsCards.get(position).find(searchResultsCardsDescription);
    }

    public void setBrandFilterText(String brandName){
        SelenideElement filterSection = $x(brandFilterSection.replace("WILDCARD","Marcas"));
        filterSection.find(brandFilterSearchBar).clear();
        filterSection.find(brandFilterSearchBar).sendKeys(brandName);
        Log.info("Value " + brandName + "send to Brand Search Bar");
        sleep(500);
    }

    public void clickBrandCheckbox(String brandName){
        SelenideElement filterSection = $x(brandFilterSection.replace("WILDCARD","Marcas"));
        filterSection.find(brandFilterBrandCheckbox.replace("BRAND_NAME",brandName)).click();
        Log.info("Brand CheckBox Selected for :" + brandName);
        sleep(500);
    }

    public void clickPriceFilterOption(int position){
        SelenideElement filterSection = $x(brandFilterSection.replace("WILDCARD","Precios"));
        filterSection.findAll(filterRadioButtonTemplate).get(position).click();
        Log.info("Prices Option Selected: " + position);
        sleep(500);
    }

    public void clickSizeFilterOption(String screenSize){
        SelenideElement filterSection = $x(brandFilterSection.replace(
                "WILDCARD","Tamaño"));
        filterSection.find(filterCheckboxTemplate.replace(
                "WILDCARD","variants.normalizedSize-"+screenSize)).click();
        Log.info("Screen Size Selected: " + screenSize);
        sleep(500);
    }
}
