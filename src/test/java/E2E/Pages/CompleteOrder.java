package E2E.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompleteOrder extends OverviewPage{
    public CompleteOrder(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='complete-header']")
    WebElement completeHeader;
    @FindBy(xpath = "//*[@id='back-to-products']")
    WebElement backHomeButton;

    public void waitForLoading() {
        getWait().forVisibility(completeHeader);
        getWait().forClickable(backHomeButton);
    }
    public void clickOnBackHomeButton(){
        backHomeButton.click();
    }

}
