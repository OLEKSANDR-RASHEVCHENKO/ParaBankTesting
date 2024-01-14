package E2E.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.dom.model.Quad;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
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



    public boolean isSuccessfulMassageDisplayed(){
        getWait().forVisibility(successfulHeader);
        return isElementDisplayed(successfulHeader);
    }
}
