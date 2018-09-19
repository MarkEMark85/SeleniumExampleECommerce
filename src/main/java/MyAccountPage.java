import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {

    private By myWishListButton = By.xpath("//a[@title='My wishlists']");
    private By women = By.xpath("//a[@title='Women']");
    private By blouses = By.xpath("//a[@title='Blouses']");

    public WishListPage clickMyWishlistsButton() {
        driver = getDriver();
        driver.findElement(myWishListButton).click();
        return new WishListPage();
    }

    public GeneralBlousePage clickOnBlouse() {
        driver = getDriver();
        hoverAndClick(women, blouses);
        return new GeneralBlousePage();
    }

    public boolean isCurrentPage() {return checkIfExists(myWishListButton);}
}
