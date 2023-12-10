
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

    Duration TIMEOUT = Duration.ofSeconds(10);


    public Wait(WebDriver driver){
        this.driver = driver;

    }

    public  WebDriverWait setWait(){
        return wait = new WebDriverWait(driver, TIMEOUT);

    }

    public void forVisibility(WebElement element){ // проверяет видимость элементов
        //обработчик ошибок
        try {
            setWait().until(ExpectedConditions.visibilityOf(element)); // пробуйет дождаться
        }catch (TimeoutException e){ // ловит конкретную ошибку TimeoutExeption
            //e.printStackTrace(); // просто покажет ошибку но не свалит тест
            throw new TimeoutException(element.getAccessibleName() + " is not visible more than " + TIMEOUT.toString());
        }
    }
    public void forAllVisibility(List<WebElement> elements){ // проверяет видимость элементов
        //обработчик ошибок
        try {
            setWait().until(ExpectedConditions.visibilityOfAllElements(elements)); // пробуйет дождаться
        }catch (TimeoutException e){ // ловит конкретную ошибку TimeoutExeption
            // e.printStackTrace(); // просто покажет ошибку но не свалит тест
            throw new TimeoutException(elements.size() + " are not visible more than " + TIMEOUT.toString());
        }
    }

    public void forInvisibility(WebElement element){
        try {
            setWait().until(ExpectedConditions.invisibilityOf(element)); //
        }catch (TimeoutException e){
            //e.printStackTrace();
            throw new TimeoutException(element.getAccessibleName() + " is visible more than " + TIMEOUT.toString());
        }
    }

    public void forClickable(WebElement element){ //  элемент кликабельный
        //обработчик ошибок
        try {
            setWait().until(ExpectedConditions.elementToBeClickable(element)); //
        }catch (TimeoutException e){
            // e.printStackTrace();
            throw new TimeoutException(element.getAccessibleName() + " is not clickable more than " + TIMEOUT.toString());
        }
    }
}

