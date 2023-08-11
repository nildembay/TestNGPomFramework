package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC13_HomePage extends TestBaseRapor {

    Locaters page = new Locaters();

    @Test

    public void test13() throws InterruptedException {
        extentTest=extentReports.createTest("Category Home",
                "");
        page.goToHomePage();
        page.goToHome();


    }

}
