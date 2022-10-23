package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.SelenoidConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SelenoidMobileDriver implements WebDriverProvider {

    static SelenoidConfig config = ConfigFactory.create(SelenoidConfig.class);

    public static URL getAppiumServerURL() {
        String url = System.getProperty("selenoidURL", config.selenoidURL());
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        String device = System.getProperty("selenoidDevice", config.selenoidDevice());
        String osVersion = System.getProperty("selenoidOSVersion", config.selenoidOSVersion());

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", device);
        desiredCapabilities.setCapability("version", osVersion);
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "org.wikipedia.alpha");
        desiredCapabilities.setCapability("appActivity", "org.wikipedia.main.MainActivity");
        desiredCapabilities.setCapability("app", apkUrl());

        return new AndroidDriver(getAppiumServerURL(), desiredCapabilities);
    }

    private URL apkUrl() {
        try {
            return new URL("https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/app-alpha-universal-release.apk");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
