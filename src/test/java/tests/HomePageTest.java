package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.HomePage;

import java.io.IOException;

public class HomePageTest extends BaseTest{



    @Test(priority = 1)
    public void run() throws IOException {
        HomePage.pageHome(driverInstance);
    }


    @Test(priority = 2)
    public void elementBtn(){
        HomePage.elementBtns(driverInstance);
    }

    @Test(priority = 3,dependsOnMethods = "elementBtn")
    public void textBox() throws IOException{
        HomePage.textBoxs(driverInstance);
    }

    @Test(priority = 4,dependsOnMethods = "textBox")
    public void formPageElements() throws IOException {
        HomePage.formPageElement(driverInstance);
    }



@AfterTest
    public void closePage(){
        System.out.println("merci pour le test");
}


















}
