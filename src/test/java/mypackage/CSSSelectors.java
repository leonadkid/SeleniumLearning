package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CSSSelectors
{
    //    @Test
    //private CSSSelectors(){}
    public void testCSSSelectors()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Open the page
        driver.get("https://shopee.vn/");

        //Find and close the popup
        driver.findElement(By.cssSelector("shopee-banner-popup-stateful[spacekey='PC-VN-HOME_POPUP_01']")).getShadowRoot().findElement(By.cssSelector(".shopee-popup__close-btn")).click();

        //Search the text
        driver.findElement(By.cssSelector(".shopee-searchbar-input__input")).sendKeys("mo hinh lap rap doraemon");

        //Click search button
        driver.findElement(By.cssSelector("button[type='button']")).click();

        //Wai until the element is present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions
//                .presenceOfAllElementsLocatedBy(By.cssSelector(".shopee-search-user-brief__header-text-highlight")));
//
//        //Assert the text
//        String actualString = driver.findElement(By.cssSelector(".shopee-search-user-brief__header-text-highlight"))
//                .getText();
//        String expectedString = "mo hinh lap rap doraemon";
//        Assertions.assertTrue(actualString.contains(expectedString));
//
//        //Wai until the element is present
//        wait.until(ExpectedConditions
//                .presenceOfAllElementsLocatedBy(By.cssSelector(".shopee-search-result-header__text-highlight")));
//
//        //Assert the text
//        String actualString1 =  driver.findElement(By.cssSelector(".shopee-search-result-header__text-highlight"))
//                .getText();
//        Assertions.assertTrue(actualString1.contains(expectedString));

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='row shopee-search-item-result__items']/div")));
        String text = driver.findElement(By.xpath("//div[@class='row shopee-search-item-result__items']/div")).getText();
        System.out.println(text);
    }
}
