package e2e.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Describe locator
    @FindBy(xpath = "//*[@name='user-name']")
    WebElement userNameInput;

    @FindBy(xpath = "//*[@name='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//*[@id='login-button']")
    WebElement loginButton;

    public void waitForLoading(){
        getWait().forVisibility(userNameInput);
        getWait().forVisibility(passwordInput);
        getWait().forVisibility(loginButton);
    }

    public void takeLoginPageScreenshot(String actualScreenshotName){
        takeAndCompareScreenshot(actualScreenshotName, null);
    }

    //Describe methods
    public void login(String userName, String password){
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


}