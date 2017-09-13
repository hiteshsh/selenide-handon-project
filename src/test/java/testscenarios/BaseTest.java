package testscenarios;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.isChrome;
import static com.codeborne.selenide.WebDriverRunner.isMarionette;

/**
 * Created by hiteshs on 9/11/17.
 */
public abstract class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        Configuration.reportsFolder="build/reports/screenshots";
        setUpBrowser();
        open("http://demo.activeadmin.info/");
    }

    @AfterMethod
    public void teardown(){
        clearBrowserCookies();
    }

    private void setUpBrowser() {
        if(isChrome())

            System.setProperty("webdriver.chrome.driver", "./src/test/resources/webdrivers/chromedriver");

        else if(isMarionette())
            System.setProperty("webdriver.gecko.driver", "./src/test/resources/webdrivers/geckodriver");
    }
}
