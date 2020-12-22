package pages;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage {
        WebDriver driver;
        @FindBy(xpath = "//h3[contains(text(),'Livin PMH Resident Portal')]")
        WebElement pageTitle;
        @FindBy(xpath = "//*[@id='input-username']")
        WebElement txtName;
        @FindBy(xpath = "//*[@id='input-password']")
        WebElement txtpassWord;
        @FindBy(xpath = "//button[contains(text(),'Log In')]")
        WebElement btnLogin;

        public loginPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @Step("Input user name!")
        public void setUserName(String userName){
            txtName.clear();
            txtName.sendKeys(userName);
        }
        @Step("Input password!")
        public void setPassWord(String passWord){
            txtpassWord.clear();
            txtpassWord.sendKeys(passWord);
        }
        @Step("Click Login Button!")
        public void clickLogin(){
            btnLogin.click();
        }
        @Step("Landing page Tittle")
        public String getTitle(){
           return pageTitle.getText();
        }

        public void loginProperty(String userName, String passWord){
            this.setUserName(userName);
            this.setPassWord(passWord);
            this.clickLogin();
        }

    }

