package E2E.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class YourCardPage extends BasePage{
    public YourCardPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='header_secondary_container']")
    WebElement yourCardHadar;
    @FindBy(xpath = "//*[@id='continue-shopping']")
    WebElement backToContinueShopping;

    public void waitForLoading(){
        getWait().forVisibility(yourCardHadar);
        getWait().forClickable(backToContinueShopping);
    }
    public List<WebElement>getItemsInCard(){
        return driver.findElements(By.xpath("//*[@class='cart_item']"));
    }


    public void waitForLoadingYourCardPage(){
        Assert.assertTrue(isElementDisplayed(yourCardHadar));
    }
    public void ContinueShoppingButton(){
        backToContinueShopping.click();
    }
}
