package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//div[@class='header_label']")
    public WebElement header;

    @FindBy(xpath = "//div[@id='react-burger-menu-btn']")
    WebElement burgerMenuButton;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    WebElement containerButton;

    @FindBy(xpath = "//div[@class='product_sort_container']")
    WebElement productSortButton;

    @FindBy(xpath = "//*[@class='inventory_list']")
    List<WebElement> productsRows;

    @FindBy(xpath = "//*[@id='item_4_title_link']")
    WebElement addProducts;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public void waitForLoading() {
        getWait().forVisibility(header);
        getWait().forVisibility(burgerMenuButton);
        getWait().forVisibility(containerButton);
        getWait().forVisibility(productSortButton);
        getWait().forAllVisibility(productsRows);
        getWait().forClickable(burgerMenuButton);
        getWait().forVisibility(addProducts);
        getWait().forClickable(addProducts);
    }

    public void waitForOpen() {
        getWait().forVisibility(addProducts);
        getWait().forClickable(addProducts);

    }

    public void setAddProducts(){
        addProducts.click();
    }


}
