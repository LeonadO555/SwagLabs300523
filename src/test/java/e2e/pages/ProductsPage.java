package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='header_label']")
    public WebElement header;
    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    WebElement shoppingCartContainer;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartBackPack;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement addToCartBikeLight;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement addToCartTShirt;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement addToCartFleeceJacket;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-onesie']")
    WebElement addToCartOnesie;
    @FindBy(xpath = "//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    WebElement addToCartTShirtRed;

}
