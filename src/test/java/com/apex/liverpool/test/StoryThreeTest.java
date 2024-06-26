package com.apex.liverpool.test;

import com.apex.liverpool.config.BaseTest;
import com.apex.liverpool.data.StoryThreeData;
import com.apex.liverpool.pages.HomePage;
import com.apex.liverpool.pages.LoginPage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class StoryThreeTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(dataProvider = "loginData", dataProviderClass = StoryThreeData.class)
    @Description("Login with a valid user")
    public void LoginUserTest(String user, String psswd, String name, String middleName, String lastName,
                              String day, String month,  String year,  String gender,  String phone,
                              String code) {

        homePage.clickLogin();

        loginPage.setLoginMail(user);
        loginPage.setPassword(psswd);
        loginPage.clickLoginButton();
        sleep(3000);
    }

    @Test(dataProvider = "newUserData", dataProviderClass = StoryThreeData.class)
    @Description("Login with a valid user")
    public void CreateUserTest(String user, String psswd, String name, String middleName, String lastName,
                              String day, String month,  String year,  String gender,  String phone,
                              String code) {

        homePage.clickLogin();

        loginPage.clickCreateNewAccountButton();
        loginPage.setSignUpMail(user);
        loginPage.setPassword(psswd);
        loginPage.clickLoginButton();

        loginPage.setFirstName(name);
        loginPage.setMiddleName(middleName);
        loginPage.setLastName(lastName);

        loginPage.selectDay(day);
        loginPage.selectMonth(month);
        loginPage.selectYear(year);
        loginPage.setMaleGenderSelection();
        loginPage.clickCreateAccountButton();

        loginPage.setPhone(phone);
        loginPage.clickLoginButton();

        loginPage.setCode(code);
        sleep(3000);
    }
}
