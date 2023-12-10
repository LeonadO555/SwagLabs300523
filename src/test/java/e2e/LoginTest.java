package e2e;

import e2e.pages.LoginPage;
import e2e.util.DataProviders;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    @Test(dataProvider = "userCanLogin",dataProviderClass = DataProviders.class)
    public void userCanLogin(String email, String password){
       // String email = "standard_user";
       // String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }
    @Test
    public void problemUserCanLogin(){
        String email = "problem_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }
    @Test
    public void performanceGlitchUserCanLogin(){
        String email = "performance_glitch_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }
    @Test
    public void errorUserCanLogin(){
        String email = "error_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }
    @Test
    public void visualUserCanLogin4(){
        String email = "visual_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);

    }


}