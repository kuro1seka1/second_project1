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

import static pages.forms.FormsPage.*;

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
        formsPage.setSex(2);
        formsPage.setUserMobNumber("+46237642");
        formsPage.openDatePicker();
        formsPage.setSelectDate(24);
        formsPage.setHobbies("Sports");
        formsPage.setAutocompliteUnfocus();
        formsPage.setAutocompliteFocus("M");
        formsPage.chooseAutocompliteWord("Maths");
        formsPage.click(SELECT_STATE_LOCATOR);
        formsPage.setState(1);
        formsPage.click(SELECT_CITY_LOCATOR);
        formsPage.setCity(1);
        formsPage.deleteHtmlElement(FOOTER_LOCATOR);
        formsPage.clickByJS(SUBMIT_BTN);
        String s = formsPage.finalCheck();
        String finalphrase = "Thanks for submitting the form";
        Assert.assertTrue(s.equals(finalphrase));

    }
}
