package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC10_SaleZoneScreen extends TestBaseRapor {


    Locaters page=new Locaters();
    @Test

    public void test10() throws InterruptedException {
        extentTest=extentReports.createTest("Sale Zone",
                "");
        page.goToHomePage();
        page.saleZone();




    }

}
