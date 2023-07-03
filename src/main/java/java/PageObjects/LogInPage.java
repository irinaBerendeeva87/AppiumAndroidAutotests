package java.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LogInPage extends PageBase {
    public LogInPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    @AndroidFindBy(id = "closeFlowButton")
    WebElement closeFlowBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Вернуться на главный экран')]")
    WebElement  returnBackBtn;
//add phoneNumber
    @AndroidFindBy(id = "countrySelector")
    WebElement countrySelector;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Россия +7')")
    WebElement rusCountryCode;
    @AndroidFindBy(id= "credentialsInputEditText")
    WebElement userNumberTxt;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Получить код')]")
    WebElement codeNumBtn;
    @AndroidFindBy(id = "titleTextAtomV2")
    WebElement addPhoneNumTxt;
//add email
    @AndroidFindBy(id = "hintButtonsLinearLayout")
    WebElement  loginWithEmailBtn;
    @AndroidFindBy(id = "credentialsInputEditText")
    WebElement userEmailTxt;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Ваш аккаунт деактивирован')]")
    WebElement acDeactivTxt;
//    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Получить код')]")
//    WebElement emailCodeBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Вернуться на главный экран')]")
    WebElement backToMainBtn;
//errors
    @AndroidFindBy(id = "textinput_error")
    WebElement errorEmptyPhoneTxt;
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@hint, 'Электронная почта, Заполните почту')]")
    WebElement errorEmptyEmailTxt;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Некорректный формат телефона')]")
    WebElement incorrectPhoneTxt;
    @AndroidFindBy(id = "otpEditText")
    WebElement codeField;
//разрешение на автоввод кода
    @AndroidFindBy(id = "ru.ozon.app.android:id/skipButton")
    WebElement assesSkipBtn;
    @AndroidFindBy(id = "permission_allow_button")
    WebElement allowBtn;

//        Methods
    public void clickAllowBtn(){
        click(allowBtn);
    }
    public void clickCloseFlowBtn(){
        click(closeFlowBtn);
    }
    public void clickCountrySelector(){
        click(countrySelector);
    }
    public void clickRusCountryCode(){
        click(rusCountryCode);
    }
    public void enterUserNumber(String number){
        sendText(userNumberTxt, number);
    }
    public void clickCodeNumBtn(){
        click(codeNumBtn);
    }
    public String getErrorPhoneText(){
        return errorEmptyPhoneTxt.getAttribute("text");
    }
    public void clickAssesSkipBtn(){
        waitForVisibility(assesSkipBtn);
        click(assesSkipBtn);
    }
    public void enterUserEmail(String userEmail){
        click(userEmailTxt);
        sendText(userEmailTxt, userEmail);
    }
    public void enterCodeField(String code){
        waitForVisibility(codeField);
        sendText(codeField, code);
    }
    public void clickLoginWithEmailBtn(){
        click(loginWithEmailBtn);
    }
    public String getText(){
        return getAttribute(acDeactivTxt, "text");
    }
    public String getErrorTextEmail(){
        return getAttribute(errorEmptyEmailTxt, "text");
    }
    public void clickReturnBackBtn(){
        waitForVisibility(returnBackBtn);
        click(returnBackBtn);
    }
    public String getMainText(){
        waitForVisibility(addPhoneNumTxt);
        return getAttribute(addPhoneNumTxt, "text");
    }
}
