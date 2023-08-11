package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC07_AddToCart extends TestBaseRapor {

    Locaters page=new Locaters();
    @Test

    public void test7() throws InterruptedException {
        extentTest=extentReports.createTest("Add to Cart",
                "");
        page.goToHomePage();
        page.search("baby shoes");
        page.addToCart();



    }
}
