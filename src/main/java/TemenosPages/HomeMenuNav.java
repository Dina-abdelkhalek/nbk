package TemenosPages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeMenuNav extends CommonMethods {
    private WebDriver cdriver = WebDriverFactory.getDriver();

    private final By FrameElements = By.xpath("//frame");

    private final By UserMenuArrow = By.xpath("//*[@id=\"BUT_3B224FD68CBCFA9126262\"]");
    private final By CustomerMenuArrow = By.xpath("//*[@id=\"menu\"]/li[2]/a/span");
    private final By CustomerVersion = By.xpath("//*[@id=\"menu\"]/li[2]/ul/li[2]/a/span");
    private final By CustomerMaintenances = By.xpath("//*[@id=\"menu\"]/li[2]/ul/li[2]/a/span");


    private final By retailOperationsArrow = By.cssSelector("img[alt=\"Retail Operations\"]");
    private final By accountTransactionsArrow = By.cssSelector("img[alt=\"Account Transactions\"]");
    private final By tellerArrow = By.cssSelector("img[alt=\"Teller\"]");
    private final By tellerOperations = By.cssSelector("img[alt=\"Teller Operations\"]");
    private final By tellerCash = By.cssSelector("img[alt=\"Teller Cash\"]");


    public void HandleAlert() {
        try {
            getAlertTextAndAcceptThisAlert();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present, continuing script execution...");
        }finally {
            switchToTheSecondFrame();
            OpenCustomerMenu();
        }

    }


    public void OpenCustomerMenu() {
        clickOnUserMenuArrow();
        clickOnCustomerMenuArrow();
        clickOnCustomerVersion();
        clickOnCustomerMaintenances();
    }

    public void clickOnUserMenuArrow() {
        FindElement(UserMenuArrow).click();
    }
    public void clickOnCustomerMenuArrow() {
        FindElement(CustomerMenuArrow).click();
    }
    public void clickOnCustomerVersion() { FindElement(CustomerVersion).click(); }
    public void clickOnCustomerMaintenances() { FindElement(CustomerMaintenances).click(); }

    public void clickOnRetailOperations(){
        FindElement(retailOperationsArrow).click();
    }
    public void clickOnAccountTransactions() {
        FindElement(accountTransactionsArrow).click();
    }
    public void clickOnTellerArrow(){
        FindElement(tellerArrow).click();
    }
    public void clickOnTellerOperations() {
        FindElement(tellerOperations).click();
    }
    public void clickOnTellerCash() {
        FindElement(tellerCash).click();
    }
    public void switchToTheSecondFrame() {
        List<WebElement> frameElement2 = cdriver.findElements(FrameElements);
        WebElement SecondFrameElement = frameElement2.get(1);
        SwitchFrameByWebElement(SecondFrameElement);
    }

    public void switchToTheFirstFrame() {
        WebElement frameElementOne = cdriver.findElements(By.tagName("frame")).getFirst();
        SwitchFrameByWebElement(frameElementOne);
    }


    public static void MenuAuthorizeCustomer() {

    }

}