package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {

            driver.get("https://10.99.80.105:9443/Browser/Logoff");
            driver.findElement(By.id("userId")).sendKeys("INPUTT");
            driver.findElement(By.id("password")).sendKeys("Aa12345&");
            driver.findElement(By.name("commit")).click();

    }
}