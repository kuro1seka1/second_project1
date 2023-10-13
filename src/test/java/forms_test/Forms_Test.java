package forms_test;
import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Forms_Test {
    private WebDriver driver;
    private MainPage mainPage;

    private pages.forms.FormsPage

    @BeforeClass
    public void beforeClass() {
        driver = Browser.createDriver();
        mainPage = new MainPage(driver);
        //mainPage.openStartPage();

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void step_01(){
        mainPage.openCategoryForms();
        mainPage.click("//*[@id='item-0']/span[text()='Practice Form']");

    }
}
