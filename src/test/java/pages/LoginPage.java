package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import steps.LoginSteps;


    public class LoginPage extends BaseTest {

        public LoginPage(WebDriver driver) {
           super(driver);
        }


        @FindBy(id="username")
        public WebElement usernameField;

        @FindBy(id="password")
        public WebElement passwordField;

        @FindBy(id="submit")
        public WebElement loginButton;


        public void login(String url,String username, String password) {

            driver.get(url);
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"))));
        }

        public void verifyTheLoginIsSuccessful() {
            WebElement successMessage = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
            if (successMessage.isDisplayed()) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed.");
            }
        }




}
