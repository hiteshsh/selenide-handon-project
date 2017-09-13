package actions;

import com.codeborne.selenide.Condition;
import domain.User;
import utils.UserGenerator;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by hiteshs on 9/11/17.
 */
public class UserRegisteration {

    public Home registerAsNewUser(){

        User user= UserGenerator.getNewUser();
        $(byId("user_username")).setValue(user.getUsername());
        $(byId("user_email")).setValue(user.getEmailId());
        $(byId("user_password")).setValue(user.getPassword());
        $(byId("user_password_confirmation")).setValue(user.getPassword());
        $(byXpath("//input[@value='Sign up']")).click();

        return page(Home.class);

    }



}
