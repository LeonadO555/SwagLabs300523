package E2E.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourInformation extends BasePage{
    public YourInformation(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='header_secondary_container']")
    WebElement header;
    @FindBy(xpath = "//*[@id='first-name']")
    WebElement firstNameInput;
    @FindBy(xpath = "//*[@id='last-name']")
    WebElement lastNameInput;
    @FindBy(xpath = "//*[@id='postal-code']")
    WebElement postCodeInput;
    @FindBy(xpath = "//*[@id='continue']")
    WebElement continueButton;
    @FindBy(xpath = "//*[@id='cancel']")
    WebElement cancelButton;
    public void waitForLoading() {
        getWait().forVisibility(header);
        getWait().forClickable(continueButton);
        getWait().forClickable(cancelButton);
    }

    public void setPersonInformation(String firstName,String lastName,Integer postCode){
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postCodeInput.sendKeys(String.valueOf(postCode));
    }
    public void clickOnCheckoutButton(){
        continueButton.click();
    }

}
