package E2E.Pages;

import E2E.enums.ProductsInfoTabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class YourCardPage extends BasePage {
    public YourCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='header_secondary_container']")
    WebElement yourCardHadar;
    @FindBy(xpath = "//*[@id='continue-shopping']")
    WebElement backToContinueShopping;

    @FindBy(xpath = "//*[@id='contents_wrapper']")
    WebElement productsOnYourCardPage;
    @FindBy(xpath = "//*[@id='checkout']")
    WebElement checkoutButton;

    public void waitForLoading() {
        getWait().forVisibility(yourCardHadar);
        getWait().forClickable(backToContinueShopping);
    }

    public List<WebElement> getItemsInCard() {
        return driver.findElements(By.xpath("//*[@id='cart_contents_container']//*[@class='cart_item']"));
    }

    public void takeScreenshotOnYourCardPage(){
        takeAndCompareScreenshot("YourCard_Page_Select_3_Items",productsOnYourCardPage);
    }



    public void continueShoppingButton() {
        backToContinueShopping.click();
    }
    public void removeItemInYourCard(ProductsInfoTabs productsInfoTabs){
        WebElement removeFromCardButton = driver.findElement(By.xpath(productsInfoTabs.getRemoveFromCartXPath()));
        removeFromCardButton.click();
    }
    public void checkout (){
        checkoutButton.click();
    }
}
