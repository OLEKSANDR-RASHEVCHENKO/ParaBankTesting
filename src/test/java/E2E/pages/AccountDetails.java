package E2E.pages;

import E2E.enums.AccList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDetails extends BasePage{
    public AccountDetails(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id='month']")
    WebElement activityPeriodDropDown;
    @FindBy(xpath = "//*[@id='transactionType']")
    WebElement typeDropDown;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement goButton;
    public String extractInfoFromAccDetails() {
        WebElement element = driver.findElement(By.xpath("//*[//*[@ng-controller='AccountDetailsCtrl']]"));
        element.click();
        String text = element.getText();
        return text;
    }
    public void selectActivityPeriod(String period){
        getSelect(activityPeriodDropDown).selectByVisibleText(period);
    }
    public void selectTypeOfTransfer(String typeOfTransfer){
        getSelect(typeDropDown).selectByVisibleText(typeOfTransfer);
    }
    public void clickOnGoButton(){
        goButton.click();
    }
}
