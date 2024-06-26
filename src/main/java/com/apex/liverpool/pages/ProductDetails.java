package com.apex.liverpool.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductDetails {

    private final SelenideElement productTitle = $(".product-header-container > h1");

    public SelenideElement getProductTitle(){return productTitle;}
}
