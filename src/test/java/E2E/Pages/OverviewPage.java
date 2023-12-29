package E2E.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OverviewPage extends YourInformation{
    public OverviewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='header_secondary_container']")
    WebElement header;
    @FindBy(xpath = "//*[@class='summary_subtotal_label']")
    WebElement totalPrice;
    @FindBy(xpath = "//*[@id='finish']")
    WebElement finishButton;
    @FindBy(xpath = "//*[@id='cancel']")
    WebElement canselButton;
    public void waitForLoading() {
        getWait().forVisibility(header);
        getWait().forClickable(finishButton);
    }
    public List<WebElement> getProductCountOnOverviewPage() {
        return driver.findElements(By.xpath("//*[@class='cart_list']//*[@class='cart_item']"));
    }
    public void clickOnFinishButton(){
        finishButton.click();
    }


}
