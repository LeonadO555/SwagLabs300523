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
    @Test
    public void userCanLogin1(){
        String email = "problem_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }
    @Test
    public void userCanLogin2(){
        String email = "performance_glitch_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }
    @Test
    public void userCanLogin3(){
        String email = "error_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }
    @Test
    public void userCanLogin4(){
        String email = "visual_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }


}
