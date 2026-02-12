package org.app.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {


    public static String getLocators(String keys) throws IOException {

        FileInputStream file =new  FileInputStream("C:\\Users\\HP\\Desktop\\projetSeleniumForm\\src\\main\\java\\Locators\\Locators.properties");


        Properties properties=new Properties();

        properties.load(file);



            return properties.getProperty(keys);

    }


    public static void BtnDecatchJavaScript(WebDriver driver, WebElement btnClick) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;


        executor.executeScript("arguments[0].click()", btnClick);
    }

























}
