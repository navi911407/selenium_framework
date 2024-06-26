package com.apex.liverpool.data;

import org.testng.annotations.DataProvider;

public class StoryTwoData {

    @DataProvider(name = "buyProductData")
    public static Object[][] storyOneData() {
        return new Object[][] {
                {"Smart TV", "SONY", 1, "32"},
                //{"Steam Deck", "VALVE"},
                //{"Freidora de aire", "OSTER"}
        };
    }
}
