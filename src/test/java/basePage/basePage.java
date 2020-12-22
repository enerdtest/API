package basePage;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import utilities.ReadPropertiesFileTest;


public class basePage extends ReadPropertiesFileTest{
    private static WebDriver driver;
    private String chromePath = "runner/chromedriver";
    private String fireFoxPath = "runner/geckodriver";

    public WebDriver initializeBrowser() throws IOException {
        
        Properties prop = readPropertiesFile("dataSource/properties.properties");
        String browserName = prop.getProperty("browser");
        String headless = prop.getProperty("headless");

        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", chromePath);
            if ("true".equals(headless)){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver= new ChromeDriver(options);
            }else {
                driver = new ChromeDriver();
            }
        } else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", fireFoxPath);
            if ("true".equals(headless)){
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("-headless");
                driver = new FirefoxDriver(options);
            } else {
            driver = new FirefoxDriver();
            }
        }else {
            System.out.println("Could  not found initialize browser!");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        return driver;
    }

    @AfterSuite
    public void afterSuite(){
        if (null != driver){
            driver.close();
            driver.quit();
        }
    }
}
