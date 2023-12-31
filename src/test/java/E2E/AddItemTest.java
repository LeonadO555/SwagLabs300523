package E2E;

import E2E.Pages.LoginPage;
import E2E.Pages.ProductsPage;
import E2E.Pages.YourCardPage;
import E2E.enums.ProductsInfoTabs;
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
        productsPage.takeScreenshotHeaderOnProductsPage();
        productsPage.filterDropdownButton();
        productsPage.selectByFilterName(filter);
        String actualFilter = productsPage.getFilterByName();
        Assert.assertEquals(actualFilter, filter);
        productsPage.addItem(ProductsInfoTabs.TEST_ALLTHETHINGS_T_SHIRT_RED);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_BACKPACK);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_BOLT_T_SHIRT);
        productsPage.takeScreenshotOnProductsPageAllProducts();
        List<WebElement> addedItems = productsPage.getAddedItems();
        productsPage.openYourCardPage();
        yourCardPage = new YourCardPage(app.driver);
        yourCardPage.waitForLoading();
        List<WebElement>itemsInCard = yourCardPage.getItemsInCard();
        Assert.assertEquals(addedItems.size(),itemsInCard.size());
        yourCardPage.takeScreenshotOnYourCardPage();
        yourCardPage.continueShoppingButton();
        productsPage.removeItem(ProductsInfoTabs.SAUCE_LABS_BOLT_T_SHIRT);
        productsPage.removeItem(ProductsInfoTabs.SAUCE_LABS_BACKPACK);
        productsPage.removeItem(ProductsInfoTabs.TEST_ALLTHETHINGS_T_SHIRT_RED);


    }
}
