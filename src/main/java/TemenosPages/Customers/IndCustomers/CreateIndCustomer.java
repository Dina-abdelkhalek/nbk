package TemenosPages.Customers.IndCustomers;

import TemenosPages.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class CreateIndCustomer extends CommonMethods {

    private final By IndividualCustomerBtn = By.id("C1__BUT_59666E37CA98156F22153");
    private final By CustomerType = By.name("C1__C2__C1__C1__C1__VEREGPLCUSTHANDLE_EGPL[1].CUSTOMERTYPE");
    private final By PressCommit = By.id("C1__commit_version_button");

    private final By Titel_field = By.name("C1__C2__C1__C1__C1__VERCUSTOMER_EGPLPRIVMAIN[1].CTITLE");
    private final By Full_Name = By.id("C1__C2__C1__C1__C1__QUE_--CUSTOMER--NAME-1--_display");
    private final By AR_Full_Name_field = By.id("C1__C2__C1__C1__C1__VERCUSTOMER_EGPLPRIVMAIN[1].VERCUSTOMER_EGPLPRIVMAIN_CUSTCOMMENTSMVGROUP[1].ELEMENT[1].CUSTCOMMENTS");
    private final By EN_Full_Name_field = By.id("C1__C2__C1__C1__C1__VERCUSTOMER_EGPLPRIVMAIN[1].ENGLISHNAME");
    private final By Mnemoic_field = By.id("fieldName:MNEMONIC");
    private final By Sector_field = By.id("fieldName:SECTOR");
    private final By GenderRadioBtn = By.id("radio:tab1:GENDER");

    private final By ValidateDealBtn = By.xpath("//*[@id=\"goButton\"]/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[2]/a/img");
    private final By CommitDealBtn = By.xpath("//*[@id=\"goButton\"]/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[1]/a/img");

    private final By acceptOverRide = By.id("errorImg");

    private final By completeTxn = By.xpath("//td[contains(text(),'Txn Complete:')]");

    private String CustomerNo;




    public void clickOnIndividualCustomerBtn() {
        FindElement(IndividualCustomerBtn).click();
    }

    public void enterGivenName(String GivenNameTxt) {
        FindElement(Full_Name).sendKeys(GivenNameTxt);
    }

    public void enterGBFullNamefield(String GB_Full_Name_Txt) {
        FindElement(AR_Full_Name_field).sendKeys(GB_Full_Name_Txt);
    }

    public void enterMonemoicFieldAutomatically(){
        FindElement(Mnemoic_field).sendKeys(generateRandomMenmonicvalue());
    }
    public void enterMonemoicField(String menmonic){
        FindElement(Mnemoic_field).sendKeys(menmonic);
    }

    public String generateRandomMenmonicvalue(){
        int Num_Length = 10;
        StringBuilder st = new StringBuilder();
        Random random = new Random();
        st.append("A");
        for(int i =0; i<Num_Length; i++){
            st.append(random.nextInt(10));
        }
        return st.toString();

    }

    public void enterSectorField(String enterSectorTxt) {
        FindElement(Sector_field).sendKeys(enterSectorTxt);
    }

        public void enterGBShortNameField(String enterGBShortNameTxt) {
            FindElement(EN_Full_Name_field).clear();
            FindElement(EN_Full_Name_field).sendKeys(enterGBShortNameTxt);
        }

    public void clickOnGenderButton() {
        FindElement(GenderRadioBtn).click();
    }

    public void clickOnValidateDealBtn() {
        FindElement(ValidateDealBtn).click();
    }

    public void clickOnCommitDealBtn() {
        FindElement(CommitDealBtn).click();
    }

    public void clickOnTitleDropdownList(String TitleText) {
        WebElement CustomerTypeElement = FindElement(CustomerType);
        Select typedropdown = new Select(CustomerTypeElement);
        typedropdown.selectByVisibleText(TitleText);
    }





    public void checkTheCustomerisExistedBeforeAndOverride(){
        WebElement acceptOverRideBtn = FindElement(acceptOverRide);
            if(acceptOverRideBtn.isDisplayed()){
                acceptOverRideBtn.click();
            }
    }

    public String setCustomerNo(){
        CustomerNo =  FindElement(completeTxn).getText().replaceAll("[^0-9]", "").substring(0, 6);
        return CustomerNo;
    }

    public String getCustomerNo(){
        return CustomerNo;
    }
}
