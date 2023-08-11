package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC12_Currency extends TestBaseRapor {
    Locaters page = new Locaters();

    @Test

    public void test12() throws InterruptedException {
        extentTest=extentReports.createTest("Change Currency",
                "");
        page.goToHomePage();
        page.changeCurrency();


    }
}