package e2e.pages;

import e2e.BasePage;
import e2e.Wait.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='app_logo']")
    WebElement header;

    @FindBy(xpath = "//*[@class='header_label']")
    WebElement headerLabel;

    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    WebElement basket;

    @FindBy(xpath = "//*[@class='title]")
    WebElement products;

    public void waitForLoading() {
        getWait().forVisibility(header);
        getWait().forVisibility(headerLabel);
        getWait().forVisibility(basket);

    }

    private Wait getWait() {
        return new Wait(driver);
    }


    public void openProductsPage() {
        products.click();

    }
}
