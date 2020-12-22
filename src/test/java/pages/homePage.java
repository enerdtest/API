package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage{
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Resident Portal')]")
    WebElement homeTitle;

    public homePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Getting Home page title!")
    public String getHomePageTitle(){
        return homeTitle.getText();
    }
}
