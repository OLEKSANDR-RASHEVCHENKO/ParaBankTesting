package E2E.pages;

import E2E.enums.AccList;
import E2E.enums.AccTabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.dom.model.Quad;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Your account was created successfully. You are now logged in.']")
    WebElement successfulHeader;
    @FindBy(xpath = "//*[text()='Open New Account']")
    WebElement openNewAccountButton;
    @FindBy(xpath = "//*[text()='Accounts Overview']")
    WebElement accountOverviewButton;
    @FindBy(xpath = "//*[text()='Transfer Funds']")
    WebElement transferFundsButton;
    @FindBy(xpath = "//*[text()='Bill Pay']")
    WebElement billPayButton;
    @FindBy(xpath = "//*[text()='Find Transactions']")
    WebElement findTransactionsButton;
    @FindBy(xpath = "//*[text()='Update Contact Info']")
    WebElement updateContactInfoButton;
    @FindBy(xpath = "//*[text()='Request Loan']")
    WebElement requestLoan;
    @FindBy(xpath = "//*[text()='Log Out']")
    WebElement logOutButton;
    @FindBy(xpath = "//*[@id='accountTable']")
    WebElement accountTable;
    @FindBy(xpath = "//*[@ng-repeat='account in accounts']")
    WebElement accOne;


    public boolean isSuccessfulMassageDisplayed() {
        getWait().forVisibility(successfulHeader);
        return isElementDisplayed(successfulHeader);
    }
    public void clickOnAccOverview(){
        accountOverviewButton.click();
    }
    public void clickOnNewAccButton(){
        openNewAccountButton.click();
    }

    public AccountDetails clickToShowAccInfo(String id) {
        driver.findElement(By.xpath("//*[@class='ng-binding' and text()='" + id + "']")).click();
        return new AccountDetails(driver);
    }

    public String extractInfoFromAcc(AccList accList) {
        WebElement element = driver.findElement(By.xpath("//*[@ng-repeat='account in accounts']" + accList.value));
        element.click();
        String text = element.getText();
        return text;
    }


    public void takeAccTableScreen(String actualScreenshotName) {
        takeAndCompareScreenshot(actualScreenshotName, accountTable);
    }

    public void takeSuccessfulMassageScreen(String actualScreenshotName) {
        takeAndCompareScreenshot(actualScreenshotName, successfulHeader);
    }
}
