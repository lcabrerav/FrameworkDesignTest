package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @BeforeMethod
    public void setUp(){

        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver 2", "/Users/luiscabrera/Documents/Framework/Generic/BrowserDriver/geckodriver 2");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }



    @AfterMethod
    public void clean(){

        driver.close();
    }


}
