package testPages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReadPropertiesFileTest;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class testLogin extends BasePage {
    WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private ReadPropertiesFileTest readfile;

//
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Get Landing page Title!")
//    @Story("Test Property Login!")
    @Test(priority = 0, description = "Get landing page title!")
    public void getLandingTitle(){
        loginPage = new LoginPage(driver);
        System.out.println(loginPage.getTitle());
        Assert.assertEquals(loginPage.getTitle(), "Livin PMH Resident Portal");
    }

    @Test(priority = 1, description = "Login as Admin to Property Portal!")
    public void loginProperty() throws IOException {
        readfile = new ReadPropertiesFileTest();
        Properties pro = ReadPropertiesFileTest.readPropertiesFile("dataSource/loginInfo.properties");
        loginPage = new LoginPage(driver);
        loginPage.loginProperty(pro.getProperty("userName"), pro.getProperty("passWord"));
    }

    @Test(priority = 2 , description = "Get Home page portal title after login successfully!")
    public void getHomeTitle(){
        homePage = new HomePage(driver);
        System.out.println(homePage.getHomePageTitle());
        Assert.assertEquals(homePage.getHomePageTitle(), "Resident Portal");
    }
    @Test(priority = 2, description = "Get userName after login successfully!")
    public void getUserName(){
        homePage = new HomePage(driver);
        System.out.println(homePage.getUserName());
        Assert.assertEquals(homePage.getUserName(), "sangkt");
    }
    @Test(priority = 2, description = "Get welcome message after login successfully!")
    public void getWelcomeMessage(){
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        String welcomeMessage = homePage.getWelcomeMessage();
        System.out.println(welcomeMessage);
        Assert.assertTrue(welcomeMessage.contains("Welcome you to Resident Portal"));
    }


//    @Test(priority = 1, description = "Get DateTime")
//    public void getDateTime(){
//        System.out.println("date Time " + utils.getDateTime());
//    }


}
