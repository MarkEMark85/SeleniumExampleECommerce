import org.testng.annotations.Test;

public class AuthenticationTests extends BasePage {

    @Test
    public void testSuccessfulLogin() {
        HomePage homePage = new HomePage();
        homePage.navigateToPage();
        AuthenticationPage authenticationPage = homePage.clickSignInButton();
        MyAccountPage myAccountPage = authenticationPage.login("meldred9@bruinmail.slcc.edu", "Password1");
        assert
                myAccountPage.isCurrentPage() == true;

    }

    @Test
    public void testUnsuccessfulLoginNoPassword() {
        HomePage homePage = new HomePage();
        homePage.navigateToPage();
        AuthenticationPage authenticationPage = homePage.clickSignInButton();
        assert
                authenticationPage.isCurrentPage() == true;
        authenticationPage.login("meldred9@bruinmail.slcc.edu", "");
        assert
                authenticationPage.isCurrentPage() == true;

    }

    @Test
    public void testUnsuccessfulLoginNoEmail() {
        HomePage homePage = new HomePage();
        homePage.navigateToPage();
        AuthenticationPage authenticationPage = homePage.clickSignInButton();
        authenticationPage.login("", "Password1");
        assert
                authenticationPage.isCurrentPage() == false;
    }

    @Test
    public void addToMyWishList() {
        HomePage homePage = new HomePage();
        homePage.navigateToPage();
        AuthenticationPage authenticationPage = homePage.clickSignInButton();
        MyAccountPage myAccountPage = authenticationPage.login("meldred9@bruinmail.slcc.edu", "Password1");
        GeneralBlousePage generalBlousePage = myAccountPage.clickOnBlouse();
        BlackBlousePage blackBlousePage = generalBlousePage.clickOnMore();
        blackBlousePage.clickAddToWishList();
        loadWait(1);
        MyAccountPage myAccountPage2 = blackBlousePage.clickAccountPage();
        WishListPage wishListPage = myAccountPage2.clickMyWishlistsButton();
        wishListPage.clickViewLink();
        loadWait(1);
        assert
                wishListPage.isCurrentPage() == true;
    }


}
