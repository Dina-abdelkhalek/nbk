package TemenosPages.Teller;

import TemenosPages.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CashDepositLocal extends CommonMethods {

    private final By cashDepositLocal = By.linkText("Cash deposit Local");
    private final By depositAmount = By.id("fieldName:AMOUNT.LOCAL.1:1");
    private final By commitBtn = By.cssSelector("img[title=\"Commit the deal\"]");
    private final By unitOfHundreds = By.id("fieldName:DR.UNIT:1");
    private final By creditAccount = By.id("fieldName:ACCOUNT.2");
    private final By acceptOverride = By.id("errorImg");

    private final By completeTxn = By.cssSelector("td[class=\"message\"]");

    private String CustomerNo;


    public void clickOnCashDepositLocal() {
        FindElement(cashDepositLocal).click();
    }

    public void enterDepositAmount(String depositAmounts) {
        FindElement(depositAmount).sendKeys(depositAmounts);
    }

    public void enterCreditAccount(String creditAcc) {
        FindElement(creditAccount).sendKeys(creditAcc);
    }

    public void clickOnCommitBtn() {
        FindElement(commitBtn).click();
    }

    public void enterUnitsOfHundreds(String units) {
        FindElement(unitOfHundreds).sendKeys(Keys.chord(Keys.BACK_SPACE, units));
    }

    public void checkTheLimitAndOverride() {
        WebElement acceptOverRideBtn = FindElement(acceptOverride);
        if (acceptOverRideBtn.isDisplayed()) {
            acceptOverRideBtn.click();
        }
    }

    public String setCustomerNo() {
        CustomerNo = FindElement(completeTxn).getText().replaceAll("[^0-9]", "").substring(0, 6);
        return CustomerNo;
    }

    public void creditAccVisibility() {
        cdriver.findElement(creditAccount).click();
        WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(
                cdriver.findElement(creditAccount)));
    }
}
/*    public String getCustomerNo() {
        return CustomerNo;
    }*/
