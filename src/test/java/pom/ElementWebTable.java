package pom;

import org.app.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilityData.DataUtility;

import java.io.IOException;

public class ElementWebTable {

    public static  WebElement elementClick, addboutton, webBut, namechamp, lastchamp;
    public static WebElement mailchamp,agechamp, salarychamp, deptchamp, btnForm;
    public static WebElement eltbtn;

    public static By elements;
    public static By butadd;
    public static By webbuts;
    public static By namechamps;
    public static By lastchamps;
    public static By mailchamps;
    public static By agechamps;
    public static By salarychamps;
    public static By deptchamps;
    public static By btnForms;
    //button[@id='addNewRecordButton']
    static {
        try {
           elements= By.xpath(Utility.getLocators("elementes"));
           butadd=By.xpath(Utility.getLocators("addbutton"));
           webbuts= By.xpath(Utility.getLocators("webtables"));
           namechamps= By.xpath(Utility.getLocators("firstname"));
           lastchamps= By.xpath(Utility.getLocators("lastname"));
           mailchamps=By.xpath(Utility.getLocators("usermail"));
           agechamps= By.xpath(Utility.getLocators("ages"));
           salarychamps= By.xpath(Utility.getLocators("salary"));
           deptchamps= By.xpath(Utility.getLocators("dept"));
           btnForms= By.xpath(Utility.getLocators("sub"));

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void ElementsBtnsClick(WebDriver driver) throws IOException {

        elementClick =driver.findElement(elements);

        Utility.BtnDecatchJavaScript(driver,elementClick);

    }
    public static void webtables(WebDriver driver){
        webBut=driver.findElement(webbuts);
        Utility.BtnDecatchJavaScript(driver,webBut);
    }


    public static void addTables(WebDriver driver){
        addboutton =driver.findElement(butadd);
        Utility.BtnDecatchJavaScript(driver,addboutton);
    }

    public static void namearea(WebDriver driver) throws IOException {
        namechamp= driver.findElement(namechamps);
        namechamp.sendKeys(DataUtility.getData("name"));

        lastchamp= driver.findElement(lastchamps);
        lastchamp.sendKeys(DataUtility.getData("last"));

        mailchamp= driver.findElement(mailchamps);
        mailchamp.sendKeys(DataUtility.getData("mail"));

        agechamp= driver.findElement(agechamps);
        agechamp.sendKeys(DataUtility.getData("age"));

        salarychamp= driver.findElement(salarychamps);
        salarychamp.sendKeys(DataUtility.getData("salaire"));

        deptchamp= driver.findElement(deptchamps);
        deptchamp.sendKeys(DataUtility.getData("dep"));
    }

public static void subForm(WebDriver driver){
        btnForm=driver.findElement(btnForms);
        Utility.BtnDecatchJavaScript(driver, btnForm);
}


public static void interaction(WebDriver driver){

        eltbtn=driver.findElement(By.xpath("//div[@class='header-text']"));
        Utility.BtnDecatchJavaScript(driver, eltbtn);

}









































}
