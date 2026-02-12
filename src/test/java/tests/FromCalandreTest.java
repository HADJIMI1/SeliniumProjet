package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.FormCalandre;
import pom.HomePage;

import java.io.IOException;

public class FromCalandreTest extends BaseTest {

    @Test(priority = 1)
    public void runs() throws IOException {

        HomePage.pageHome(driverInstance);
    }


    @Test(priority = 2,dependsOnMethods = "runs")
    public void formPageCalandres() {

        FormCalandre.formPageCalandre(driverInstance);

    }

    @Test(priority = 3, dependsOnMethods = "formPageCalandres")
    public void formPatrices() throws IOException {

        FormCalandre.formPatrice(driverInstance);
    }


    @Test(priority=4, dependsOnMethods = "formPatrices")
    public void formPagePractises() throws IOException {
    FormCalandre.formPagePractise(driverInstance);
    }

}
