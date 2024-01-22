package E2E.pages;

import E2E.enums.ChooseAnExistingAccToTransferIntoNewAcc;
import E2E.enums.WhatTypeOfAccWouldYouLikeToOpen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenNewAccPage extends BasePage{
    public OpenNewAccPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='title'][text()='Open New Account']")
    WebElement header;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement openNewAccButton;
    public void waitForVisibility(){
        getWait().forVisibility(header);
        getWait().forVisibility(openNewAccButton);
    }



    public AccountDetails clickOnWhatTypeOfAccWouldYouLikeToOpen(WhatTypeOfAccWouldYouLikeToOpen tab) {
        driver.findElement(By.xpath("//*[@ng-init='types.selectedOption = '0'']//*[@value='"+tab.value+"']")).click();
        return new AccountDetails(driver);
    }
    public AccountDetails clickOnDropDownToChooseAnAccToTransferIntoNewAcc(ChooseAnExistingAccToTransferIntoNewAcc tab) {
        driver.findElement(By.xpath("//*[@id='fromAccountId']//*[@value][" + tab.value + "]")).click();
        return new AccountDetails(driver);
    }
    public void clickOnOpenNewAccButton(){
        openNewAccButton.click();
    }


}
