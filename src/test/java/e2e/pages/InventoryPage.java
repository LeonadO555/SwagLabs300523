package e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class InventoryPage extends BasePage {
    public WebDriver driver;

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    WebElement burgerMenuButton;

    @FindBy(xpath = "//div[@class='bm-menu-wrap']")
    WebElement menuWrapButton;
    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    WebElement logoutLinkButton;

    //@FindBy(xpath = "//*[@id='item_0_title_link']")
    //WebElement titleLinkButton;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartSauceLabsBackpackButton;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement addToCartSauceLabsBikeLightButton;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement addToCartSauceLabBoltTShirtsButton;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement addToCartSauceLabsFleeceJacketButton;
    @FindBy(xpath = "//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    WebElement addToCartTShirtRedButton;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-onesie']")
    WebElement addToCartSauceLabsOneSizeButton;


    public void waitForLoading() {
        getWait().forInvisibility(burgerMenuButton);
        getWait().forInvisibility(menuWrapButton);
        getWait().forInvisibility(logoutLinkButton);
        getWait().forClickable(addToCartSauceLabsBackpackButton);
        getWait().forClickable(addToCartSauceLabsBikeLightButton);
        getWait().forClickable(addToCartSauceLabBoltTShirtsButton);
        getWait().forClickable(addToCartSauceLabsFleeceJacketButton);
        getWait().forClickable(addToCartTShirtRedButton);
        getWait().forClickable(addToCartSauceLabsOneSizeButton);
    }

    public void setBurgerMenuButton() {
        burgerMenuButton.click();
    }

    public void setLogoutLinkButton() {
        logoutLinkButton.click();
    }
}