package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC14_QuantityTest extends TestBaseRapor {

    Locaters page = new Locaters();

    @Test

    public void test14() throws InterruptedException {
        extentTest=extentReports.createTest("Quantity Test",
                "");
        page.goToHomePage();
        page.search("baby shoes");
        page.addToCart();
        page.changeQuantity();

    }
}
