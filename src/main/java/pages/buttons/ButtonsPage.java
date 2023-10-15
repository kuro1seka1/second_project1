package pages.buttons;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ButtonsPage extends BasePage {
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }
    public static final String DYNAMIC_BTN ="//div/button[text()='Click Me']";
    public static final String DOUBLE_CLICK_BTN ="//button[@id='doubleClickBtn'][text()='Double Click Me']";
    public static final String RIGHT_CLICK_BTN = "//div/button[@id='rightClickBtn']";

    public static final  String DOUBLE_TEXT_CHECK = "//p[@id='doubleClickMessage'][text()='You have done a double click']";
    public static final String DOUBLE_CLICK_TEXT= "You have done a double click";

    public static final String RIGHT_CLICK_TEXT_CHECK ="//p[@id='rightClickMessage'][text()]";
    public static final String RIGHT_CLICK_TEXT ="You have done a right click";

    public static final String DYNAMIC_CLICK_TEXT_CHECK = "//p[@id='dynamicClickMessage'][text()]";

    public static final String DYNAMIC_CLICK_TEXT = "You have done a dynamic click";
    public void clickDoubleClickBtn(){
        doubleClick(DOUBLE_CLICK_BTN);
    }
    public void clickRightBtn(){
        rightClick(RIGHT_CLICK_BTN);
    }
    public void clickDynamicBtn(){
        click(DYNAMIC_BTN);
    }


}
