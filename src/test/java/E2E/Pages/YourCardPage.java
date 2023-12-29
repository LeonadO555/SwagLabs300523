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

    @FindBy(xpath = "//*[@id='remove-sauce-labs-backpack']")
    WebElement removeSauceLabsBackpack;

    @FindBy(xpath = "//*[@id='remove-sauce-labs-bike-light']")
    WebElement removeSauceLabsBikeLight;

    @FindBy(xpath = "//*[@id='remove-sauce-labs-bolt-t-shirt']")
    WebElement removeSauceLabsBoltT_Shirt;

    @FindBy(xpath = "//*[@id='remove-sauce-labs-fleece-jacket']")
    WebElement removeSauceLabsFleeceJacket;

    @FindBy(xpath = "//*[@id='remove-sauce-labs-onesie']")
    WebElement removeSauceLabsOnesie;

    @FindBy(xpath = "//*[@id='remove-test.allthethings()-t-shirt-(red)']")
    WebElement removeTest_allTheThings_T_Shirt_Red;

    public void waitForLoading() {
        getWait().forVisibility(yourCardHadar);
        getWait().forClickable(backToContinueShopping);
    }

    public List<WebElement> getItemsInCard() {
        return driver.findElements(By.xpath("//*[@class='cart_item']"));
    }


    public void waitForLoadingYourCardPage() {
        Assert.assertTrue(isElementDisplayed(yourCardHadar));
    }

    public void continueShoppingButton() {
        backToContinueShopping.click();
    }
    public void removeItemInYourCard(ProductsInfoTabs productsInfoTabs){
        WebElement removeFromCardButton = driver.findElement(By.xpath(productsInfoTabs.getRemoveFromCartXPath()));
        removeFromCardButton.click();
    }
}
