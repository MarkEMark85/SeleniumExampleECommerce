import org.openqa.selenium.By;

public class WishListPage extends BasePage {

    private By viewLink = By.linkText("View");
    private By blousePicture = By.xpath("//img[@alt='Blouse']");

    public void clickViewLink(){
        driver = getDriver();
        driver.findElement(viewLink).click();
    }

    public boolean isCurrentPage(){ return checkIfExists(blousePicture);}

}
