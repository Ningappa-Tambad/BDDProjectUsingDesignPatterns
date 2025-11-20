package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import myhooks.MyHooks;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import testcontext.TestContext;

public class LoginSteps {

    private WebDriver driver;

private LoginPage loginPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions

     loginPage=new LoginPage(MyHooks.driver);
     loginPage.verifyTheLoginIsSuccessful();
    }



}
