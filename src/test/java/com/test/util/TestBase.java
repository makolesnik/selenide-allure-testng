package com.test.util;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Configuration.baseUrl;

import com.codeborne.selenide.Configuration;
import com.test.pages.GooglePage;
import com.test.util.PropertyLoader;
import org.testng.annotations.BeforeSuite;


import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import java.io.IOException;



public class TestBase {


@BeforeSuite
    public void initTestSuite() throws IOException {
        baseUrl = PropertyLoader.loadProperty("site.url");
    }


    public GooglePage onGooglePage(){

        GooglePage page = open("/ncr", GooglePage.class);
        return page;
    }

}