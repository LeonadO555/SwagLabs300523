package E2E;

import E2E.Pages.*;
import E2E.enums.ProductsInfoTabs;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserCanByAnyItems extends TestBase {
    LoginPage loginPage;
    ProductsPage productsPage;
    YourCardPage yourCardPage;
    YourInformation yourInformation;
    OverviewPage overviewPage;
    CompleteOrder completeOrder;
@Test
    public void userCanAddItems() throws InterruptedException {
        String userName = "standard_user";
        String password = "secret_sauce";
        String filter = "Price (low to high)";
        String firstName = "Oleksandr";
        String lastName = "Rashevchenko";
        Integer postCode = 12323;


        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(userName, password);

        productsPage = new ProductsPage(app.driver);
        productsPage.waitForLoading();
        productsPage.filterDropdownButton();
        productsPage.selectByFilterName(filter);
        String actualFilter = productsPage.getFilterByName();
        Assert.assertEquals(actualFilter, filter);
        productsPage.addItem(ProductsInfoTabs.TEST_ALLTHETHINGS_T_SHIRT_RED);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_BACKPACK);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_BOLT_T_SHIRT);
        List<WebElement> addedItems = productsPage.getAddedItems();
        productsPage.openYourCardPage();
        yourCardPage = new YourCardPage(app.driver);
        yourCardPage.waitForLoading();
        List<WebElement> itemsInCard = yourCardPage.getItemsInCard();
        Assert.assertEquals(addedItems.size(), itemsInCard.size());
        yourCardPage.checkout();

        yourInformation = new YourInformation(app.driver);
        yourInformation.waitForLoading();
        yourInformation.setPersonInformation(firstName,lastName,postCode);
        yourInformation.clickOnContinueButton();

        overviewPage = new OverviewPage(app.driver);
        overviewPage.waitForLoading();
        List<WebElement> itemsOnOverview = overviewPage.getProductCountOnOverviewPage();
        Assert.assertEquals(itemsInCard.size(),itemsOnOverview.size());
        overviewPage.clickOnFinishButton();

        completeOrder = new CompleteOrder(app.driver);
        completeOrder.waitForLoading();
        completeOrder.clickOnBackHomeButton();

        productsPage.waitForLoading();



    }
}