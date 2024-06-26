package com.apex.liverpool.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ResultsPage {
    private final ElementsCollection searchResults = $$("#mainSearchbar");
    private final SelenideElement resultedProducts = $(".a-plp-results-title > span");
    private final SelenideElement searcherTitle = $(".searcherTitle-result");
    private final SelenideElement noResultsLabel = $(".o-nullproduct-title-query");

    public ElementsCollection getSearchResults(){return searchResults;}
    public int getResultedProducts(){return Integer.parseInt(resultedProducts.getText());}
    public boolean isResultCountVisible(){return resultedProducts.isDisplayed();}
    public String getNoResultsLabel(){return  noResultsLabel.getText();}
    public String getSearcherTitle(){return  searcherTitle.getText();}
}
