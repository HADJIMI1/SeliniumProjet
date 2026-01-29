package pom;

import org.app.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {


    public static WebElement btnWidg, btnPick, dateChamp, yearSelect, monthSelect, daySelect;

    public static void datePick(WebDriver driver){

        btnWidg=driver.findElement(By.xpath("//*[contains(text(),'Widgets')]"));
        Utility.BtnDecatchJavaScript(driver,btnWidg);

        btnPick=driver.findElement(By.xpath("//*[contains(text(),'Date Picker')]"));
        Utility.BtnDecatchJavaScript(driver,btnPick);

        dateChamp=driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
        Utility.BtnDecatchJavaScript(driver,dateChamp);

        yearSelect=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        yearSelect.sendKeys("2002");

        monthSelect=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        monthSelect.sendKeys("october");

        daySelect=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--002']"));
       Utility.BtnDecatchJavaScript(driver,daySelect);




    }



//div[contains(@class,'react-datepicker__day') and text()='12']"

}
