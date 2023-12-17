package e2e;

import com.github.javafaker.Faker;
import e2e.pages.*;
import e2e.util.DataProviders;
import org.testng.annotations.Test;

public class UserCanWorkWithProductsTest extends TestBase {
    LoginPage loginPage;
    ProductsInfoPage productsInfoPage;


    DeleteProducts deleteProducts;

    DataProviders dataProviders;

    Faker faker = new Faker();

    @Test(dataProvider = "loginData",dataProviderClass = DataProviders.class)
    public void userCanWorkWithContactTest(String email, String password) {

        // login as user " войти как пользователь "
        loginPage=new LoginPage(app.driver);
        loginPage.getWait();
        loginPage.login(email,password);

    }
}
