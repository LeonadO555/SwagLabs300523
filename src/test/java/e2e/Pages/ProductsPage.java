package e2e.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {super(driver);
    }

    @FindBy(xpath = "//*[@id='header_container']")
    WebElement header;


    public void waitForLoading(){
        getWait().forVisibility(header);
        }

    public boolean confirmLogin(){
        return header.isDisplayed();

        }
    }

