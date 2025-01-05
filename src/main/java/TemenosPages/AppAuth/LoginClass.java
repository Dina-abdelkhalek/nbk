package TemenosPages.AppAuth;

import TemenosPages.CommonMethods;
import org.openqa.selenium.By;

public class LoginClass extends CommonMethods {


    private final By UserName = By.xpath("//*[@id=\"userId\"]");
    private final By Password = By.id("password");
    private final By SignInBtn = By.name("commit");


    public void login(String username, String password) {

        // Open the URL from ProprtyFile

        // Find username field and enter username
        FindElement(UserName).sendKeys(username);

        // Find password field and enter password
        FindElement(Password).sendKeys(password);

        // Click on the sign-in button
        FindElement(SignInBtn).click();
        //return clogindriver ;


    }
//    public static void Driverquit () {
//        // Close the WebDriver
//
//        WebDriver clogindriver =LoginClass.login("INPUTT","123456");
//        clogindriver.quit();
//}
}
