package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BasePage {

    //WebDriver driver;

    public GooglePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='k1zIA rSk4se']")
    public WebElement googleImage;

    @FindBy(how = How.XPATH, using = "//textarea[@name='q']")
    public WebElement searchText;

    @FindBy(how = How.XPATH, using = "(//input[@value='Google Search'])[2]")
    public WebElement SearchButton;


}
