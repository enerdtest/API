package testPages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import basePage.BasePage;
import pages.DashboardPage;

import java.util.concurrent.TimeUnit;

public class testDashboard extends BasePage {
    WebDriver driver;
    private DashboardPage dashboardPage;

    @Test(priority = 3)
    public void gotoDashboard(){
        dashboardPage = new DashboardPage(driver);
        dashboardPage.clickInspectionMenu();
        dashboardPage.clickDashboardMenu();
    }
    @Test(priority = 4)
    public void getDashboardUrl(){
        dashboardPage = new DashboardPage(driver);
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        System.out.println(dashboardPage.getUrl());
        Assert.assertTrue(dashboardPage.getUrl().contains("dashboard"));
    }
}
