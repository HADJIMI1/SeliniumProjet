package pom;

import org.app.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static org.app.AppTest.driver;

public class WighetPage {





    public static WebElement elementBtnWighet,accordian;
    public static WebElement  textElement,textbutton,textchamps;
    public static WebElement elementTabs, usetextbtn;
    public static WebElement  textConsolTab;




    public static By elementText,eleWighetBtn, elementText2 ;
    public static By textBtn, accordianBtn, texConsolTab;



    static {
        try {
           elementText=By.xpath(Utility.getLocators("pagetextelement"));
           eleWighetBtn=By.xpath(Utility.getLocators("elementBtnwighets"));
           elementText2=By.xpath("//div[@id='section2Content']");
           textBtn=By.id("section2Heading");
           accordianBtn=By.xpath("//*[contains(text(),'Accordian')]");
            texConsolTab=By.xpath("//div[@id='demo-tabpane-use']//p");






        } catch (IOException e) {
         }

    }

    public static void elementWighet(WebDriver driver) throws IOException {
        elementBtnWighet=driver.findElement(eleWighetBtn);
        Utility.BtnDecatchJavaScript(driver,elementBtnWighet);

    }

    public static void accordian(WebDriver driver){
        accordian=driver.findElement(accordianBtn);
        Utility.BtnDecatchJavaScript(driver,accordian);

    }

    public static void TextConsol(WebDriver driver){
         textElement=driver.findElement(elementText);
        String textpage;
        textpage=textElement.getText();
        System.out.println("Affiche moi ce text :" +textpage);
    }


    public static void textElemnt2(WebDriver driver ){

        textbutton=driver.findElement(textBtn);
        textbutton.click();

    }

    public static void afficheTextConsol(WebDriver driver){
        textchamps= driver.findElement(elementText2);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementText2));
        String textEle2;

        textEle2=textchamps.getText();
        System.out.println("affiche moi le deuxieme text:" +textEle2);

    }

    public static void tabs(WebDriver driver){

        elementTabs=driver.findElement(By.xpath("//*[contains(text(),'Tabs')]"));
        Utility.BtnDecatchJavaScript(driver,elementTabs);

    }


    public static void UseText(WebDriver driver){
        usetextbtn=driver.findElement(By.xpath("//a[@id='demo-tab-use']"));
        Utility.BtnDecatchJavaScript(driver,usetextbtn);

    }


    public static void textTapsConsol(WebDriver driver) throws InterruptedException {
        textConsolTab=driver.findElement(texConsolTab);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(texConsolTab));
        String tabstextarea;
        tabstextarea=textConsolTab.getText();
        System.out.println("le troisieme text :"+tabstextarea);
    }









}
