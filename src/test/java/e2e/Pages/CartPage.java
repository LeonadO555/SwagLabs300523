package e2e.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='remove-sauce-labs-backpack']")
    WebElement removeBackpack;

    @FindBy(xpath = "//*[@id='remove-sauce-labs-bike-light']")
    WebElement removeBike;

    @FindBy(xpath = "//*[@id='remove-sauce-labs-bolt-t-shirt']")
    WebElement removeTshirt;

    @FindBy(xpath = "//*[@id='checkout']")
    WebElement checkoutButton;


    public void waitForLoading() {
        getWait().forClickable(removeBackpack);
        getWait().forClickable(removeBike);
        getWait().forClickable(removeTshirt);
        getWait().forClickable(checkoutButton);

    }
    public void deleteProduct(){
        removeBackpack.click();
        getWait().forInvisibility(removeBackpack);
        removeBike.click();
        getWait().forInvisibility(removeBike);
        removeTshirt.click();
        getWait().forInvisibility(removeTshirt);

    }

    public void checkout(){
        checkoutButton.click();
        getWait().forInvisibility(checkoutButton);
    }
}