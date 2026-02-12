package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.WighetPage;

import java.io.IOException;

public class WigthetPageTest extends BaseTest{

    @Test(priority = 1)
    public void runs() throws IOException {
        HomePage.pageHome(driverInstance);
    }

    @Test(priority = 2, dependsOnMethods = "runs")
    public void elementWighets() throws IOException {
    WighetPage.elementWighet(driverInstance);
}
@Test(priority = 3 , dependsOnMethods = "elementWighets")
    public void accordians(){
    WighetPage.accordian(driverInstance);
}

@Test(priority = 4, dependsOnMethods ="accordians" )

public void TextConsols(){
    WighetPage.TextConsol(driverInstance);
}

@Test(priority = 5,dependsOnMethods = "TextConsols")
    public void afficheTextConsols(){
    WighetPage.afficheTextConsol(driverInstance);
}
@Test(priority = 6 ,dependsOnMethods = "afficheTextConsols")

public void tabs(){
    WighetPage.tabs(driverInstance);
}

@Test(priority = 7,dependsOnMethods ="tabs" )
    public void UseTexts(){
    WighetPage.UseText(driverInstance);
}
@Test(priority = 8, dependsOnMethods = "UseTexts")
public void textTapsConsols() throws InterruptedException {
    WighetPage.textTapsConsol(driverInstance);
}

}
