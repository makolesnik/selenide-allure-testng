package com.test;

import com.test.util.TestBase;
import org.testng.annotations.Test;


public class GoogleSearchTest extends TestBase {
    @Test
    public void userCanSearch() {
        onGooglePage()
                .searchFor("selenide")
                .ensureResultsContains("concise UI tests in Java")
                .ensureResultsHaveSize(10);

    }
}