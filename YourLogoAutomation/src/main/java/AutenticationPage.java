import org.openqa.selenium.By;

public class AutenticationPage extends Helpers {

    private By emailField = By.id("email");
    private By passwordField = By.id("passwd");
    private By submitButton = By.id("SubmitLogin");
    private By createAnAccountButton = By.id("SubmitCreate");


    public void fillInEmailField(String email){
        driver = getDriver();
        driver.findElement(emailField).sendKeys(email);
    }

    public void fillInPasswordField(String password){
        driver = getDriver();
        driver.findElement(passwordField).sendKeys(password);
    }

    public MyAccountPage clickSubmitButton(){
        driver = getDriver();
        driver.findElement(submitButton).click();
        return new MyAccountPage();
    }

    public By getPageIdentifier(){
        return createAnAccountButton;
    }

}


