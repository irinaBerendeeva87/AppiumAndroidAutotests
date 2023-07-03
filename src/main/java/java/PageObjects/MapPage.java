package java.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MapPage extends PageBase {

    public MapPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Allow only while using the app')]")
    WebElement permissionAllowBtn;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Deny')]")
    WebElement permissionDenyBtn;
    @AndroidFindBy(accessibility = "Назад")
    WebElement backBtn;
    @AndroidFindBy(id = "searchIconIv")
    WebElement searchIcon;
    @AndroidFindBy(id = "fieldEt")
    WebElement searchField;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'Выбрать: улица Крупской, 5'][1]")
    WebElement firstAddress;
    @AndroidFindBy(id = "suggestionsRv")
    WebElement searchResult;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Заберу отсюда')]")
    WebElement confirmBtn;

    public void clickPermissionAllowBtn() {
        click(permissionAllowBtn);
    }
    public void clickPermissionDenyBtn(){
        click(permissionDenyBtn);
    }
    public void clickBackBtn(){
        click(backBtn);
    }
    public void clickSearchIcon(){
        click(searchIcon);
    }
    public void clickSearchField(){
        click(searchField);
    }
    public void enterCityName(String cityName){
        sendText(searchField, cityName);
    }
    public void clickFirstCity(){
        waitForVisibility(searchResult);
        click(firstAddress);
    }
    public void clickConfirmBtn(){
        waitForVisibility(confirmBtn);
        click(confirmBtn);
    }
}
