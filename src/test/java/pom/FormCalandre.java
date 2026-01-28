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




    public static By formsbtn,patriceForm;
    public static  By nametextpatrice;
    public static  By last_text_patrice,mail_Patrice;
    public static  By cocherbtn,numbers,dateOfBrith;
    public static By month,year,days;
    public static By subjct, hobiese, Adress_current ;
    public static By selectState, selectCitys;
    public static By close,subBtns;

    static {
        try {
           formsbtn =By.xpath(Utility.getLocators("formsbtn"));
           patriceForm=By.xpath(Utility.getLocators("praticeForms"));
           nametextpatrice=By.xpath(Utility.getLocators("namepracticetext"));
           last_text_patrice=By.xpath(Utility.getLocators("lasttextpractise"));
          mail_Patrice =By.xpath(Utility.getLocators("mailpractise"));
          cocherbtn=By.xpath(Utility.getLocators("cochepractise"));
          numbers=By.xpath(Utility.getLocators("textpractise"));
          dateOfBrith=By.id(Utility.getLocators("dateofbrith"));
          month=By.xpath(Utility.getLocators("dateofbirths"));
          year=By.xpath("//select[@class='react-datepicker__year-select']");
          days=By.xpath("//div[contains(@class,'react-datepicker__day') and text()='12']");
          subjct=By.xpath("//input[@id='subjectsInput']");
          hobiese=By.xpath("//input[@id='hobbies-checkbox-2']");
          Adress_current=By.xpath("//textarea['currentAddress']");
         selectState=By.xpath("//input[@id='react-select-3-input']");
         selectCitys=By.xpath("//input[@id='react-select-4-input']");
         close=By.xpath("//button[@id='closeLargeModal']");
         subBtns=By.xpath("//button[@id='submit']");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }





    public static void formPageCalandre(WebDriver driver){
        formbtn=driver.findElement(formsbtn);
        Utility.BtnDecatchJavaScript(driver,formbtn);
    }
    public static void formPatrice(WebDriver driver) throws IOException {
        patriceFrom = driver.findElement(patriceForm);
        Utility.BtnDecatchJavaScript(driver, patriceFrom);

    }
    public static void formPagePractise(WebDriver driver, String name, String lastname, String email, String number, String months) throws IOException {
        NameTextPractise= driver.findElement(nametextpatrice);
        NameTextPractise.sendKeys(name);

        LastTextPractise= driver.findElement(last_text_patrice);
        LastTextPractise.sendKeys(lastname);


        EmailPractise= driver.findElement(mail_Patrice);
        EmailPractise.sendKeys(email);

        cochebtn=driver.findElement(cocherbtn);
        Utility.BtnDecatchJavaScript(driver,cochebtn);


        numberTextPractise= driver.findElement(numbers);
        numberTextPractise.sendKeys(number);


        dateofbreth=driver.findElement(dateOfBrith);
        Utility.BtnDecatchJavaScript(driver,dateofbreth);

        monthSelects=driver.findElement(month);
        monthSelects.sendKeys(months);

        yearsSelects=driver.findElement(year);
        yearsSelects.sendKeys("1902");

        day = driver.findElement(days);
        day.click();


        subj= driver.findElement(subjct);
        subj.sendKeys("Maths");
        subj.sendKeys(Keys.ENTER);

        hobies=driver.findElement(hobiese);
        Utility.BtnDecatchJavaScript(driver,hobies);



        adresscurrants= driver.findElement(Adress_current);
        adresscurrants.sendKeys("4 rue d'arnouville ");

        selectStat=driver.findElement(selectState);
        selectStat.sendKeys("NCR");
        selectStat.sendKeys(Keys.ENTER);

        selectCity=driver.findElement(selectCitys);
        selectCity.sendKeys("Noida");
        selectCity.sendKeys(Keys.ENTER);

        subBtn=driver.findElement(subBtns);
        Utility.BtnDecatchJavaScript(driver,subBtn);

        closeLargeModal=driver.findElement(close);
        Utility.BtnDecatchJavaScript(driver, closeLargeModal);





    }










}
