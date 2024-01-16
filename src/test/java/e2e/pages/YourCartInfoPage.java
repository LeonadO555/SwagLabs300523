package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartInfoPage extends ProductsInfoPage{
    public YourCartInfoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='header_label']")
    public WebElement header;

    @FindBy(xpath = "//*[@id='remove-sauce-labs-backpack']")
    WebElement removeButton;

    @FindBy(xpath = "//*[@id='continue-shopping']")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@id='checkout']")
    WebElement checkoutButton;

    public void waitForOpen(){
        getWait().forVisibility(removeButton);
        getWait().forVisibility(continueShoppingButton);
        getWait().forClickable(checkoutButton);
    }

    public void clickCheckoutButton(){
        checkoutButton.click();
    }

}
