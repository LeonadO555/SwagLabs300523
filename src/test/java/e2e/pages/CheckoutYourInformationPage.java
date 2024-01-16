package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPage extends ProductsPage {
    public CheckoutYourInformationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='first-name']")
    WebElement firstName;
    @FindBy(xpath = "//*[@id='last-name']")
    WebElement lastName;
    @FindBy(xpath = "//*[@id='postal-code']")
    WebElement postCode;
    @FindBy(xpath = "//*[@id='cancel']")
    WebElement cancelButton;
    @FindBy(xpath = "//*[@id='continue']")
    WebElement continueButton;
    public void waitForLoading(){
        getWait().forVisibility(firstName);
        getWait().forVisibility(lastName);
        getWait().forVisibility(postCode);
        getWait().forClickable(cancelButton);
        getWait().forClickable(continueButton);
    }
    public String getFirstName(){
        return firstName.getText();
    }
    public String getLastName(){
        return lastName.getText();
    }
    public String getPostCode(){
        return postCode.getText();
    }
    public void clickCancelButton(){
        cancelButton.click();
    }
    public void clickContinueButton(){
        continueButton.click();
    }

}
