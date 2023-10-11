package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement userNameInput = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement userEmailInput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        WebElement currentAddrInput = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement permanentAddrInput = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
        userNameInput.sendKeys("Ivan");
        userEmailInput.sendKeys("ivan@ya.ru");
        currentAddrInput.sendKeys("Курск");
        permanentAddrInput.sendKeys("Москва");
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        js.executeScript("arguments[0].scrollIntoView();",button);
        button.click();
        String name;
        WebElement userNameOutput = driver.findElement(By.xpath("//p[@id='name']"));
        WebElement userEmailOutput = driver.findElement(By.xpath("//p[@id='email']"));
        WebElement userCurAddrOutput = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        WebElement userPurAddrOutput = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        name = userNameOutput.getText();
        String email = userEmailOutput.getText();
        String curAddr = userCurAddrOutput.getText();
        String purAddr = userPurAddrOutput.getText();
        System.out.println(name + " " + email + " " + curAddr + " " + purAddr + " ");



    }
}