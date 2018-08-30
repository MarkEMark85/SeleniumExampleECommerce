import org.openqa.selenium.By;

public class MyAccountPage extends Helpers {

    private By myWishListButton = By.xpath("//a[@title='My wishlists']");

    public void clickMyWishlistsButton(){
        driver = getDriver();
        driver.findElement(myWishListButton).click();
    }

    public By getPageIdentifier(){
        return myWishListButton;
    }
}
