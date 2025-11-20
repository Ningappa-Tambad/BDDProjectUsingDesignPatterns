package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected WebDriver  driver;
    protected WebDriverWait wait;

    public BaseTest(WebDriver driver) {
        this.driver = driver;
         wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
        // Initialize WebDriverWait or other common setup here

    }

}
