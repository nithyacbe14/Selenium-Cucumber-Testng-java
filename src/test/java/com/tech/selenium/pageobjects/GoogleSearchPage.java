package com.tech.selenium.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Nithya Kannan .
 */
public class GoogleSearchPage {

    private WebDriver _driver = null;

    @FindBy(name = "q")
    WebElement _searchBox;

    public GoogleSearchPage(WebDriver driver)
    {
        this._driver = driver;
        PageFactory.initElements(_driver, this);
    }

    public void openURL(){
        _driver.get("https://www.google.com/");
    }

    public void searchFor(String _searchTerm)
    {

        _searchBox.sendKeys(_searchTerm + Keys.RETURN);
    }
}
