package java.PageObjects;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MainPage extends PageBase{
    public MainPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "searchTv")
    WebElement searchBtn;
    @AndroidFindBy(id = "titleTav")
    WebElement locationTitle;
    @AndroidFindBy(id ="rightTitleTv")
    WebElement rightTitle;
    @AndroidFindBy(id = "bannerFl")
    WebElement loginBtn;

    public void clickSearchBtn(){
        click(searchBtn);
    }

    public void clickLocationTitle(){
        click(locationTitle);
    }

    public String getTitle() {
        return locationTitle.getAttribute("text");
    }
    public String getRightTitle(){
        return rightTitle.getAttribute("text");
    }

    public void clickLoginPageBtn(){
        click(loginBtn);
    }

    public void scrollToEnd(){
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0
            ));
        } while (canScrollMore);
    }


}
