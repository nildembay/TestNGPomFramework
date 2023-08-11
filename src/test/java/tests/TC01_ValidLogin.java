package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC01_ValidLogin extends TestBaseRapor {

   Locaters page=new Locaters();


    @Test
    public void test1() throws InterruptedException {
        extentTest=extentReports.createTest("Valid Login",
                "");
        page.goToHomePage();
        page.signIn();




    }

}
