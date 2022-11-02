package Steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
    public static WebDriver driver;
    @Before
    public void beforescenario(){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(desiredCapabilities);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/");
    }

    @After
    public void afterscenario(){
        if (driver != null) {
            driver.quit();
        }
    }

}
