package testscenarios;

import actions.Home;
import org.testng.annotations.Test;

/**
 * Created by hiteshs on 9/13/17.
 */
public class LoginTest extends BaseTest{

    @Test
    public void userCanLogin(){
        Home home=new Home();
        home.navigateToSignupPage().registerAsNewUser()
                .userShouldGetRegistered()
                .logout().userShouldGetLogOut()
                .navigateToLogin().Login()
                .userShouldGetSuccesfullyLogIn();

    }
}
