package testscenarios;

import actions.Home;
import org.testng.annotations.Test;

/**
 * Created by hiteshs on 9/13/17.
 */
public class PlaceOrderTest extends BaseTest{

    @Test
    public void userCanPlaceOrder(){
        Home home=new Home();
        home.navigateToSignupPage().registerAsNewUser()
                .userShouldGetRegistered()
                .selectProduct("The Ruby Programming Language")
                .addToCart().cartShouldHaveProduct(1)
                .checkout().orderShouldGetSuccesfullyPlaced()
                .logout().userShouldGetLogOut();
    }

}
