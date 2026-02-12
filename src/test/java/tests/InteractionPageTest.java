package tests;

import org.testng.annotations.Test;
import pom.FormCalandre;
import pom.HomePage;
import pom.InteractionPage;

import java.io.IOException;

public class InteractionPageTest extends BaseTest{

    @Test(priority = 1)
    public void runspage() throws IOException {
        HomePage.pageHome(driverInstance);

    }

    @Test(priority = 2)
    public void interactionBtns() throws InterruptedException {

        InteractionPage.interactionBtn(driverInstance);

    }
    @Test(priority = 3,dependsOnMethods ="interactionBtns" )
    public void selectableBtns() {

        InteractionPage.selectableBtn(driverInstance);

    }
    @Test(priority = 4,dependsOnMethods = "selectableBtns")
    public void gridBtns() {

        InteractionPage.gridBtn(driverInstance);

    }
    @Test(priority = 5, dependsOnMethods = "gridBtns")
    public void OneGrids() {

        InteractionPage.OneGrid(driverInstance);

    }
    @Test(priority = 6, dependsOnMethods = "OneGrids")
    public void setBtns() {

        InteractionPage.setBtn(driverInstance);

    }
    @Test(priority = 7, dependsOnMethods = "setBtns")
    public void caseTexts() {

        InteractionPage.caseText(driverInstance);

    }


}
