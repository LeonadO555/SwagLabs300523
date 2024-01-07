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
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutCompletePage checkoutCompletePage;
    DataProviders dataProviders;

    Faker faker = new Faker();

    private void checkYourData(CheckoutYourInformationPage page,String firstName, String lastName, String postCode){
        String actualFirstName = page.getFirstName();
        String actualLastName = page.getLastName();
        String actualPostCode = page.getPostCode();
        Assert.assertEquals(actualFirstName, firstName, actualFirstName + "is not equal " + firstName);
        Assert.assertEquals(actualLastName, lastName, actualLastName + "is not equal " + lastName);
        Assert.assertEquals(actualPostCode, postCode, actualPostCode + "is not equal " + postCode);

    }

    @Test(dataProvider = "loginData",dataProviderClass = DataProviders.class)
    public void userCanWorkWithContactTest(String email, String password) {

        // login as user " войти как пользователь "
        loginPage=new LoginPage(app.driver);
        loginPage.getWait();
        loginPage.login(email,password);

        String firstName = "Georgiy";
        String lastName = "Manolov";
        String postCode = "13581";


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


        checkoutYourInformationPage = new CheckoutYourInformationPage(app.driver);
        checkoutYourInformationPage.waitForLoading();
        checkoutYourInformationPage.getLastName();
        checkoutYourInformationPage.getFirstName();
        checkoutYourInformationPage.getPostCode();
        checkYourData(checkoutYourInformationPage, firstName, lastName, postCode);





        yourCartInfoPage = new YourCartInfoPage(app.driver);
        checkoutYourInformationPage = new CheckoutYourInformationPage(app.driver);
        checkoutOverviewPage = new CheckoutOverviewPage(app.driver);
        checkoutCompletePage = new CheckoutCompletePage(app.driver);


        checkYourData(checkoutYourInformationPage, firstName, lastName, postCode);

    }
}
