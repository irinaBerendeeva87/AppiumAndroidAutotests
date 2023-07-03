package java.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LocationPage extends PageBase{
    public LocationPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(id = "valueTav")
    WebElement changeLocationBtn;
    @AndroidFindBy(id= "search_src_text")
    WebElement cityNameTxt;
    @AndroidFindBy(xpath ="//android.widget.FrameLayout[2]")
    WebElement newCityName;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Выбрать на карте')]")
    WebElement choseCityBtn;

    public void clickChangeLocationBtn(){
        click(changeLocationBtn);
    }

    public void enterCityName(String cityName){
        sendText(cityNameTxt,cityName);
    }

    public void clickNewCity(){
        waitForVisibility(newCityName);
        click(newCityName);
    }

    public void clickChoseCityBtn(){
        waitForVisibility(choseCityBtn);
        click(choseCityBtn);
    }
}
