import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    WebDriver driver;

    private By signInButton = By.linkText("Sign in");
    private By women = By.xpath("//a[@title='Women']");
    private By blouses = By.xpath("//a[@title='Blouses']");
    private By dresses = By.xpath("//a[@title='Dresses']");
    private By casualDresses = By.xpath("//a[@title='Casual Dresses']");


    public void navigateToPage() {
        driver = getDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    public AuthenticationPage clickSignInButton() {
        driver = getDriver();
        driver.findElement(signInButton).click();
        return new AuthenticationPage();
    }

    public GeneralBlousePage clickBlouse() {
        driver = getDriver();
        hoverAndClick(women, blouses);
        return new GeneralBlousePage();
    }

    public void clickCasualDresses() {
        driver = getDriver();
        hoverAndClick(dresses, casualDresses);
    }


}
