package E2E.untils;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DataProviders {
    Faker faker = new Faker();

    @DataProvider
    public Iterator<Object[]>validLoginData(){
        List<Object[]>list=new ArrayList<>();
        list.add(new Object[]{"standard_user","secret_sauce"});
       // list.add(new Object[]{"locked_out_user","secret_sauce"});
       // list.add(new Object[]{"problem_user","secret_sauce"});
       // list.add(new Object[]{"performance_glitch_user","secret_sauce"});
        //list.add(new Object[]{"error_user","secret_sauce"});
        //list.add(new Object[]{"visual_user","secret_sauce"});
        return list.iterator();
    }
    @DataProvider
    public Iterator<Object[]>invalidUserNameData(){
        List<Object[]>list=new ArrayList<>();
        list.add(new Object[]{faker.name().username(),"secret_sauce"});
        list.add(new Object[]{faker.name().username(),"secret_sauce"});
        list.add(new Object[]{faker.name().username(),"secret_sauce"});
        list.add(new Object[]{faker.name().username(),"secret_sauce"});
        list.add(new Object[]{faker.name().username(),"secret_sauce"});
        list.add(new Object[]{faker.name().username(),"secret_sauce"});
        return list.iterator();
    }
    @DataProvider
    public Iterator<Object[]>invalidPasswordData(){
        List<Object[]>list=new ArrayList<>();
        list.add(new Object[]{"standard_user",faker.random().hex()});
        list.add(new Object[]{"locked_out_user",faker.random().hex()});
        list.add(new Object[]{"problem_user",faker.random().hex()});
        list.add(new Object[]{"performance_glitch_user",faker.random().hex()});
        list.add(new Object[]{"error_user",faker.random().hex()});
        list.add(new Object[]{"visual_user",faker.random().hex()});
        return list.iterator();
    }
}
