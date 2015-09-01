package com.test.pages;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import org.openqa.selenium.By;

public class SearchResultsPage {

    public SearchResultsPage ensureResultsContains(String text ) {
        $(By.partialLinkText(text)).shouldBe(visible);
        return this;
    }

    public SearchResultsPage ensureResultsHaveSize(int size ) {
        getResults().shouldHave(size(size));
        return this;
    }

    public ElementsCollection getResults() {
        return $$(By.className("rc"));
    }
}
