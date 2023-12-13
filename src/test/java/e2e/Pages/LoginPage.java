package e2e.Pages;

import e2e.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[@id='user-name']")
    WebElement emailInput;

    @FindBy (xpath = "//*[@id='password']")
    WebElement passwordInput;

    @FindBy (xpath = "//*[@id='login-button']")
    WebElement loginButton;

    public void waitForLoading(){
        getWait().forVisibility(emailInput);
        getWait().forVisibility(passwordInput);
        getWait().forVisibility(loginButton);
    }
    public void login(String email,String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();

    }

}
