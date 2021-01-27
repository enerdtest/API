package pages;
//import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage {
        WebDriver driver;
        @FindBy(xpath = ".//h3[@class='title']")
        private WebElement pageTitle;
        @FindBy(id = "input-username")
        private WebElement txtName;
        @FindBy(id = "input-password")
        private WebElement txtpassWord;
        @FindBy(xpath = ".//button[contains(text(),'Log In')]")
        private WebElement btnLogin;

        public loginPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void setUserName(String userName){
            txtName.clear();
            txtName.sendKeys(userName);
        }

        public void setPassWord(String passWord){
            txtpassWord.clear();
            txtpassWord.sendKeys(passWord);
        }

        public void clickLogin(){
            btnLogin.click();
        }

        public String getTitle(){
           return pageTitle.getText();
        }

        public void loginProperty(String userName, String passWord){
            this.setUserName(userName);
            this.setPassWord(passWord);
            this.clickLogin();
        }

    }

