package e2e;

import e2e.Pages.LoginPage;
import e2e.utils.DataProviders;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    LoginPage loginPage;


    @Test(dataProvider = "userCanLogin", dataProviderClass = DataProviders.class)
        public void userCanLoginWithAllUsernames(String email, String password){
        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(email, password);


    }

}
