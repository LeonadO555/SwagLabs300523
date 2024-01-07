package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends ProductsPage{
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='cancel']")
    WebElement cancelButton;
    @FindBy(xpath = "//*[@id='finish']")
    WebElement finishButton;

    public void waitForLoading(){
        getWait().forClickable(cancelButton);
        getWait().forClickable(finishButton);
    }

    public void clickCancelButton(){
        cancelButton.click();
    }
    public void clickFinishButton(){
        finishButton.click();
    }
}
