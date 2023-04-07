package testcase;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.ReadXLS;

public class MyFirstTest extends BaseTest
{
    @Test(dataProviderClass = ReadXLS.class, dataProvider = "testdata")
    public static void LoginTest(String username, String pwd) throws InterruptedException
    {
        driver.findElement(By.xpath(propLocators.getProperty("login_button"))).click();
        driver.findElement(By.xpath(propLocators.getProperty("login_field"))).sendKeys(username);
        driver.findElement(By.xpath(propLocators.getProperty("next_button"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(propLocators.getProperty("pwd_field"))).sendKeys(pwd);
        driver.findElement(By.xpath(propLocators.getProperty("signIn_button"))).click();
    }
}
