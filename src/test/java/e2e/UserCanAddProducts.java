package e2e;

import e2e.Pages.CartPage;
import e2e.Pages.LoginPage;
import e2e.Pages.ProductsPage;
import org.testng.annotations.Test;

public class UserCanAddProducts extends TestBase {
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;

    @Test
    public void userCanLogin() {
        String login = "standard_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(login, password);

        productsPage = new ProductsPage(app.driver);
        productsPage.waitForLoading();
        productsPage.addProduct();
        productsPage.checkCart();

        cartPage = new CartPage(app.driver);
        cartPage.waitForLoading();
        cartPage.deleteProduct();
        cartPage.checkout();


    }
}
