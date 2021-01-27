package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage{
    WebDriver driver;

    @FindBy(xpath = ".//a[@class='logo']")
    private WebElement homeTitle;
    @FindBy(xpath = ".//div[@class='user-name']")
    private WebElement userName;
    @FindBy(tagName = "h1")
    private WebElement welcomeMessage;

    public homePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHomePageTitle(){
        return homeTitle.getText();
    }
    public String getUserName(){
        return userName.getText();
    }
    public String getWelcomeMessage(){
        return welcomeMessage.getText();
    }
}
