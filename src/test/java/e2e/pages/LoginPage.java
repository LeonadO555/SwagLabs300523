package e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@name='user-name']")
    WebElement userNameInput;
    @FindBy(xpath = "//*[@name='password']")
    WebElement passwordInput;
    @FindBy(xpath = "//*[@name='login-button']")
    public WebElement loginButton;

    public void waitForLoading() {
        getWait().forVisibility(userNameInput);
        getWait().forVisibility(passwordInput);
        getWait().forVisibility(loginButton);
    }



    public void login(String userName, String password) {
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}

