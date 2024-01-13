package E2E.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;

public class CreateNewAccountPage extends LoginPage {
    public CreateNewAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[text()='Signing up is easy!']")
    WebElement header;
    @FindBy(xpath = "//*[@name='customer.firstName']")
    WebElement firstNameInput;
    @FindBy(xpath = "//*[@name='customer.lastName']")
    WebElement lastNameInput;
    @FindBy(xpath = "//*[@name='customer.address.street']")
    WebElement addressInput;
    @FindBy(xpath = "//*[@name='customer.address.city']")
    WebElement cityInput;
    @FindBy(xpath = "//*[@name='customer.address.state']")
    WebElement stateInput;
    @FindBy(xpath = "//*[@name='customer.address.zipCode']")
    WebElement zipCodeInput;
    @FindBy(xpath = "//*[@name='customer.phoneNumber']")
    WebElement phoneNumberInput;
    @FindBy(xpath = "//*[@name='customer.ssn']")
    WebElement ssnInput;
    @FindBy(xpath = "//*[@name='customer.username']")
    WebElement userNameInput;
    @FindBy(xpath = "//*[@name='customer.password']")
    WebElement passwordInput;
    @FindBy(xpath = "//*[@name='repeatedPassword']")
    WebElement confirmPasswordInput;
    @FindBy(xpath = "//*[@value='Register']")
    WebElement registerButton;
    public void waitForLoading(){
        getWait().forVisibility(header);
        getWait().forVisibility(firstNameInput);
        getWait().forVisibility(lastNameInput);
        getWait().forVisibility(addressInput);
        getWait().forVisibility(cityInput);
        getWait().forVisibility(stateInput);
        getWait().forVisibility(zipCodeInput);
        getWait().forVisibility(ssnInput);
        getWait().forVisibility(userNameInput);
        getWait().forVisibility(passwordInput);
        getWait().forVisibility(confirmPasswordInput);
        getWait().forClickable(registerButton);
    }

    public void createAnAccount(String firstName,String lastName,String address,String city,String state,int zip,int phone,int ssn,String userName,String password,String confirmPassword){
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        stateInput.sendKeys(state);
        zipCodeInput.sendKeys(Integer.toString(zip));
        phoneNumberInput.sendKeys(Integer.toString(phone));
        ssnInput.sendKeys(Integer.toString(ssn));
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(confirmPassword);
        registerButton.click();
    }

}
