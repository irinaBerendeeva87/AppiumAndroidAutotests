package tests;


import org.testng.annotations.Test;

import java.PageObjects.LocationPage;
import java.PageObjects.MainPage;
import java.PageObjects.MapPage;
import java.net.MalformedURLException;

import static org.testng.Assert.assertEquals;

public class AndroidLocationTest extends AndroidTestBase {
    MainPage mainPage;
    LocationPage locationPage;
    MapPage mapPage;
    static final String CITY_MOSCOW = "Москва";

    @Test
    public void changeToCityName() throws MalformedURLException {
        Android_setUp();
        mainPage = new MainPage(driver);
        locationPage =new LocationPage(driver);
        mainPage.clickLocationTitle();
        locationPage.clickChangeLocationBtn();
        locationPage.enterCityName(CITY_MOSCOW);
        locationPage.clickNewCity();
        mainPage.scrollToEnd();
        assertEquals("Москва", mainPage.getTitle());
    }

    @Test
    public void AllowPermissionOnMap() throws MalformedURLException {
        Android_setUp();
        mainPage = new MainPage(driver);
        locationPage =new LocationPage(driver);
        mapPage = new MapPage(driver);
        mainPage.clickLocationTitle();
        locationPage.clickChoseCityBtn();
        mapPage.clickPermissionAllowBtn();
        mapPage.clickBackBtn();
        assertEquals("Нидерланды", mainPage.getTitle());
    }

    @Test
    public void DenyPermissionOnMap() throws MalformedURLException {
        Android_setUp();
        mainPage = new MainPage(driver);
        locationPage =new LocationPage(driver);
        mapPage = new MapPage(driver);
        mainPage.clickLocationTitle();
        locationPage.clickChoseCityBtn();
        mapPage.clickPermissionDenyBtn();
        mapPage.clickSearchIcon();
        mapPage.clickSearchField();
        mapPage.enterCityName("Крупской, 5");
        mapPage.clickFirstCity();
        driver.navigate().back();
        mapPage.clickConfirmBtn();
        mainPage.scrollToEnd();
        assertEquals("ул. Крупской, 5", mainPage.getRightTitle());
    }
}
