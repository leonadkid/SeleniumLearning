package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations
{
    private Navigations(){}

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
//        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back(); // Snapdeal
        driver.navigate().forward(); // amazon
        driver.navigate().refresh();
    }
}
