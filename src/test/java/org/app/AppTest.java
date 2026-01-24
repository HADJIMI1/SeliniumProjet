package org.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.app.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.FormCalandre;
import pom.HomePage;

import java.io.IOException;


public class AppTest{


    public static WebDriver driver;




    public static void main (String[] args) throws IOException, InterruptedException {




        driver= new ChromeDriver();
        HomePage.pageHome(driver);

        HomePage.elementBtns(driver);
        HomePage.textBoxs(driver);

        HomePage.formPageElement(driver, "leffad", "leffad@gmail.com","12 rue de paris ", "Charenton le Pont,");


        FormCalandre.formPageCalandre(driver);
        FormCalandre.formPatrice(driver);
        FormCalandre.formPagePractise(driver,"idir","leffad","idir.lef@gmail.com", "06253874252", "May");








































}}