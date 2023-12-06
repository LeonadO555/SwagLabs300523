package e2e;


import e2e.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage LoginPage;

    @Test
    public void userCanLoginWithValidStandardUserName() {
        String userName = "standard_user";
        String password = "secret_sauce";

        LoginPage = new LoginPage(app.driver);
        LoginPage.login(userName, password);
        LoginPage.waitForLoading();
    }

    @Test
    public void userCannotLoginWithInvalidName() {

        String userName = "standarduser";
        String password = "secret_sauce";

        LoginPage = new LoginPage(app.driver);
        LoginPage.login(userName, password);
        LoginPage.waitForLoading();
    }

    @Test
    public void userCanLoginWithValidLockedOutUserName() {

        String userName = "locked_out_user";
        String password = "secret_sauce";

        LoginPage = new LoginPage(app.driver);
        LoginPage.login(userName, password);
        LoginPage.waitForLoading();
    }

    @Test
    public void userCanLoginWithValidProblemUserName() {

        String userName = "problem_user";
        String password = "secret_sauce";

        LoginPage = new LoginPage(app.driver);
        LoginPage.login(userName, password);
        LoginPage.waitForLoading();
    }

    @Test
    public void userCanLoginWithValidPerformanceGlitchUserName() {

        String userName = "performance_glitch_user";
        String password = "secret_sauce";

        LoginPage = new LoginPage(app.driver);
        LoginPage.login(userName, password);
        LoginPage.waitForLoading();
    }

    @Test
    public void userCanLoginWithValidErrorUserName() {

        String userName = "error_user";
        String password = "secret_sauce";

        LoginPage = new LoginPage(app.driver);
        LoginPage.login(userName, password);
        LoginPage.waitForLoading();
    }

    @Test
    public void userCanLoginWithValidVisualUserName() {

        String userName = "visual_user";
        String password = "secret_sauce";

        LoginPage = new LoginPage(app.driver);
        LoginPage.login(userName, password);
        LoginPage.waitForLoading();
    }
}
