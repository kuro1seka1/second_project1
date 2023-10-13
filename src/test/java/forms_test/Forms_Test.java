package forms_test;
import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.base.BasePage;
import pages.forms.FormsPage;

import static pages.forms.FormsPage.FIRST_NAME;

public class Forms_Test {
    private WebDriver driver;
    private MainPage mainPage;

    private FormsPage formsPage;
    @BeforeClass
    public void beforeClass() {
        driver = Browser.createDriver();
        mainPage = new MainPage(driver);
        formsPage = new FormsPage(driver);
        //mainPage.openStartPage();

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void step_01(){
        mainPage.openStartPage();
        mainPage.openCategoryForms();
        formsPage.click("//*[@id='item-0']/span[text()='Practice Form']");
        formsPage.setFirstName("Name");
        formsPage.setLastName("lastname");
        formsPage.setUserEmail("4tar111@gmail.com");
        formsPage.setSex(1);
        formsPage.setUserMobNumber("+46237642");

    }
}
