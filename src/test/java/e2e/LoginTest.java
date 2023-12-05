package e2e;


import e2e.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage LoginPage;

    @Test
    public void userCanLogin() {
        String email = "standard_user";
        String password = "secret_sauce";

        LoginPage = new LoginPage(app.driver);

        String userName = new String();

        LoginPage.login(userName, password);
        LoginPage.waitForLoading();
    }

    @Test
    public void userCannotLoginWithInvalidEmail() {

        String email = "standarduser";
        String password = "secret_sauce";

        LoginPage = new LoginPage(app.driver);
        LoginPage.login(email, password);
        LoginPage.waitForLoading();
    }
}
