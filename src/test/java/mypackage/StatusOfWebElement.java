package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement
{
    private StatusOfWebElement() {}

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("Disable status: " + searchStore.isDisplayed());
        System.out.println("Enable status: " + searchStore.isEnabled());
        System.out.println("Enable status: " + searchStore.isEnabled());

        WebElement maleEle = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement femaleEle = driver.findElement(By.xpath("//input[@id='gender-female']"));

        boolean male = maleEle.isSelected();
        boolean female = femaleEle.isSelected();

        System.out.println("Male selected is " + male); //FALSE
        System.out.println("Female selected is " + female); //FALSE

        maleEle.click();

        male = maleEle.isSelected();
        female = femaleEle.isSelected();

        System.out.println("Male selected is " + male); //TRUE
        System.out.println("Female selected is " + female); //FALSE

        femaleEle.click();

        male = maleEle.isSelected();
        female = femaleEle.isSelected();

        System.out.println("Male selected is " + male); //FALSE
        System.out.println("Female selected is " + female); //TRUE

        driver.close();
    }
}
