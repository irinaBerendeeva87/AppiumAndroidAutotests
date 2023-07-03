package java.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SearchPage extends PageBase{
    public SearchPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "etSearch")
    WebElement searchField;
    @AndroidFindBy(id = "ivBack")
    WebElement backBtn;
    @AndroidFindBy(id= "errorActionTv")
    WebElement mainBackBtn;

    @AndroidFindBy(accessibility = "чайник электрический")
    WebElement item;

    public void enterItemName(String itemName){
        clear(searchField);
        sendText(searchField,itemName);
    }
    public void clickMainBackBtn(){
        click(mainBackBtn);
    }
    public void clickItem(){
        click(item);
    }
    public void clickBackBtn(){
        click(backBtn);
    }
}
