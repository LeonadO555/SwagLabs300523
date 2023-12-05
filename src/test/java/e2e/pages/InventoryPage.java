package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {
    public WebDriver driver;

    public InventoryPage(WebDriver driver) {
        super(driver);
    }
}