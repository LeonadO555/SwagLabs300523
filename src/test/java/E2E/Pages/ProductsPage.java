package E2E.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="//*[@class='app_logo']")
    WebElement header;

    public void waitForLoading(){
        isElementDisplayed(header);
    }
}
