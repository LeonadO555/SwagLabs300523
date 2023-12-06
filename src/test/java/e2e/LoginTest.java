package e2e;

import e2e.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    @Test
    public void userCanLogin(){
        String email = "standard_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }


}
