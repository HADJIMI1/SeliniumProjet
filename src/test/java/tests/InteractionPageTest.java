package tests;

import org.testng.annotations.Test;
import pom.FormCalandre;
import pom.InteractionPage;

public class InteractionPageTest extends BaseTest{

    @Test(priority = 1)
    public void interactionBtns() {

        InteractionPage.interactionBtn(driver);

    }
    @Test(priority = 2,dependsOnMethods ="interactionBtns" )
    public void selectableBtns() {

        InteractionPage.selectableBtn(driver);

    }
    @Test(priority = 3,dependsOnMethods = "selectableBtns")
    public void gridBtns() {

        InteractionPage.gridBtn(driver);

    }
    @Test(priority = 4, dependsOnMethods = "gridBtns")
    public void OneGrids() {

        InteractionPage.OneGrid(driver);

    }
    @Test(priority = 5, dependsOnMethods = "OneGrids")
    public void setBtns() {

        InteractionPage.setBtn(driver);

    }
    @Test(priority = 4, dependsOnMethods = "setBtns")
    public void caseTexts() {

        InteractionPage.caseText(driver);

    }


}
