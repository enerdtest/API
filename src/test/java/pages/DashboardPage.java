package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;
    @FindBy(xpath = ".//span[contains(text(), 'Inspection Management')]")
    WebElement inspectionManagementMenu;
    @FindBy(xpath = ".//span[contains(text(), 'Dashboard')]")
    WebElement dashboardMenu;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickInspectionMenu(){
        inspectionManagementMenu.click();
    }
    public void clickDashboardMenu(){
        dashboardMenu.click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }

    @FindBy(xpath = ".//a[@class='logo']")
    private WebElement homeTitle;
    @FindBy(xpath = ".//div[@class='user-name']")
    private WebElement userName;
    @FindBy(tagName = "h1")
    private WebElement welcomeMessage;

}
