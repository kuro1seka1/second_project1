package buttons;
import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.buttons.ButtonsPage;

import static pages.buttons.ButtonsPage.*;

public class Test_Button {
    private WebDriver driver;
    private ButtonsPage buttonsPage;

    @BeforeClass
    public void beforeClass() {
        driver = Browser.createDriver();
        buttonsPage = new ButtonsPage(driver);
        buttonsPage.openUrl("https://demoqa.com/buttons");
    }

        @AfterClass
        public void afterClass(){
            driver.quit();
        }




    @Test
    public void step_01(){
        buttonsPage.clickDoubleClickBtn();
        buttonsPage.waitElementDisplayed(DOUBLE_TEXT_CHECK);
        String text = buttonsPage.getText(DOUBLE_TEXT_CHECK);
        Assert.assertTrue(text.equals(DOUBLE_CLICK_TEXT));
    }
    public void step_02(){
        buttonsPage.rightClick(RIGHT_CLICK_BTN);
        buttonsPage.waitElementDisplayed(RIGHT_CLICK_TEXT_CHECK);
        String text = buttonsPage.getText(RIGHT_CLICK_TEXT_CHECK);
        Assert.assertTrue(text.equals(RIGHT_CLICK_TEXT));
    }
    public void step_03(){
        buttonsPage.rightClick(DYNAMIC_BTN);
        buttonsPage.waitElementDisplayed(DYNAMIC_CLICK_TEXT_CHECK);
        String text = buttonsPage.getText(DYNAMIC_CLICK_TEXT_CHECK);
        Assert.assertTrue(text.equals(DYNAMIC_CLICK_TEXT));
    }

}
