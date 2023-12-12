package e2e;


import e2e.pages.LoginPage;
import e2e.utils.DataProviders;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;



    @Test
    public void userCanLogin() {
        String email = "standard_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }

    @Test


    public void userCannotLoginWithInvalidEmail() {

        String userName = "standarduser";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(userName, password);
        loginPage.waitForLoading();
    }

    @Test(dataProvider = "invalidLoginData", dataProviderClass = DataProviders.class)
    public void userCannotWithInvalidPassword(String email,String password) {


        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);
        loginPage.waitForLoading();
    }
}
