package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailPassword extends HelloAppium {

    @Test
    public void basicTest() throws InterruptedException {

        By el_adv = By.id("denizbank.android:id/activityTutorial_imageButton_next");
        wait.until(ExpectedConditions.visibilityOfElementLocated(el_adv)).click();

        Thread.sleep(3000);

        MobileElement login = driver.findElementById("denizbank.android:id/layoutMainTab_linearLayout_buysellTab");
        login.click();

        Thread.sleep(1000);
        MobileElement loginId = driver.findElement(By.id("denizbank.android:id/layoutLoginStep1_editText_username"));
        loginId.sendKeys("testerlogin");

        MobileElement pass = driver.findElement(By.id("denizbank.android:id/layoutLoginStep1_editText_password"));
        pass.sendKeys("123456");

        Thread.sleep(2000);

        MobileElement loginBtn = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Seçimi Onayla\"]"));
        loginBtn.click();


    }
}
