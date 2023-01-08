//package utilities;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//public class TestBase {
//
//    protected WebDriver driver; //protected or public will allow you to access the driver
//
//
//    @BeforeMethod (groups = {"regression", "smoke"})
//    public void setup(){
//      driver = Driver.getDriver();
//    }
//
//    @AfterMethod (groups = {"regression", "smoke"})
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.quit();
//
//    }
//}
