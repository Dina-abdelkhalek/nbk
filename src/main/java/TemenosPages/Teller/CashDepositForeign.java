package TemenosPages.Teller;

import TemenosPages.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CashDepositForeign extends CommonMethods {
    private final By cashDepositForeign = By.linkText("Cash deposit Foreign");
    private final By depositedAmount = By.id("fieldName:AMOUNT.FCY.1:1");
    private final By commitBtn = By.cssSelector("img[title=\"Commit the deal\"]");
    private final By currencyDeposited = By.id("fieldName:CURRENCY.1");

    private final By creditCurrency = By.id("fieldName:CURRENCY.2");
    private final By unitOfFiveHundreds = By.xpath("/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[2]/td[6]/input");
    private final By account = By.id("fieldName:ACCOUNT.2");
    private final By acceptOverride = By.id("errorImg");

    private final By completeTxn = By.cssSelector("td[class=\"message\"]");

    private String CustomerNo;


    public void clickOnCashDepositForeign() {
        FindElement(cashDepositForeign).click();
    }

    public void enterDepositAmount(String depositedAmounts) {
        FindElement(depositedAmount).sendKeys(depositedAmounts);
    }

    public void enterAccount(String Acc) {
        FindElement(account).sendKeys(Acc);
    }

    public void clickOnCommitBtn() {
        FindElement(commitBtn).click();
    }

    public void enterUnitsOfFiveHundreds(String units) {
        FindElement(unitOfFiveHundreds).sendKeys(Keys.chord(Keys.BACK_SPACE, units));
    }

    public void selectDepositCurrency(String currency1){
        FindElement(currencyDeposited).sendKeys(currency1);
    }

    public void selectCreditCurrency(String currency2){
        FindElement(creditCurrency).sendKeys(currency2);
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

    public void checkAccVisibility() {
        cdriver.findElement(account).click();
        WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(
                cdriver.findElement(account)));
    }

    public void checkUnitsVisibility() {
        cdriver.findElement(unitOfFiveHundreds).click();
        WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(
                cdriver.findElement(unitOfFiveHundreds)));
    }
}
