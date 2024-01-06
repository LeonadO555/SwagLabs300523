package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProducts extends ProductsPage {
    public AddProducts(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='item_4_title_link']")
    WebElement addProducts;

    public void waitForOpen(){
        getWait().forVisibility(addProducts);
    }

    public void setAddProductsClick(){
        addProducts.click();
    }
}
