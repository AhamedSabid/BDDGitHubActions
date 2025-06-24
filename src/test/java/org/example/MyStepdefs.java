package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs extends BasePage {

    //WebDriver driver;
    GooglePage gp = new GooglePage(driver);

    @When("Enter the search text {string}")
    public void enterTheSearchText(String arg0) {
        //driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(arg0);
        gp.searchText.sendKeys(arg0);
    }

    @Given("I load the url")
    public void iLoadTheUrl() {
        //driver = new ChromeDriver();
        //driver.get("https://www.google.com");
        //driver.manage().window().maximize();
        BasePage.setUp();
        BasePage.loadUrl("https://www.google.com");
        BasePage.fullScreen();
        gp = new GooglePage(driver);
    }

    @Then("Clicked on the Google image")
    public void clickedOnTheGoogleImage() {
        // driver.findElement(By.xpath("//img[@alt='Google']")).click();
        gp.googleImage.click();
    }

    @And("Click on the Search button")
    public void clickOnTheSearchButton() {
        //driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
        gp.SearchButton.click();
    }

    @And("I close the browser")
    public void iCloseTheBrowser() {
        BasePage.tearDown();
    }

    @And("I wait for {int} seconds")
    public void iWaitForSeconds(int arg0) throws InterruptedException {
        Thread.sleep(arg0 * 1000);
    }
}
