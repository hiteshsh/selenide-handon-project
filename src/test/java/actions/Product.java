package actions;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by hiteshs on 9/13/17.
 */
public class Product {

    public Cart addToCart(){
        $(byXpath("//a[contains(text(),'Add to Card')]")).click();
        return page(Cart.class);
    }
}
