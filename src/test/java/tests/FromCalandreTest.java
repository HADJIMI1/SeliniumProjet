package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.FormCalandre;

import java.io.IOException;

public class FromCalandreTest extends BaseTest {




    @Test(priority = 1)
    public void formPageCalandres() {

        FormCalandre.formPageCalandre(driver);

    }

    @Test(priority = 2, dependsOnMethods = "formPageCalandres")
    public void formPatrices() throws IOException {

        FormCalandre.formPatrice(driver);
    }


    @Test(priority=3, dependsOnMethods = "formPatrices")
    public void formPagePractises() throws IOException {
    FormCalandre.formPagePractise(driver);
    }

}
