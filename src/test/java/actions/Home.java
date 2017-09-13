package actions;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by hiteshs on 9/13/17.
 */
public class Home {

    public UserRegisteration navigateToSignupPage(){
        $(byXpath("//a[contains(text(),'Sign up')]")).click();
        return page(UserRegisteration.class);
    }

    public Home logout(){
        $(byXpath("//a[contains(text(),'Log out')]")).click();
        return this;
    }

    public Product selectProduct(String productName){
        $(byXpath("//a[contains(text(),'"+productName+"')]")).click();
        return page(Product.class);
    }
    public Home userShouldGetRegistered(){
        validateFlashMessage("Thank you for signing up! You are now logged in.");
        return this;
    }
    public Home orderShouldGetSuccesfullyPlaced(){
        validateFlashMessage("Thank you for your purchase! We will ship it shortly!");
        return this;
    }
    private void validateFlashMessage(String msg){
        $$(byId("flash_notice")).get(1).shouldHave(Condition.text(msg));
    }

    public Home userShouldGetLogOut() {
        validateFlashMessage("You have been logged out.");
        return this;
    }

    public Login navigateToLogin(){
        $(byXpath("//a[contains(text(),'Log in')]")).click();
        return page(Login.class);
    }

    public Home userShouldGetSuccesfullyLogIn(){
        validateFlashMessage("Logged in successfully");
        return this;
    }
}
