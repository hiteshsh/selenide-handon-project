package testscenarios;

import actions.Home;
import actions.UserRegisteration;
import org.testng.annotations.Test;

/**
 * Created by hiteshs on 9/11/17.
 */
public class RegistrationTest extends BaseTest{

    @Test
    public void userCanSignUp(){
        Home home=new Home();
        home.navigateToSignupPage().registerAsNewUser()
                .userShouldGetRegistered()
        .logout().userShouldGetLogOut();

    }
}
