package e2e;

import com.github.javafaker.Faker;
import e2e.pages.*;
import e2e.util.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserCanWorkWithProductsTest extends TestBase {
    LoginPage loginPage;

    ProductsPage productsPage;
    ProductsInfoPage productsInfoPage;
    YourCartInfoPage yourCartInfoPage;
    CheckoutYourInformationPage checkoutYourInformationPage;

    AddCheckoutYourInformationPage addCheckoutYourInformationPage;
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutCompletePage checkoutCompletePage;
    DataProviders dataProviders;

    Faker faker = new Faker();


    @Test(dataProvider = "loginData",dataProviderClass = DataProviders.class)
    public void userCanWorkWithContactTest(String email, String password) {

        String firstName = "Georgiy";
        String lastName = "Manolov";
        String postCode = "13581";




        // login as user " войти как пользователь "
        loginPage=new LoginPage(app.driver);
        loginPage.getWait();
        loginPage.login(email,password);

        productsPage = new ProductsPage(app.driver);
        productsPage.waitForOpen();
        productsPage.setAddProducts();



        productsInfoPage = new ProductsInfoPage(app.driver);
        productsInfoPage.waitForOpen();
        productsInfoPage.clickAddToCartButton();
        productsInfoPage.clickContainerButton();

        yourCartInfoPage = new YourCartInfoPage(app.driver);
        yourCartInfoPage.waitForOpen();
        yourCartInfoPage.clickCheckoutButton();

        addCheckoutYourInformationPage =new AddCheckoutYourInformationPage(app.driver);
        addCheckoutYourInformationPage.setFirstName(firstName);
        addCheckoutYourInformationPage.setLastNameInput(lastName);
        addCheckoutYourInformationPage.setPostCodeInput(postCode);
        addCheckoutYourInformationPage.clickContinueButton();

        checkoutOverviewPage = new CheckoutOverviewPage(app.driver);
        checkoutOverviewPage.clickFinishButton();

        checkoutCompletePage = new CheckoutCompletePage(app.driver);
        checkoutCompletePage.clickBackButton();

    }
}
