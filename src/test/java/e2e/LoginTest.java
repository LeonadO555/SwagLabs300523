package e2e;

import e2e.pages.LoginPage;
import org.testng.annotations.Test;
import utils.DataProviders;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    @Test
    public void standartUserCanLogin(){
        String email = "standard_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }
    @Test(dataProvider = "dataForLogin",dataProviderClass = DataProviders.class)
    public void userCanLogin(String userName, String password){
        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(userName,password );
    }
}
