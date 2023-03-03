package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser
{
    private LaunchBrowser(){}
    public static void main(String[] args)
    {
//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://nopcommerce.com/");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://nopcommerce.com/");

//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://nopcommerce.com/");

//        WebDriverManager.edgedriver().setup();
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://nopcommerce.com/");

//        WebDriverManager.safaridriver().setup();
//        WebDriver driver = new SafariDriver();
//        driver.get("https://nopcommerce.com/");

        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Page Source: " + driver.getPageSource());
    }
}
