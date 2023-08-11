package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC03_SearchViaSearchArea extends TestBaseRapor {
    Locaters page=new Locaters();
    @Test

    public void test3() throws InterruptedException {
        extentTest=extentReports.createTest("Search via Search Area",
                "");
        page.goToHomePage();
        page.search("jeans");





    }
}
