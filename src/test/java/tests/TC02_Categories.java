package tests;

import org.testng.annotations.Test;
import pages.Locaters;
import utilities.TestBaseRapor;

public class TC02_Categories extends TestBaseRapor {

    Locaters page=new Locaters();


    @Test
    public void test2() throws InterruptedException {
        extentTest=extentReports.createTest("Main Categories",
                "");
        page.goToHomePage();
        page.categoryControl();
    }

}
