package Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static ThreadLocal<WebDriver> driver= new ThreadLocal<>();





    public static  WebDriver getDriver(){
        return driver.get();
    }

    public static void setDriver(String browser){

        if(browser == null){
            return;
        }

        if(browser.equalsIgnoreCase("chrome")){
            driver.set(new ChromeDriver());
        }

        if (browser.equalsIgnoreCase("firefox")){
            driver.set(new FirefoxDriver());
        }
    }










}
