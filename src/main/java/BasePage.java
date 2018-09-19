import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class BasePage {

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

    public void hoverAndClick(By hover, By click) {
        driver = getDriver();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(hover));
        action.perform();
        action.click();
        loadWait(1);
        driver.findElement(click).click();

    }

    public void loadWait(int waitTime) {
        try {
            TimeUnit.SECONDS.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean checkIfExists(By by) {
        try {
            driver = getDriver();
            driver.findElement(by);
        } catch (NoSuchElementException ex) {
            System.out.print("expected to find " + by + " and could not");
            return false;
        }
        return true;
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