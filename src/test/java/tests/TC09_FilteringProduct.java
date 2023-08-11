package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC09_FilteringProduct extends TestBaseRapor {


    Locaters page=new Locaters();
    @Test

    public void test9() throws InterruptedException {
        extentTest=extentReports.createTest("Filtering Product",
                "");
        page.goToHomePage();
        page.filteringProduct();


    }

}
