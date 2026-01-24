package pom;

import org.app.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;

public class FormCalandre {
    public static WebElement formbtn, patriceFrom,NameTextPractise, LastTextPractise, dateofbreth, selectCity;
    public static WebElement numberTextPractise,EmailPractise,subj, adresscurrants;
    public static WebElement yearsSelects,monthSelects, day, cochebtn, hobies, selectStat ;
    public static WebElement subBtn, closeLargeModal ;



    public static By formsbtn;

    static {
        try {
           formsbtn =By.xpath(Utility.getLocators("formsbtn"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }





    public static void formPageCalandre(WebDriver driver){
        formbtn=driver.findElement(formsbtn);
        Utility.BtnDecatchJavaScript(driver,formbtn);
    }
    public static void formPatrice(WebDriver driver) throws IOException {
        patriceFrom = driver.findElement(By.xpath(Utility.getLocators("praticeForms")));
        Utility.BtnDecatchJavaScript(driver, patriceFrom);

    }
    public static void formPagePractise(WebDriver driver, String name, String lastname, String email, String number, String months) throws IOException {
        NameTextPractise= driver.findElement(By.xpath(Utility.getLocators("namepracticetext")));
        NameTextPractise.sendKeys(name);

        LastTextPractise= driver.findElement(By.xpath(Utility.getLocators("lasttextpractise")));
        LastTextPractise.sendKeys(lastname);


        EmailPractise= driver.findElement(By.xpath(Utility.getLocators("mailpractise")));
        EmailPractise.sendKeys(email);

        cochebtn=driver.findElement(By.xpath(Utility.getLocators("cochepractise")));
        Utility.BtnDecatchJavaScript(driver,cochebtn);


        numberTextPractise= driver.findElement(By.xpath(Utility.getLocators("textpractise")));
        numberTextPractise.sendKeys(number);


        dateofbreth=driver.findElement(By.id(Utility.getLocators("dateofbrith")));
        dateofbreth.click();
        monthSelects=driver.findElement(By.xpath(Utility.getLocators("dateofbirths")));
        monthSelects.sendKeys(months);

        yearsSelects=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        yearsSelects.sendKeys("1902");

        day = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='12']"));
        day.click();


        subj= driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        subj.sendKeys("Maths");
        subj.sendKeys(Keys.ENTER);

        hobies=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
        Utility.BtnDecatchJavaScript(driver,hobies);



        adresscurrants= driver.findElement(By.xpath("//textarea['currentAddress']"));
        adresscurrants.sendKeys("4 rue d'arnouville ");

        selectStat=driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
        selectStat.sendKeys("NCR");
        selectStat.sendKeys(Keys.ENTER);

        selectCity=driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
        selectCity.sendKeys("Noida");
        selectCity.sendKeys(Keys.ENTER);

        subBtn=driver.findElement(By.xpath("//button[@id='submit']"));
        Utility.BtnDecatchJavaScript(driver,subBtn);

        closeLargeModal=driver.findElement(By.xpath("//button[@id='closeLargeModal']"));
        Utility.BtnDecatchJavaScript(driver, closeLargeModal);





    }










}
