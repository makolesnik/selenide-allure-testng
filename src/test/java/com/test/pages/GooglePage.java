package com.test.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GooglePage {

    public SearchResultsPage searchFor(String text) {
        $("#lst-ib").val(text).pressEnter();
        return page(SearchResultsPage.class);
    }
}