package testPages;

import basePage.basePage;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;
import utilities.ReadPropertiesFileTest;
import utilities.utils;

import java.io.IOException;
import java.util.Properties;

public class testLogin{
    private basePage basePage = new basePage();
    private static WebDriver driver;
    private loginPage loginPage;
    private homePage homePage;
    private ReadPropertiesFileTest readfile;

    @Severity(SeverityLevel.BLOCKER)
    @Description("Init browser before running test!")
    @Story("Test Property Login!")
    @BeforeTest
    public void intBrowser() throws IOException {
        readfile = new ReadPropertiesFileTest();
        Properties pro = ReadPropertiesFileTest.readPropertiesFile("dataSource/properties.properties");
        driver = basePage.initializeBrowser();
        driver.get(pro.getProperty("url"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Get Landing page Title!")
    @Story("Test Property Login!")
    @Test(priority = 0, description = "Get landing page title!")
    public void getLandingTitle(){
        loginPage = new loginPage(driver);
        System.out.println(loginPage.getTitle());
        Assert.assertEquals(loginPage.getTitle(), "Livin PMH Resident Portal");
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Login with valid userName and Password!")
    @Story("Test Property Login!")
    @Test(priority = 0, description = "Login as Admin to Property Portal!")
    public void loginProperty() throws IOException {
        readfile = new ReadPropertiesFileTest();
        Properties pro = ReadPropertiesFileTest.readPropertiesFile("dataSource/loginInfo.properties");
        loginPage = new loginPage(driver);
        loginPage.loginProperty(pro.getProperty("userName"), pro.getProperty("passWord"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Get Property Home Page title after login successfully!")
    @Story("Test Property Login!")
    @Test(priority = 1 , description = "Get Home page portal title after login successfully!")
    public void getHomeTitle(){
        homePage = new homePage(driver);
        System.out.println(homePage.getHomePageTitle());
        Assert.assertEquals(homePage.getHomePageTitle(), "Resident Portal");
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Get date Time!")
    @Story("Test Property Login!")
    @Test(priority = 1, description = "Get DateTime")
    public void getDateTime(){
        System.out.println("date Time " + utils.getDateTime());
    }

}
