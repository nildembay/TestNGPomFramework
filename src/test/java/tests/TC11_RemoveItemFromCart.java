package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC11_RemoveItemFromCart extends TestBaseRapor {
    Locaters page = new Locaters();

    @Test

    public void test11() throws InterruptedException {
        extentTest=extentReports.createTest("Delete product from cart",
                "");
        page.goToHomePage();
        page.search("baby shoes");
        page.addToCart();
        page.removeItemFromCart();


    }
}
