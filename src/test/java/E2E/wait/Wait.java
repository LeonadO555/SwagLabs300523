package E2E.wait;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Wait {
    public WebDriver driver;
    public WebDriverWait wait;

    Duration TIMEOUT = Duration.ofSeconds(30);
    public Wait(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait setWait() {
        wait = new WebDriverWait(driver, TIMEOUT);
        return wait;
    }
    public void forVisibility(WebElement element){
        try {
            setWait().until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e){
            throw new TimeoutException(element.getAccessibleName()+" is not visible more than "+ TIMEOUT.toString());
        }
    }
    public void forAllVisibility(List<WebElement> elements){
        try {
            setWait().until(ExpectedConditions.visibilityOfAllElements(elements));
        } catch (TimeoutException e){
            throw new TimeoutException(elements.size()+" is not visible more than "+ TIMEOUT.toString());
        }
    }
    public void forInvisibility(WebElement element){
        try {
            setWait().until(ExpectedConditions.invisibilityOf(element));
        } catch (TimeoutException e){
            throw new TimeoutException(element.getAccessibleName()+" is visible more than "+ TIMEOUT.toString());
        }
    }
    public void forClickable(WebElement element){
        try {
            setWait().until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException e){
            throw new TimeoutException(element.getAccessibleName()+" is not clickable more than "+ TIMEOUT.toString());
        }
    }

}
