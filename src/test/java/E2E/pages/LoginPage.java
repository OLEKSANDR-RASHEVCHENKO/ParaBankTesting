package E2E.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@alt='ParaBank']")
    WebElement header;
    @FindBy(xpath = "//*[@name='username']")
    WebElement userNameInput;

    @FindBy(xpath = "//*[@name='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//*[@value='Log In']")
    WebElement loginButton;
    @FindBy(xpath = "//*[text()='Forgot login info?']")
    WebElement forgotLoginInfoButton;
    @FindBy(xpath = "//*[text()='Register']")
    WebElement registerButton;
    public void waitForLoading(){
        getWait().forVisibility(header);
        getWait().forVisibility(userNameInput);
        getWait().forVisibility(passwordInput);
        getWait().forClickable(registerButton);
        getWait().forClickable(forgotLoginInfoButton);
    }

    public void login (String userName,String password){
        userNameInput.sendKeys();
        passwordInput.sendKeys();
        loginButton.click();
    }
    public void forgotLogin(){
        forgotLoginInfoButton.click();
    }
    public void registration(){
        registerButton.click();
    }

}
