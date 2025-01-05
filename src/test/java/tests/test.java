package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class test {

        protected WebDriver driver;
        @BeforeMethod(description = "Open the browser and navigate to the URL") //open the browser
        public void openBrowser() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        @AfterMethod(description = "close the browser") //close the browser
        public void closeBrowser() {
            driver.quit();
        }

}
