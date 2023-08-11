package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC04_FindHighestPrice extends TestBaseRapor {
    Locaters page=new Locaters();
    @Test

    public void test4() throws InterruptedException {
        extentTest=extentReports.createTest("Find Highest Price",
                "");
        page.goToHomePage();
        page.search("shirts");
        page.highestPrice();








    }

}
