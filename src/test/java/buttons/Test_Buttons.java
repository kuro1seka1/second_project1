package buttons;
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
public class Test_Buttons {
    private WebDriver driver;



    @BeforeClass
    public void beforeClass() {
        driver = Browser.createDriver();


        //mainPage.openStartPage();

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
