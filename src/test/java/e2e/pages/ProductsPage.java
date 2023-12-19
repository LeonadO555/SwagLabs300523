package e2e.pages;

import e2e.BasePage;
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


    public void openProductPage() {
        products.click();

    }
}





