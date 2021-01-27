package basePage;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilities.ReadPropertiesFileTest;

import static utilities.ReadPropertiesFileTest.readPropertiesFile;

public class basePage {
    public static WebDriver driver;
    private ReadPropertiesFileTest readfile;
    private String chromePath = "runner/chromedriver";
    private String fireFoxPath = "runner/geckodriver";

    public WebDriver initializeBrowser() throws IOException {
        
        Properties prop = readPropertiesFile("dataSource/properties.properties");
        String browserName = prop.getProperty("browser");
        String headless = prop.getProperty("headless");
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("<HOST:PORT>");

        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", chromePath);
            ChromeOptions options = new ChromeOptions();
            if ("true".equals(headless)){
                options.addArguments("--headless");
                options.setCapability("proxy", proxy);
                driver= new ChromeDriver(options);
            }else {
                options.setCapability("proxy", proxy);
                driver = new ChromeDriver();
            }
        } else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", fireFoxPath);
            FirefoxOptions options = new FirefoxOptions();
            if ("true".equals(headless)){
                options.addArguments("-headless");
                options.setCapability("proxy", proxy);
                driver = new FirefoxDriver(options);
            } else {
                options.setCapability("proxy", proxy);
                driver = new FirefoxDriver();
            }
        }else {
            System.out.println("Could  not found initialize browser!");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        return driver;
    }
    @BeforeSuite
    public void intBrowser() throws IOException {
        readfile = new ReadPropertiesFileTest();
        Properties pro = readPropertiesFile("dataSource/properties.properties");
        driver = initializeBrowser();
        driver.get(pro.getProperty("url"));
    }
    @AfterSuite
    public void afterSuite(){
        if (null != driver){
            driver.close();
            driver.quit();
        }
    }
}
