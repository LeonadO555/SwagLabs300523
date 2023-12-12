package e2e;


import e2e.pages.LoginPage;
import e2e.utils.DataProviders;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;



    @Test
    public void userCanLogin() {
        String userName = "standard_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(userName, password);

    }

    @Test


    public void userCannotLoginWithInvalidEmail() {

        String userName = "standarduser";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(userName, password);
        loginPage.waitForLoading();
    }

    @Test(dataProvider = "validLoginData", dataProviderClass = DataProviders.class)
    public void userCanLoginWithValidData(String userName,String password) {

        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(userName, password);

    }
}
