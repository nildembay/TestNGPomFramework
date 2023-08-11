package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC15_BestSeller extends TestBaseRapor {
    Locaters page = new Locaters();

    @Test

    public void test15() throws InterruptedException {
        extentTest=extentReports.createTest("Best Seller Page",
                "");
        page.goToHomePage();
        page.displayBestSeller();

    }


}
