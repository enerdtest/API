package testPages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dashboardPage;
import basePage.basePage;

import java.util.concurrent.TimeUnit;

public class testDashboard extends basePage{
    WebDriver driver;
    private dashboardPage dashboardPage;

    @Test(priority = 3)
    public void gotoDashboard(){
        dashboardPage = new dashboardPage(driver);
        dashboardPage.clickInspectionMenu();
        dashboardPage.clickDashboardMenu();
    }
    @Test(priority = 4)
    public void getDashboardUrl(){
        dashboardPage = new dashboardPage(driver);
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        System.out.println(dashboardPage.getUrl());
        Assert.assertTrue(dashboardPage.getUrl().contains("dashboard"));
    }
}
