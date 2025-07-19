package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    WebDriver driver;
    public AmazonHomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchBtn;

    @FindBy(partialLinkText = "OnePlus Nord Buds 2r True Wireless in Ear Earbuds")
    private WebElement EarBuds;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartBtn;

    @FindBy(name = "proceedToRetailCheckout")
    private WebElement ProceedToBuy;

    public void searchProduct(String productName) {
        searchBox.sendKeys(productName);
        searchBtn.click();
    }

    public void clickEarBuds() {
        EarBuds.click();
    }

    public void clickProceedToBuy(){
        ProceedToBuy.click();
    }

    public void clickAddToCart() {
        // Switch to the new tab (Amazon opens product in a new tab)
        for (String win : driver.getWindowHandles()) {
            driver.switchTo().window(win);
        }

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartBtn);
        addToCartBtn.click();



    }

}
