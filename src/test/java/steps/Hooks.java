package steps;

import io.cucumber.java.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    WebDriver driver = Driver.getDriver();

    @Before
    public void setUp(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        System.out.println("Method runs before scenario");

    }

    @After
    public void tearDown(){
        driver.quit();
        System.out.println("Method runs after scenario");

    }
}
