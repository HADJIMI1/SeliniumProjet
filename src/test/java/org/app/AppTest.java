package org.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.*;

import java.io.IOException;


public class AppTest{


    public static WebDriver driver;




    public static void main (String[] args) throws IOException, InterruptedException {




        driver= new ChromeDriver();

        HomePage.pageHome(driver);

        HomePage.elementBtns(driver);
        HomePage.textBoxs(driver);

        HomePage.formPageElement(driver);


        FormCalandre.formPageCalandre(driver);
        FormCalandre.formPatrice(driver);
        FormCalandre.formPagePractise(driver);


        WighetPage.elementWighet(driver);


        WighetPage.accordian(driver);

        WighetPage.TextConsol(driver);
        WighetPage.textElemnt2(driver);


        WighetPage.afficheTextConsol(driver);

        WighetPage.tabs(driver);


        WighetPage.UseText(driver);

        WighetPage.textTapsConsol(driver);


        ElementWebTable.ElementsBtnsClick(driver);

        ElementWebTable.webtables(driver);

        ElementWebTable.addTables(driver);

        ElementWebTable.namearea(driver);

        ElementWebTable.subForm(driver);


        InteractionPage.interactionBtn(driver);

        InteractionPage.selectableBtn(driver);


        InteractionPage.gridBtn(driver);

        InteractionPage.OneGrid(driver);


        InteractionPage.setBtn(driver);
        InteractionPage.caseText(driver);
        DatePicker.datePick(driver);














}}