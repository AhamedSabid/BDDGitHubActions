package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver;

    public static void setUp() {

        driver = new ChromeDriver();
        //return driver;
    }

    public static void reload() {

        driver.navigate().refresh();
    }

    public static void fullScreen() {

        driver.manage().window().maximize();
    }

    public static void loadUrl(String url) {
        driver.get(url);
    }

    public static void tearDown() {

        driver.quit();
    }
}
