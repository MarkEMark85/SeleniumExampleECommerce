import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Helpers {
    WebDriver driver;

    private By signInButton = By.linkText("Sign in");

    public void navigateToPage(){
        driver = getDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    public AutenticationPage clickSignInButton(){
        driver = getDriver();
        driver.findElement(signInButton).click();
        return new AutenticationPage();
    }


}
