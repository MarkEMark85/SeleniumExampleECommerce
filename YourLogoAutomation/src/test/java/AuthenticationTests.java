import org.testng.annotations.Test;

public class AuthenticationTests extends TestHelpers{

    @Test
    public void testSuccessfulLogin(){
        HomePage homePage = new HomePage();
        homePage.navigateToPage();
        AutenticationPage autenticationPage = homePage.clickSignInButton();
        autenticationPage.fillInEmailField("meldred9@bruinmail.slcc.edu");
        autenticationPage.fillInPasswordField("Password1");
        MyAccountPage myAccountPage = autenticationPage.clickSubmitButton();
        checkIfExists(driver, myAccountPage.getPageIdentifier());

    }

    @Test
    public void testUnsuccessfulLoginNoPassword(){
        HomePage homePage = new HomePage();
        homePage.navigateToPage();
        AutenticationPage autenticationPage = homePage.clickSignInButton();
        autenticationPage.fillInEmailField("meldred9@bruinmail.slcc.edu");
        autenticationPage.fillInPasswordField("");
        autenticationPage.clickSubmitButton();
        checkIfExists(driver, autenticationPage.getPageIdentifier());
    }

    @Test
    public void testUnsuccessfulLoginNoEmail(){
        HomePage homePage = new HomePage();
        homePage.navigateToPage();
        AutenticationPage autenticationPage = homePage.clickSignInButton();
        autenticationPage.fillInEmailField("");
        autenticationPage.fillInPasswordField("Password1");
        autenticationPage.clickSubmitButton();
        checkIfExists(driver, autenticationPage.getPageIdentifier());
    }
}
