package E2E;

import E2E.Pages.LoginPage;
import E2E.Pages.ProductsPage;
import E2E.untils.DataProviders;
import org.testng.annotations.Test;

public class AuthorizationTest extends TestBase{
    LoginPage loginPage;
    ProductsPage productsPage;
@Test(dataProvider = "validLoginData",dataProviderClass = DataProviders.class)
    public void userCanLogin(String email,String password){

        loginPage = new LoginPage(app.driver);
        loginPage.login(email,password);

        productsPage = new ProductsPage(app.driver);
        productsPage.waitForLoading();

    }
    @Test(dataProvider = "invalidUserNameData",dataProviderClass = DataProviders.class)
    public void userCanNotLoginWithInvalidUserName(String email,String password){

        loginPage = new LoginPage(app.driver);
        loginPage.login(email,password);

        productsPage = new ProductsPage(app.driver);
        productsPage.waitForLoading();

    }
    @Test(dataProvider = "invalidPasswordData",dataProviderClass = DataProviders.class)
    public void userCanNotLoginWithInvalidPassword(String email,String password){

        loginPage = new LoginPage(app.driver);
        loginPage.login(email,password);

        productsPage = new ProductsPage(app.driver);
        productsPage.waitForLoading();

    }
}
