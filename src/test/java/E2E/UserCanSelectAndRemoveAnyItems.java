package E2E;

import E2E.Pages.LoginPage;
import E2E.Pages.ProductsPage;
import E2E.enums.ProductsInfoTabs;
import E2E.untils.DataProviders;
import org.testng.annotations.Test;

public class UserCanSelectAndRemoveAnyItems extends TestBase{
    LoginPage loginPage;
    ProductsPage productsPage;

    @Test(dataProvider = "validLoginData",dataProviderClass = DataProviders.class)
    public void userCanSelectAndRemoveAnyItemsTest(String email,String password){
        String filter = "Price (low to high)";
        loginPage=new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(email, password);
        productsPage = new ProductsPage(app.driver);
        productsPage.waitForLoading();
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_BOLT_T_SHIRT);
        productsPage.addItem(ProductsInfoTabs.TEST_ALLTHETHINGS_T_SHIRT_RED);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_BACKPACK);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_BIKE_LIGHT);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_ONESIE);
        productsPage.addItem(ProductsInfoTabs.SAUCE_LABS_FLEECE_JACKET);

        productsPage.removeItem(ProductsInfoTabs.SAUCE_LABS_BOLT_T_SHIRT);
        productsPage.removeItem(ProductsInfoTabs.TEST_ALLTHETHINGS_T_SHIRT_RED);
        productsPage.removeItem(ProductsInfoTabs.SAUCE_LABS_BACKPACK);
        productsPage.removeItem(ProductsInfoTabs.SAUCE_LABS_BIKE_LIGHT);
        productsPage.removeItem(ProductsInfoTabs.SAUCE_LABS_ONESIE);
        productsPage.removeItem(ProductsInfoTabs.SAUCE_LABS_FLEECE_JACKET);


    }

}
