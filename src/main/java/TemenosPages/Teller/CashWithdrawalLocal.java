package TemenosPages.Teller;

import TemenosPages.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CashWithdrawalLocal extends CommonMethods {
    private final By cashWithdrawalLocal = By.linkText("Cash withdrawal Local (Without Cheque)");
    private final By LCYAmount = By.id("fieldName:AMOUNT.LOCAL.1:1");
    private final By commitBtn = By.cssSelector("img[title=\"Commit the deal\"]");
    private final By unitOfHundreds = By.id("fieldName:UNIT:1");
    private final By debitAccount = By.id("fieldName:ACCOUNT.2");
    private final By acceptOverride = By.id("errorImg");

    private final By completeTxn = By.cssSelector("td[class=\"message\"]");

    public void clickOnCashWithdrawalLocal() {
        FindElement(cashWithdrawalLocal).click();
    }

    public void enterLYCAmount(String lYCAmount) {
        FindElement(LCYAmount).sendKeys(lYCAmount);
    }

    public void enterDebitAccount(String debitAcc) {
        FindElement(debitAccount).sendKeys(debitAcc);
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
    public void debitAccVisibility() {
        cdriver.findElement(debitAccount).click();
        WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(
                cdriver.findElement(debitAccount)));
    }
}
