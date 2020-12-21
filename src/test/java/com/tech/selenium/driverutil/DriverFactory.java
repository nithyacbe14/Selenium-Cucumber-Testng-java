package com.tech.selenium.driverutil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by Nithya Kannan .
 */
public class DriverFactory {

    public static WebDriver getBrowser() {
        WebDriver _driver = null;
        WebDriverManager.chromedriver().setup();
        _driver = new ChromeDriver();
        _driver.manage().window().maximize();
        return _driver;
    }
}
