package E2E;

import E2E.Pages.LoginPage;
import E2E.Pages.ProductsPage;
import E2E.Pages.YourCardPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddItemTest extends TestBase {
    LoginPage loginPage;
    ProductsPage productsPage;
    YourCardPage yourCardPage;

    @Test
    public void userCanAddItems() throws InterruptedException {
        String userName = "standard_user";
        String password = "secret_sauce";
        String filter = "Price (low to high)";


        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(userName, password);

        productsPage = new ProductsPage(app.driver);
        productsPage.waitForLoading();
        productsPage.filterDropdownButton();
        productsPage.selectByFilterName(filter);
        String actualFilter = productsPage.getFilterByName();
        Assert.assertEquals(actualFilter, filter);
        productsPage.addItem();
        List<WebElement> selectedItems = productsPage.getAddedItems();
        productsPage.openYourCardPage();

        yourCardPage = new YourCardPage(app.driver);
        yourCardPage.waitForLoading();
        List<WebElement> itemsInCard = yourCardPage.getItemsInCard();
        Assert.assertEquals(selectedItems.size(), itemsInCard.size());
        yourCardPage.ContinueShoppingButton();

        productsPage.waitForLoadingRemoveButton();
        productsPage.removeItem();


    }
}
