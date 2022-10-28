package come.cydeo.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {
    AppiumDriver<MobileElement> driver;
    @Test
    public void initialTest() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("deviceName","Pixel 3"); Another way of sending caps
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 3");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //this is where we are telling which application we are testing
        capabilities.setCapability(MobileCapabilityType.APP,"https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        URL url = new URL("http://localhost:4723/wd/hub");

        //Before setting the driver object, we need to set Desired capabilities

        AppiumDriver<MobileElement> driver = new AndroidDriver<>(url,capabilities);
        Thread.sleep(4000);
        driver.closeApp();

    }
}
