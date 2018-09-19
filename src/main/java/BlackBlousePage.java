import org.openqa.selenium.By;

public class BlackBlousePage extends BasePage {
    private By addToWishList = By.xpath("//a[@title='Add to my wishlist']");
    private By close = By.xpath("//a[@title='Close']");
    private By accountButton = By.xpath("//a[@title='View my customer account']");

    public void clickAddToWishList() {
        driver = getDriver();
        driver.findElement(addToWishList).click();
        loadWait(2);
        driver.findElement(close).click();
    }

    public MyAccountPage clickAccountPage() {
        driver = getDriver();
        driver.findElement(accountButton).click();
        return new MyAccountPage();
    }
}
