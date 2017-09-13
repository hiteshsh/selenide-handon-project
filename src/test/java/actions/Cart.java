package actions;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by hiteshs on 9/13/17.
 */
public class Cart {


    public Home checkout(){
        $(byXpath("//input[@value='Checkout Now!']")).click();
        return page(Home.class);
    }

    public Cart cartShouldHaveProduct(int total){
        $$(byXpath("//table/tbody/tr")).shouldHaveSize(total+2);
        return this;
    }

}
