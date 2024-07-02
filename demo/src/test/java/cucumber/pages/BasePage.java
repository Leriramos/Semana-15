package cucumber.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    protected WebDriver driver;

    public void initializeDriver() {
        if(driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts()
             .implicitlyWait(Duration.ofSeconds(2))
             .pageLoadTimeout(Duration.ofSeconds(10));

        }

    }
    public void openUrl(String url) {
        driver.get(url);
    }
}
