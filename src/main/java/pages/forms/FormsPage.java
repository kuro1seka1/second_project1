package pages.forms;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class FormsPage extends BasePage {

    public FormsPage(WebDriver driver) {super(driver);}
    public static final String FIRST_NAME = "//*[@id='firstName']";
    public static final String LAST_NAME = "//*[@id='lastName']";
    public static  final String USER_EMAIL = "//*[@id='userEmail']";
    public static final String RADIO_BTN_LOCATOR = "//input[@name='gender'][following-sibling::value[contains(text(),'%s')]]";


    public void setRadioBtn(String radioBtnName)
    {
        String locator = String.format(RADIO_BTN_LOCATOR+radioBtnName);
        click(locator);
    }
    public void setFirstName(String name){
        sendKeysWithClear(FIRST_NAME,name);
    }
    public void setLastName(String lastName){
        sendKeysWithClear(LAST_NAME,lastName);
    }
    public void setUserEmail(String userEmail){
        sendKeysWithClear(USER_EMAIL,userEmail);
    }

}
