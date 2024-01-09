package e2e.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {super(driver);
    }

    @FindBy(xpath = "//*[@id='header_container']")
    WebElement header;

    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    WebElement cartButton;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addBackpack;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement addBike;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement addTshirt;

    public void waitForLoading(){
        getWait().forVisibility(header);
        getWait().forClickable(cartButton);
        getWait().forVisibility(addBackpack);
        getWait().forVisibility(addBike);
        getWait().forVisibility(addTshirt);
    }

    public boolean confirmLogin(){
        return header.isDisplayed();
    }

    public void addProduct(){
        addBackpack.click();
        getWait().forInvisibility(addBackpack);
        addBike.click();
        getWait().forInvisibility(addBike);
        addTshirt.click();
        getWait().forInvisibility(addTshirt);

    }

    public void checkCart (){
    cartButton.click();
    getWait().forVisibility(cartButton);
    }
}


