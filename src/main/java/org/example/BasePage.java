package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {

    public static WebDriver driver;

    public static void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
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