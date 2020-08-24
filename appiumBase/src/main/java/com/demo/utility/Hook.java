package com.demo.utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hook {
    private static WebDriver driver;

    @Before("@appium")
    public void setUpApppium() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"Calculator_v1.10.9_apkpure.com.apk");
        driver = new AndroidDriver<MobileElement>(new URL("https//0.0.0.0.4723"),cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("before");
    }
    @After
    public void
    tearDown(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
