package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends ProductsPage{
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='back-to-products']")
    WebElement backButton;

    public void waitForLoading(){
        getWait().forClickable(backButton);
    }

    public void clickBackButton(){
        backButton.click();
    }
}
