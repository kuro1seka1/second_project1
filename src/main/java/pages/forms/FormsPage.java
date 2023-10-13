package pages.forms;

import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class FormsPage extends BasePage {

    public FormsPage(WebDriver driver) {super(driver);}
    public static final String FIRST_NAME = "//*[@id='firstName']";
    public static final String LAST_NAME = "//*[@id='lastName']";
    public static  final String USER_EMAIL = "//*[@id='userEmail']";
    public static final String RADIO_BTN_LOCATOR_MALE = "//input[@id='gender-radio-1']";
    public static final String RADIO_BTN_LOCATOR_FEMALE = "//input[@id='gender-radio-2']";
    public static final String RADIO_BTN_LOCATOR_OTHER = "//input[@id='gender-radio-3']";//1-Male,2-Female,3-Other
    public static  final String USER_MOB_NUMBER = "//*[@id='userNumber']";





    public void setFirstName(String name){sendKeys(FIRST_NAME,name);}
    public void setLastName(String lastName){
        sendKeysWithClear(LAST_NAME,lastName);
    }
    public void setUserEmail(String userEmail){
        sendKeysWithClear(USER_EMAIL,userEmail);
    }


    public void setSex(int sex){
        if(sex==1) {
            click(RADIO_BTN_LOCATOR_MALE);
        }
        else if (sex == 2){
            click(RADIO_BTN_LOCATOR_FEMALE);
        }
        else if (sex == 3){
            click(RADIO_BTN_LOCATOR_OTHER);
        }
    }
    public  void setUserMobNumber(String number)
    {
        sendKeys(USER_MOB_NUMBER,number);
    }

}
