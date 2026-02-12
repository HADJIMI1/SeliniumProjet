package tests;

import Data.DriverManager;
import org.app.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class BaseTest {

public static WebDriver driverInstance;
public static WebDriver driver;

    @Parameters("browser")

    @BeforeTest

public static void run(@Optional String browser){
        DriverManager.setDriver(browser);

        driverInstance= DriverManager.getDriver();


    }


    /*
    WebDriver driver;


    @BeforeClass
    public void run() throws IOException {
        driver= new ChromeDriver();
        driver.get(Utility.getLocators("url"));

    }

*/














}
