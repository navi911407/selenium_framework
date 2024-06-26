package com.apex.liverpool.data;

import org.testng.annotations.DataProvider;

import java.util.List;

public class StoryOneData {

    @DataProvider(name = "searchBarData")
    public static Object[][] storyOneData() {
        return new Object[][] {
                {"Smart TV"},
                {"Steam Deck Oled"},
                {"Freidora de aire"}
        };
    }

    @DataProvider(name = "searchBarNegativeData")
    public static Object[][] searchBarNegativeData() {
        return new Object[][] {
                {"farule"},
                {"mmghn"},
                {"uuu8349j"}
        };
    }

    @DataProvider(name = "searchBarRecursiveData")
    public static Object[][] searchBarRecursiveData() {
        return new Object[][] {{List.of("Casco", "Enchilada", "Polo")}};
    }

    @DataProvider(name = "searchBarAlternativeData")
    public static Object[][] searchBarAlternativeData() {
        return new Object[][] {
                {"16 GB de ram"},
                {"Motorola"},
                {"Lenovo legion 5"}
        };
    }
}