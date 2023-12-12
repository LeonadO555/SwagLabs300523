package e2e;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
    protected static ApplicationManager app = new ApplicationManager();
    @BeforeMethod
    public void setAppTest(){app.init();}
    @AfterMethod
    public void tearDown(){
        app.stop();
    }
}
