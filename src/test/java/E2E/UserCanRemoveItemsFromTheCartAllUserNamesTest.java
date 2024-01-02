package E2E;

import E2E.Pages.LoginPage;
import E2E.Pages.ProductsPage;
import E2E.Pages.YourCardPage;
import E2E.enums.ProductsInfoTabs;
import E2E.untils.DataProviders;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserCanRemoveItemsFromTheCartAllUserNamesTest extends TestBase{
    LoginPage loginPage;
    ProductsPage productsPage;
    YourCardPage yourCardPage;
    @Test(dataProvider = "validLoginData",dataProviderClass = DataProviders.class)
    public void userCanLogin(String email,String password){

        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(email,password);

        productsPage = new ProductsPage(app.driver);
        productsPage.waitForLoadingWithItems();
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_BOLT_T_SHIRT);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_ONESIE);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_BIKE_LIGHT);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_FLEECE_JACKET);
        productsPage.takeScreenshotOnProductsPageSelectedProducts4();

        productsPage.openYourCardPage();
        yourCardPage = new YourCardPage(app.driver);
        yourCardPage.waitForLoading();
        yourCardPage.takeScreenshotOnYourCardPage4();
        yourCardPage.removeItemInYourCard(ProductsInfoTabs.SAUCE_LABS_ONESIE);
        yourCardPage.removeItemInYourCard(ProductsInfoTabs.SAUCE_LABS_BOLT_T_SHIRT);
        yourCardPage.removeItemInYourCard(ProductsInfoTabs.SAUCE_LABS_BIKE_LIGHT);
        yourCardPage.removeItemInYourCard(ProductsInfoTabs.SAUCE_LABS_FLEECE_JACKET);
        yourCardPage.continueShoppingButton();
        productsPage.waitForLoading();
        productsPage.takeScreenshotOnProductsPageNotSelectedProducts();
        List<WebElement> finalItems = productsPage.getAddedItems();
        Assert.assertEquals(finalItems.size(), 0, "Expected zero items after removal, but found: " + finalItems.size());


    }
}
