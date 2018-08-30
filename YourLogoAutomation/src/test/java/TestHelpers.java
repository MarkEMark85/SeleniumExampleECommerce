import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class TestHelpers extends Helpers{


    public boolean checkIfExists(WebDriver driver, By by) {
        try {
            driver.findElement(by);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return true;
    }
}
