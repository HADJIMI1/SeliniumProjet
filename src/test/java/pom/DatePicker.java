package pom;

import org.app.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {


    public static WebElement btnWidg;

    public static void datepick(WebDriver driver){

        btnWidg=driver.findElement(By.xpath("//*[contains(text(),'Widgets')]"));
        Utility.BtnDecatchJavaScript(driver,btnWidg);



    }





}
