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

        WebElement emailInput = driver.findElement(By.xpath("//*[@name='user-name']"));
        emailInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.xpath("//*[@name='password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//*[@name='login-button']"));
        loginButton.click();

        WebElement burgerMenuButton = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
        burgerMenuButton.click();

        WebElement logOutButton = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
        logOutButton.click();

        driver.close();
        driver.quit();
    }
}
