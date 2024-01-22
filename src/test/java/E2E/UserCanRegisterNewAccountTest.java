package E2E;

import E2E.enums.AccTabs;
import E2E.pages.AccountDetails;
import E2E.pages.CreateNewAccountPage;
import E2E.pages.HomePage;
import E2E.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserCanRegisterNewAccountTest extends TestBase{
    LoginPage loginPage;
    HomePage homePage;
    AccountDetails accountDetails;
    CreateNewAccountPage createNewAccountPage;
    @Test
    public void userCanRegisterNewAcc(){
        String firstName="Olerksand";
        String lastName="Rashevchenko";
        String address="Dresdner Straße 8";
        String city="Dresden";
        String state="Sachsen";
        int zip=1234;
        int phone=380966451;
        int ssn=134553;
        String userName="Olexsandra";
        String password="Gazmanov1234";
        String confirmPassword="Gazmanov1234";
        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.registration();
        createNewAccountPage = new CreateNewAccountPage(app.driver);
        createNewAccountPage.waitForLoading();
        createNewAccountPage.createAnAccount(firstName,lastName,address,city,state,zip,phone,ssn,userName,password,confirmPassword);
        homePage = new HomePage(app.driver);
        Assert.assertTrue(homePage.isSuccessfulMassageDisplayed(),"Is no successful Massage");
        homePage.takeSuccessfulMassageScreen("successfulMassage");


    }
}
