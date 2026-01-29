package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.HomePage;

import java.io.IOException;

public class HomePageTest extends BaseTest{

    @BeforeTest
    public void afficheTextConsol(){
        System.out.println("demmarer le test");
    }



    @Test(priority = 1)
    public void elementBtn(){
        HomePage.elementBtns(driver);
    }

    @Test(priority = 2,dependsOnMethods = "elementBtn")
    public void textBox() throws IOException{
        HomePage.textBoxs(driver);
    }

    @Test(priority = 3,dependsOnMethods = "textBox")
    public void formPageElements() throws IOException {
        HomePage.formPageElement(driver);
    }



@AfterTest
    public void closePage(){
        driver.quit();
        System.out.println("merci pour le test");
}


















}
