package com.apex.liverpool.pages;

import com.apex.liverpool.utils.Log;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement loginMailField = $("[name=username]");
    private final SelenideElement passwordField = $("[name=password]");
    private final SelenideElement loginButton = $x("//button[@type='submit'][@data-action-button-primary='true']");
    private final SelenideElement createAccount = $("a[href*='/u/signup']");
    private final SelenideElement signUpMailField = $("[name=email]");

    private final SelenideElement firstName = $("[id=input-user__name]");
    private final SelenideElement middleName = $("[id=input-user__apaterno]");
    private final SelenideElement lastName = $("[id=input-user__amaterno]");

    private final SelenideElement daySelector = $("[id=daySelectorLabel]");
    private final SelenideElement monthSelector = $("[id=monthSelectorLabel]");
    private final SelenideElement yearSelector = $("[id=yearSelectorLabel]");

    private final SelenideElement maleGenderSelection = $("[id=male]");
    private final SelenideElement femaleGenderSelection = $("[id=female]");
    private final SelenideElement createAccountButton = $("a-btn a-btn--primary");

    private final SelenideElement phoneField = $("input[name=phone]");

    private final SelenideElement codeField = $("#code");

    public void setLoginMail(String mail){
        loginMailField.setValue(mail);
        Log.info("Login Mail sent:" + mail);
    }

    public void setPassword(String psswd){
        passwordField.setValue(psswd);
        Log.info("Password sent sent:" + psswd);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void clickCreateNewAccountButton(){
        createAccount.click();
    }

    public void setSignUpMail(String mail){
        signUpMailField.setValue(mail);
        Log.info("Login Mail sent:" + mail);
    }

    public void setFirstName(String user){
        firstName.type(user);
        Log.info("Password sent sent:" + user);
    }

    public void setMiddleName(String mName){
        middleName.type(mName);
        Log.info("Password sent sent:" + mName);
    }

    public void setLastName(String lName){
        lastName.type(lName);
        Log.info("Password sent sent:" + lName);
    }

    public void selectDay(String day){
        daySelector.selectOption(day);
    }

    public void selectMonth(String month){
        monthSelector.selectOption(month);
    }

    public void selectYear(String year){
        yearSelector.selectOption(year);
    }

    public void setMaleGenderSelection(){
        maleGenderSelection.click();
    }

    public void setFemaleGenderSelection(){
        femaleGenderSelection.click();
    }

    public void clickCreateAccountButton(){
        createAccountButton.click();
    }

    public void setPhone(String phone){
        phoneField.setValue(phone);
    }

    public void setCode(String code){
        codeField.setValue(code);
    }
}
