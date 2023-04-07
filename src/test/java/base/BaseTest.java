package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest
{
    public static WebDriver driver;
    public static Properties propConfig = new Properties();
    public static Properties propLocators = new Properties();
    public static FileReader fileConfig;
    public static FileReader fileLocators;

    @BeforeMethod
    public void setUp() throws IOException
    {
        if (driver == null) {
            String userDir = System.getProperty("user.dir");
            fileConfig = new FileReader(userDir + "/src/test/resources/configfiles/config.properties");
            propConfig.load(fileConfig);
            fileLocators = new FileReader(userDir + "/src/test/resources/configfiles/locators.properties");
            propLocators.load(fileLocators);
        }
        if (propConfig.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.get(propConfig.getProperty("testurl"));
            System.out.println("ahihi");
        }
        else if (propConfig.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get(propConfig.getProperty("testurl"));
        }
    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();
        System.out.println("Tear down successfully");
    }
}
