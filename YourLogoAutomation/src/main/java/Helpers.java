import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Helpers {

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mark\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
    @AfterMethod(alwaysRun = true)
    public void cleanUpMethod() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        driver = null;
    }
}