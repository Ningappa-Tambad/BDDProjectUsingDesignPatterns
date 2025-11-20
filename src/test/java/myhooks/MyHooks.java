
package myhooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import utils.ConfigReader;

public class MyHooks {
    public static WebDriver driver;



    @Before
    public void setUp() {


        String url= ConfigReader.getProperty("app.url");
        String username= ConfigReader.getProperty("app.username");
        String password= ConfigReader.getProperty("app.password");
       driver= DriverFactory.initilizeWebDriver(System.getProperty("browser", "chrome"));


       //navigate to url
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login(url,username,password);

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}