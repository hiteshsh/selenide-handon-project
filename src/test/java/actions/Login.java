package actions;

import domain.User;
import utils.UserGenerator;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byId;


import static com.codeborne.selenide.Selenide.page;

/**
 * Created by hiteshs on 9/11/17.
 */
public class Login {

    public Home Login(){
        User user= UserGenerator.lastRegisteredUser;
        $(byId("login")).setValue(user.getUsername());
        $(byId("password")).setValue(user.getPassword());
        $(byXpath("//input[@value='Log in']")).click();
        return page(Home.class);
    }
}
