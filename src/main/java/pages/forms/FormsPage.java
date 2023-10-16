package pages.forms;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class FormsPage extends BasePage {

    public FormsPage(WebDriver driver) {super(driver);}
    public static final String FIRST_NAME = "//*[@id='firstName']";
    public static final String LAST_NAME = "//*[@id='lastName']";
    public static  final String USER_EMAIL = "//*[@id='userEmail']";
    public static final String RADIO_BTN_LOCATOR_MALE = "//*[@for='gender-radio-1']";
    public static final String RADIO_BTN_LOCATOR_FEMALE = "//*[@for='gender-radio-2']";
    public static final String RADIO_BTN_LOCATOR_OTHER = "//*[@for='gender-radio-3']";//1-Male,2-Female,3-Other
    public static  final String USER_MOB_NUMBER = "//*[@id='userNumber']";

    public static final String DATE_OF_BIRTH_LOCATOR ="//input [@id='dateOfBirthInput']";
    public static final String SELECT_DATE = "//div[@class='react-datepicker__week']//*[text()='%d']";

    public static final String AUTOCOMPLITE_UNFOCUS = "//*[@id='subjectsInput']";
    public static final String AUTOCOMPLITE_MATHS = "//*[@id='react-select-2-option-0'][text()='Maths']";
    public static final String HOBBIES_LOCATOR="//*[@for='hobbies-checkbox-1'][text()='%s']";
    public static final String SELECT_STATE_LOCATOR = "//*[@class=' css-1wa3eu0-placeholder'][text()='Select State']";
    public static final String SELECT_STATE_INNER = "//*[@id='react-select-3-option-%s']";
    public static final String SELECT_CITY_LOCATOR = "//*[@id='city']";
    public static final String SELECT_CITY_INNER= "//*[@id='react-select-4-option-%s']";
    public static final String SUBMIT_BTN = "//button[@id='submit']";
    public static final String FOOTER_LOCATOR = "//footer";
    public static final String FINAL_WORDS = "//*[@class='modal-title h4']";





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
        if(number.length() < 10)
        {
            sendKeys(USER_MOB_NUMBER,"1234567890");
        }else
            sendKeys(USER_MOB_NUMBER,number);
    }
    public void openDatePicker(){
        click(DATE_OF_BIRTH_LOCATOR);
    }
    public void setSelectDate(int day){
        String formatedDay = String.format(SELECT_DATE,day);
        click(formatedDay);
    }
    public void setAutocompliteUnfocus(){

        click(AUTOCOMPLITE_UNFOCUS);

    }
    public void setAutocompliteFocus(String word){

        sendKeys(AUTOCOMPLITE_UNFOCUS,word);

    }
    public void chooseAutocompliteWord(){
        findElement(AUTOCOMPLITE_MATHS);
        click(AUTOCOMPLITE_MATHS);
    }
    public void setHobbies(String hobbies){
        String formated = String.format(HOBBIES_LOCATOR,hobbies);
        click(formated);

    }
    public void setState( int numberOfState ){
        String t = String.format(SELECT_STATE_INNER,numberOfState);
        click(t);

    }
    public void setCity(int numberOfCity){
        String t = String.format(SELECT_CITY_INNER,numberOfCity);
        click(t);
    }
    public String finalCheck(){
        String s = getText(FINAL_WORDS);
        return s;
    }







}
