import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Class {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("automationName", "UIAutomator2");
    desiredCapabilities.setCapability("appPackage", "com.whatsapp");
    desiredCapabilities.setCapability("appActivity", "com.whatsapp.Main");
    desiredCapabilities.setCapability("platformVersion", "10.0");
    desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
    desiredCapabilities.setCapability("udid", "emulator-5554");
    desiredCapabilities.setCapability("deviceName", "device");

  

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementById("com.whatsapp:id/entry");
    el2.sendKeys("Olá");
    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Enviar");
    el3.click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
