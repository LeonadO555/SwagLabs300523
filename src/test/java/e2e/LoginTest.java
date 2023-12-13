package e2e;

import e2e.pages.LoginPage;
import e2e.util.DataProviders;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    @Test(dataProvider = "loginValidData",dataProviderClass = DataProviders.class)
    public void userCanLogin(String email, String password){


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
    public void visualUserCanLogin(){
        String email = "visual_user";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);


    }
    @Test(dataProvider = "loginNotValidData",dataProviderClass = DataProviders.class)
    public void userCannotLoginWithInvalidPassword(String email,String password){

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);
       
    }

    @Test
    public void userCannotLoginWithInvalidLogin(){
        String email = "rrr";
        String password = "secret_sauce";

        loginPage = new LoginPage(app.driver);
        loginPage.login(email, password);
        loginPage.waitForLoading();
    }
}
