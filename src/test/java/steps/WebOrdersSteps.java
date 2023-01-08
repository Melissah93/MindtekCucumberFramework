package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.WebOrdersLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WebOrdersSteps {

    WebDriver driver = Driver.getDriver(); // create this driver on class level to call all methods below
    WebOrdersLoginPage webOrdersLoginPage = new WebOrdersLoginPage();
    @Given("user navigates to WebOrders application")
    public void user_navigates_to_web_orders_application() {
      driver.get(ConfigReader.getProperty("WebOrdersURL"));
    }

    @When("user enters username {string} and password {string} and clicks on login button")
                                                                                    // string comes from feature file
    public void user_enters_username_and_password_and_clicks_on_login_button(String username, String password) {
        webOrdersLoginPage.username.sendKeys(username);  //use this object to fetch webelements
        webOrdersLoginPage.password.sendKeys(password);
        webOrdersLoginPage.loginButton.click();

    }
    @Then("user validates application is logged in")
    public void user_validates_application_is_logged_in() {
        String expectedTitle = "Web Orders";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);


    }

}
