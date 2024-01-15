package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCheckoutYourInformationPage extends ProductsPage{
    public AddCheckoutYourInformationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='first-name']")
    WebElement firstNameInput;
    @FindBy(xpath = "//*[@id='last-name']")
    WebElement lastNameInput;
    @FindBy(xpath = "//*[@id='postal-code']")
    WebElement postCodeInput;

    @FindBy(xpath = "//*[@id='continue']")
    WebElement continueButton;

    public void waitForOpen(){
        getWait().forVisibility(firstNameInput);
        getWait().forVisibility(lastNameInput);
        getWait().forVisibility(postCodeInput);
        getWait().forVisibility(continueButton);
    }

    public void setFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
    }

    public void setLastNameInput(String lastName){
        lastNameInput.sendKeys(lastName);
    }

    public void setPostCodeInput(String postCode){
        postCodeInput.sendKeys(postCode);
    }

    public void clickContinueButton(){
        continueButton.click();
    }
}
