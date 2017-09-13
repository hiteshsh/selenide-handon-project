package utils;

import com.github.javafaker.Faker;
import domain.User;

import java.util.Locale;

/**
 * Created by hiteshs on 9/11/17.
 */
public class UserGenerator {
    public static User lastRegisteredUser;
    public static Faker faker;

    public static User getNewUser(){
        initialize();
        String password=faker.internet().password(6,10);
        lastRegisteredUser.setUsername(faker.name().firstName()+faker.number().numberBetween(1,9));
        lastRegisteredUser.setEmailId(faker.internet().safeEmailAddress());
        lastRegisteredUser.setPassword(password);
        return lastRegisteredUser;
    }

    public static void initialize(){
        lastRegisteredUser=new User();
        faker= new Faker(new Locale("in-ID"));
    };
}
