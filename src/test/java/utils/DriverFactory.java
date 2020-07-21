package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
in my projects I've used ThreadLocal class for running synchronized tests.
 For the simplicity, I choose to create WebDriver objects in this way.
 */
public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory(){}


    public static synchronized WebDriver getDriver(){

        if (driver != null) {
            return driver;
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void cleanDriver(){
        driver.quit();
        driver=null;
    }

}
