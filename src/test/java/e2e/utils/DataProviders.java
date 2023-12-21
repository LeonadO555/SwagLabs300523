package e2e.utils;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    Faker faker = new Faker();


    @DataProvider
    public Iterator<Object[]> userCanLoginData() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"standard_user", "problem_user", "performance_glitch_user", "error_user", "visual_user", "with_valid_email"});
        list.add(new Object[]{"secret_sauce", faker.internet().uuid(), "with_valid_password"});
        //list.add(new Object[]{"213123", "234234", "with_invalid_data"});
        return list.iterator();
    }
}
