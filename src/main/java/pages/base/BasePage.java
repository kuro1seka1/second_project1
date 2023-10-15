package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;
import static constants.Constant.URLS.START_PAGE_URL;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public static final String CHECK_BOX_LOCATOR = "//input[@type='checkbox'][following-sibling::span[contains(text(),'%s')]]";
    public void openUrl(String url){
        driver.get(url);
    }
    public void openStartPage(){
        openUrl(START_PAGE_URL);
    }
    public WebElement findElement(String locator){
        WebElement element = driver.findElement(By.xpath(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        return element;
    }
    public List<WebElement> findElements(String locator){
        return driver.findElements(By.xpath(locator));
    }

    public void click(String locator){
        findElement(locator).click();
    }
    public  void doubleClick(String locator){
        Actions actions = new Actions(driver);
        WebElement elementLocator = findElement(locator);
        actions.doubleClick(elementLocator).perform();
    }
    public  void rightClick(String locator){
        Actions actions = new Actions(driver);
        WebElement link = findElement(locator);
        actions.contextClick(link).perform();
    }


    public void clear(String locator){
        findElement(locator).clear();
    }

    public void sendKeys(String locator, String text){
        findElement(locator).sendKeys(text);
    }

    public void sendKeysWithClear(String locator, String text){
        clear(locator);
        sendKeys(locator,text);
    }

    public String getText(String locator){
        return findElement(locator).getText();
    }

    public void waitElementDisplayed(String locator, int second){
        new WebDriverWait(driver, Duration.ofSeconds(second)).until(d-> findElement(locator).isDisplayed());
    }

    public void waitElementDisplayed (String locator){
        waitElementDisplayed(locator,EXPLICIT_WAIT);
    }

    public boolean getCheckBoxState(String checkBoxName){
        String locator = String.format(CHECK_BOX_LOCATOR,checkBoxName);
        return findElement(locator).isSelected();
    }

    public void setCheckBox(String checkBoxName, boolean state){
        String locator = String.format(CHECK_BOX_LOCATOR,checkBoxName) + "/following-sibling::span[@class='rct-checkbox']";
        if(!getCheckBoxState(checkBoxName)==state){
            click(locator);
        }
    }
    public void deleteHtmlElement(String locator){
        WebElement t = driver.findElement(By.xpath(locator));
        JavascriptExecutor js  = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].remove();",t);
    }
    public void clickByJS(String locator){
        WebElement t = driver.findElement(By.xpath(locator));
        JavascriptExecutor js  = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",t);
    }

}
