import e2e.TestBase;
import e2e.pages.InventoryPage;
import e2e.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class FirstSeleniumTest {
    public WebDriver driver;


    @Test
    public void firstSeleniumTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement emailInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        emailInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        WebElement burgerMenuButton = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
        burgerMenuButton.click();
        WebElement logOutButton = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
        logOutButton.click();

        /*WebElement emailInputProblemUser = driver.findElement(By.xpath("//input[@id='user-name']"));
        emailInput.sendKeys("problem_user");

        WebElement passwordInputProblemUser = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButtonProblemUser = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        WebElement burgerMenuButton1 = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
        burgerMenuButton.click();
        WebElement logOutButton1 = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
        logOutButton.click();

        WebElement emailInputPerformanceGlitchUser = driver.findElement(By.xpath("//input[@id='user-name']"));
        emailInput.sendKeys("performance_glitch_user");

        WebElement passwordInputPerformanceGlitchUser = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButtonPerformanceGlitchUser = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        WebElement burgerMenuButton2 = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
        burgerMenuButton.click();
        WebElement logOutButton2 = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
        logOutButton.click();

        WebElement emailInputErrorUser = driver.findElement(By.xpath("//input[@id='user-name']"));
        emailInput.sendKeys("error_user");

        WebElement passwordInputErrorUser = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButtonErrorUser = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        WebElement burgerMenuButton3 = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
        burgerMenuButton.click();
        WebElement logOutButton3 = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
        logOutButton.click();

        WebElement emailInputVisualUser = driver.findElement(By.xpath("//input[@id='user-name']"));
        emailInput.sendKeys("visual_user");

        WebElement passwordInputVisualUser = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButtonVisualUser = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        WebElement burgerMenuButton4 = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
        burgerMenuButton.click();
        WebElement logOutButton4 = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
        logOutButton.click();
        */
        driver.close();
        driver.quit();
    }
}
