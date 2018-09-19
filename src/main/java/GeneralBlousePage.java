import org.openqa.selenium.By;

public class GeneralBlousePage extends BasePage {

    private By blouseImage = By.xpath("//img[@title='Blouse']");
    private By viewMore = By.xpath("//a[@title='View']");

    public BlackBlousePage clickOnMore() {
        driver = getDriver();
        hoverAndClick(blouseImage, viewMore);
        return new BlackBlousePage();
    }
}
