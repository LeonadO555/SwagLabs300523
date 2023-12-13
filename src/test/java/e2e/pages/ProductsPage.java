package e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

        @FindBy(xpath = "//div[@id='react-burger-menu-btn']")
        public WebElement menuButton;

       @FindBy(xpath = "//div[@class='app_logo']")
        public WebElement header;

        @FindBy(xpath = "//div[@class='shopping_cart_link']")
        public WebElement CartLink;

    public  void waitForLoading(){
        getWait().forVisibility(header);
        getWait().forVisibility(menuButton);
        getWait().forVisibility(CartLink);
    }
}
