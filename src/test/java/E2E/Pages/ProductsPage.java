package E2E.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="//*[@class='app_logo']")
    WebElement header;
    @FindBy(xpath = "//*[@data-test='product_sort_container']")
    WebElement filterByName;
    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    WebElement cardButton;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addSauceLabsBackpack;
    @FindBy(xpath = "//*[@id='remove-sauce-labs-backpack']")
    WebElement removeSauceLabsBackpack;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement addSauceLabsBikeLight;
    @FindBy(xpath = "//*[@id='remove-sauce-labs-bike-light']")
    WebElement removeSauceLabsBikeLight;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement addSauceLabsBoltT_Shirt;
    @FindBy(xpath = "//*[@id='remove-sauce-labs-bolt-t-shirt']")
    WebElement removeSauceLabsBoltT_Shirt;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement addSauceLabsFleeceJacket;
    @FindBy(xpath = "//*[@id='remove-sauce-labs-fleece-jacket']")
    WebElement removeSauceLabsFleeceJacket;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-onesie']")
    WebElement addSauceLabsOnesie;
    @FindBy(xpath = "//*[@id='remove-sauce-labs-onesie']")
    WebElement removeSauceLabsOnesie;
    @FindBy(xpath = "//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    WebElement addTest_allTheThings_T_Shirt_Red;
    @FindBy(xpath = "//*[@id='remove-test.allthethings()-t-shirt-(red)']")
    WebElement removeTest_allTheThings_T_Shirt_Red;
    public void waitForLoading() {
        getWait().forVisibility(header);
        getWait().forVisibility(filterByName);
        getWait().forVisibility(addSauceLabsBackpack);
        getWait().forVisibility(addSauceLabsBikeLight);
        getWait().forVisibility(addSauceLabsBoltT_Shirt);
        getWait().forVisibility(addTest_allTheThings_T_Shirt_Red);
        getWait().forVisibility(addSauceLabsOnesie);
        getWait().forVisibility(addSauceLabsFleeceJacket);
        getWait().forClickable(cardButton);
    }
    public void waitForLoadingRemoveButton(){
        getWait().forVisibility(removeSauceLabsBackpack);
        getWait().forVisibility(removeSauceLabsBikeLight);
        getWait().forVisibility(removeSauceLabsBoltT_Shirt);
        getWait().forVisibility(removeSauceLabsOnesie);
        getWait().forVisibility(removeTest_allTheThings_T_Shirt_Red);
        getWait().forVisibility(removeSauceLabsFleeceJacket);
    }
    public List<WebElement> getAddedItems(){
        return driver.findElements(By.xpath("//button[text()='Remove']"));
    }

    public int getProductCount(){
        return driver.findElements(By.xpath("//*[@id='inventory_container']//*[@class='inventory_item']")).size();
    }
    public void filterDropdownButton(){
        filterByName.click();
    }
    public void selectByFilterName(String name){
        getSelect(filterByName).selectByVisibleText(name);
    }
    public String getFilterByName() {
        return getSelect(filterByName).getFirstSelectedOption().getText();
    }
    public YourCardPage openYourCardPageDialog(){
        cardButton.click();
        return new YourCardPage(driver);
    }
    public void addItem() throws InterruptedException {
        addSauceLabsBackpack.click();
        Thread.sleep(1000);
        addSauceLabsBikeLight.click();
        Thread.sleep(1000);
        addSauceLabsBoltT_Shirt.click();
        Thread.sleep(1000);
        addSauceLabsFleeceJacket.click();
        Thread.sleep(1000);
        addSauceLabsOnesie.click();
        Thread.sleep(1000);
        addTest_allTheThings_T_Shirt_Red.click();
        Thread.sleep(1000);
    }
    public void removeItem() throws InterruptedException {
        removeSauceLabsOnesie.click();
        Thread.sleep(1000);
        removeTest_allTheThings_T_Shirt_Red.click();
        Thread.sleep(1000);
        removeSauceLabsBackpack.click();
        Thread.sleep(1000);
        removeSauceLabsBikeLight.click();
        Thread.sleep(1000);
        removeSauceLabsBoltT_Shirt.click();
        Thread.sleep(1000);
        removeSauceLabsFleeceJacket.click();
        Thread.sleep(1000);
    }
}
