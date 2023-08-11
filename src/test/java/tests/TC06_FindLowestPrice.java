package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC06_FindLowestPrice extends TestBaseRapor {

    Locaters page=new Locaters();
    @Test

    public void test6() throws InterruptedException {
        extentTest=extentReports.createTest("Find Lowest Price",
                "");
        page.goToHomePage();
        page.search("baby shoes");
        page.lowestPrice();

    }
}
