package pom;

import org.app.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class HomePage {

    public static WebElement ElementBtn;
    public static WebElement TextBox, elementbtn;

    public static WebDriver driver;
    public static WebElement  NameTextBox, btnSubTextBox, closebtn ;
    public static WebElement EmailTextBox, AdressTextBox, permanentAdressTextBox;





    public static By textbox;
    public static By elementBtn;
    public static By nameTextBox;
    public static By emailUser;
    public static By currantadresse;
    public static  By permanentadress, subBtn;




    static {
        try {
            elementBtn=By.xpath(Utility.getLocators("ElementBtn"));
            textbox=By.xpath(Utility.getLocators("textBox"));
            nameTextBox =By.id(Utility.getLocators("names"));
            emailUser=By.id(Utility.getLocators("usermails"));
            currantadresse=By.id(Utility.getLocators("adresscurrent"));
            permanentadress=By.id(Utility.getLocators("permanentadress"));
           subBtn =By.id(Utility.getLocators("buttonSub"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void pageHome(WebDriver driver) throws IOException {
        driver.get(Utility.getLocators("url"));

    }


    public static void elementBtns(WebDriver driver){
        ElementBtn= driver.findElement(elementBtn);

        Utility.BtnDecatchJavaScript(driver,ElementBtn);

    }
    public static void textBoxs(WebDriver driver){
        TextBox=driver.findElement(textbox);
        Utility.BtnDecatchJavaScript(driver,TextBox);
    }



    public static void formPageElement(WebDriver driver,String name,String email, String adress, String permanentAdress ){
        NameTextBox=driver.findElement(nameTextBox);
        NameTextBox.sendKeys(name);

        EmailTextBox=driver.findElement(emailUser);
        EmailTextBox.sendKeys(email);

        AdressTextBox=driver.findElement(currantadresse);
        AdressTextBox.sendKeys(adress);

        permanentAdressTextBox=driver.findElement(permanentadress);
        permanentAdressTextBox.sendKeys(permanentAdress);

        btnSubTextBox=driver.findElement(subBtn);
        Utility.BtnDecatchJavaScript(driver, btnSubTextBox);

    }













}
