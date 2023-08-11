package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC05_PriceRangeDisplay extends TestBaseRapor {

    Locaters page=new Locaters();
    @Test

    public void test5() throws InterruptedException {
        extentTest=extentReports.createTest("Price Range Display",
                "");
        page.goToHomePage();
        page.search("phone");
        page.priceRange();



    }


}
