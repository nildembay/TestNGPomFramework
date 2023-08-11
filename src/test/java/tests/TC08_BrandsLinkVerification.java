package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC08_BrandsLinkVerification extends TestBaseRapor {

    Locaters page = new Locaters();

    @Test

    public void test8() throws InterruptedException {
        extentTest=extentReports.createTest("Brands Link Verification",
                "");
        page.goToHomePage();
        page.brandsLink();

    }

}
