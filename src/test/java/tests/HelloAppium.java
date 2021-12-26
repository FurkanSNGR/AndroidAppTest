package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class HelloAppium {

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

@BeforeMethod
public void setup() throws MalformedURLException {

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("platformName","Android");
    caps.setCapability("app","E:\\My Works\\ciceksepeti_android/deniztrader.apk");
    caps.setCapability("devicename","emulator-5554");
    caps.setCapability("autoGrantPermissions","true");

    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    wait = new WebDriverWait(driver,20);

}

@Test
    public void basicTest() throws InterruptedException {

    By el_adv = By.id("denizbank.android:id/activityTutorial_imageButton_next");
    wait.until(ExpectedConditions.visibilityOfElementLocated(el_adv)).click();

}

@AfterMethod
    public void teardown() {
    driver.close();

}


}
