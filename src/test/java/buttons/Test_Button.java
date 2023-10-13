package buttons;
import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.buttons.ButtonsPage;

import static pages.buttons.ButtonsPage.DOUBLE_CLICK_TEXT;
import static pages.buttons.ButtonsPage.DOUBLE_TEXT_CHECK;

public class Test_Button {
    private WebDriver driver;
    private ButtonsPage buttonsPage;

    @BeforeClass
    public void beforeClass() {
        driver = Browser.createDriver();
        buttonsPage = new ButtonsPage(driver);
    }

        @AfterClass
        public void afterClass(){
            driver.quit();
        }




    @Test
    public void step_01(){
        buttonsPage.openStartPage();
        buttonsPage.openUrl("https://demoqa.com/buttons");
        buttonsPage.clickDoubleClickBtn();
        String text = buttonsPage.getText("You have done a double click");
        buttonsPage.waitElementDisplayed(DOUBLE_TEXT_CHECK,10);
        Assert.assertTrue(text.equals(DOUBLE_CLICK_TEXT));
    }

}
