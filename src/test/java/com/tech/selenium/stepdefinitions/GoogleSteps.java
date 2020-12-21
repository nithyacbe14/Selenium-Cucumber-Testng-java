package com.tech.selenium.stepdefinitions;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.GoogleSearchPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoogleSteps implements En {

    private WebDriver driver;
    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    public GoogleSteps() {

        Before((Scenario scenario) -> {
            driver = DriverFactory.getBrowser();
            googleSearchPage = new GoogleSearchPage(driver);
            searchResultsPage = new SearchResultsPage(driver);
        });

        Given("^User is on Google search page$", () -> {
            googleSearchPage.openURL();
        });

        When("^User searches for Selenium$", () -> {
            googleSearchPage.searchFor("Selenium");
        });

        Then("^User can see Selenium results$", () -> {
            Assert.assertTrue(searchResultsPage._lnkSelenium.isDisplayed());
        });

        After((Scenario scenario) -> {
           driver.quit();
        });

    }
}
