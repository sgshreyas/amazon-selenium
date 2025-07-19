package tests;

import Base.BaseClass;
import org.testng.annotations.Test;
import pages.AmazonHomePage;


public class AmazonTest extends BaseClass {

    @Test
    public void testSearchAndAddToCart(){
        AmazonHomePage home = new AmazonHomePage(driver);
        home.searchProduct("earphones");
        home.clickEarBuds();
        home.clickAddToCart();
        home.clickProceedToBuy();
    }
}
