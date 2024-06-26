package com.apex.liverpool.data;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;


public class StoryThreeData {
    static Faker faker = new Faker();

    @DataProvider(name = "newUserData")
    public static Object[][] newUserData() {
        return new Object[][] {
                {faker.animal().name()+"@devncie.com", "Samehada1#", "Arthas", "Malore", "Ranthas",
                "15", "Ene", "1989", "male", "4425617957", "23546645"}
        };
    }

    @DataProvider(name = "loginData")
    public static Object[][] loginData() {
        return new Object[][] {
                {"sekewo9652@devncie.com", "Samehada1#", "", "", "",
                        "", "", "", "", "", ""}
        };
    }
}
