package com.apex.liverpool.helpers;

import com.apex.liverpool.pages.ProductDetails;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;

public class ProductDetailsHelper {

    ProductDetails productDetails = new ProductDetails();

    @Step
    public void verifyProductTitle(String item){
        productDetails.getProductTitle().shouldHave(text(item));
    }
}
