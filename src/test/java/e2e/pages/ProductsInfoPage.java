package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsInfoPage extends ProductsPage {
    public ProductsInfoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='back-to-products']")
    WebElement backToProductsButton;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='remove-sauce-labs-backpack']")
    WebElement removeButton;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    WebElement containerButton;

    public void waitForLoading(){
        getWait().forClickable(backToProductsButton);
        getWait().forVisibility(addToCartButton);
        getWait().forClickable(removeButton);
    }

    @Override
    public void waitForOpen() {
        getWait().forClickable(addToCartButton);
        getWait().forClickable(containerButton);
    }

    public void clickBackToProductsButton(){
        backToProductsButton.click();
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }
    public void clickContainerButton(){
        containerButton.click();
    }
    public void clickRemoveButton(){
        removeButton.click();
    }
}
