package E2E;

import E2E.enums.AccList;
import E2E.enums.AccTabs;
import E2E.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserCanCreateNewAcc extends TestBase{
    LoginPage loginPage;
    HomePage homePage;
    OpenNewAccPage openNewAccPage;
    AccountDetails accountDetails;
    CreateNewAccountPage createNewAccountPage;
    @Test
    public void userCanCreateNewAcc(){
        String userName="Test1111126131";
        String password="Gazmanov1234";
        loginPage = new LoginPage(app.driver);
        loginPage.waitForLoading();
        loginPage.login(userName,password);
        homePage = new HomePage(app.driver);
        homePage.clickOnAccOverview();
        String info = homePage.extractInfoFromAcc(AccList.FIRST);
        String[]parts = info.split("\\s+");
        String fitsNummber = parts[0];
        System.out.println(fitsNummber);
        homePage.clickToShowAccInfo(fitsNummber);



    }
}
