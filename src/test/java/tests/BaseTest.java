package tests;

import org.app.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    WebDriver driver;


    @BeforeClass
    public void run() throws IOException {
        driver= new ChromeDriver();
        driver.get(Utility.getLocators("url"));

    }



    @BeforeMethod
    public void backMethod(){
        System.out.println("execute moi la methode stp");
    }











}
