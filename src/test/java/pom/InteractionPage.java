package pom;

import org.app.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InteractionPage {

public static WebElement interactionsBtn, gridClick, oneGridBtn,oneGridBtn1,oneGridBtn2;
public static WebElement set, caseTexts;

public static void  interactionBtn(WebDriver driver){
    interactionsBtn= driver.findElement(By.xpath("//*[contains(text(),'Interactions')]"));
    Utility.BtnDecatchJavaScript(driver,interactionsBtn);
}
public static void selectableBtn(WebDriver driver){
    interactionsBtn= driver.findElement(By.xpath("//*[contains(text(),'Selectable')]"));
    Utility.BtnDecatchJavaScript(driver,interactionsBtn);
}


public static void gridBtn(WebDriver driver){
    gridClick=driver.findElement(By.xpath("//a[@id='demo-tab-grid']"));
    Utility.BtnDecatchJavaScript(driver, gridClick);
}
public static void OneGrid(WebDriver driver){
    oneGridBtn=driver.findElement(By.xpath("//li[@class='list-group-item list-group-item-action'][1]"));
    Utility.BtnDecatchJavaScript(driver,oneGridBtn);

    oneGridBtn1=driver.findElement(By.xpath("//li[@class='list-group-item list-group-item-action'][2]"));
    Utility.BtnDecatchJavaScript(driver,oneGridBtn1);


    oneGridBtn2=driver.findElement(By.xpath("//li[@class='list-group-item list-group-item-action'][2]"));
    Utility.BtnDecatchJavaScript(driver,oneGridBtn2);
}



public static void setBtn(WebDriver driver){
    set=driver.findElement(By.xpath("//a[@id='demo-tab-list']"));
    Utility.BtnDecatchJavaScript(driver,set);

}

public static void caseText(WebDriver driver){
    caseTexts=driver.findElement(By.xpath("//li[@class='mt-2 list-group-item list-group-item-action'][3]"));
    Utility.BtnDecatchJavaScript(driver,caseTexts);
}




}
