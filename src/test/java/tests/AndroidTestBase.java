package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTestBase {
    public static AppiumDriver driver;

    public  void Android_setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");//optional
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("GalaxyNexusAPI29");
        options.setPlatformVersion("10");
        options.setApp(System.getProperty("user.dir")+"/apps/Ozon_v.16.8(2347).apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),options);
    }
}
