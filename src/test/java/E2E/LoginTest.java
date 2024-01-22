package E2E;

import E2E.enums.AccList;
import E2E.pages.AccountDetails;
import E2E.pages.HomePage;
import E2E.pages.LoginPage;
import org.testng.annotations.Test;


public class LoginTest extends TestBase{
    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void userCanLogin(){
        String userName="Test1111126131";
        String password="Gazmanov1234";
        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(userName,password);
        homePage = new HomePage(app.driver);
        String info = homePage.extractInfoFromAcc(AccList.FIRST);
        String[]parts = info.split("\\s+");
        String fitsNummber = parts[0];
        System.out.println("First " + fitsNummber);
    }
}
