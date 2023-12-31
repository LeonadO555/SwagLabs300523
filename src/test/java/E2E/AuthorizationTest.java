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
        loginPage.waitForLoading();
        loginPage.login(email,password);
        productsPage = new ProductsPage(app.driver);
        productsPage.waitForLoading();


    }
    @Test(dataProvider = "invalidUserNameData",dataProviderClass = DataProviders.class)
    public void userCanNotLoginWithInvalidUserName(String email,String password){
        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(email,password);
    }
    @Test(dataProvider = "invalidPasswordData",dataProviderClass = DataProviders.class)
    public void userCanNotLoginWithInvalidPassword(String email,String password){
        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(email,password);
    }

    private void loginTestMethod(String email ,String password, String screenshotName,boolean typeOfCase) {
        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(email, password);
        if (typeOfCase) {
            loginPage.waitForLoading();
            loginPage.takeLoginPageScreenshot(screenshotName);
        } else {
            productsPage = new ProductsPage(app.driver);
            productsPage.waitForLoading();
            productsPage.takeScreenshotHeaderOnProductsPage();
        }
    }
    @Test
    public void userCanLoginWithValidData(){
        loginTestMethod("standard_user","secret_sauce",null,false);
    }
    @Test
    public void userCanLoginWithInValidEmail(){
        loginTestMethod("standard_userrr","secret_sauce",null,true);
    }
    @Test
    public void userCanLoginWithInValidPassword(){
        loginTestMethod("standard_userrr","secret_33sauce",null,true);
    }
    @Test
    public void userCanLoginWithInValidEmailAndPassword(){
        loginTestMethod("standard_userrr","sdsdecret_sauce",null,true);
    }


}
