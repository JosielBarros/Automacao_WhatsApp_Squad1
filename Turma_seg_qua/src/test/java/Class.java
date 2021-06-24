
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Class {

    private AndroidDriver<MobileElement> driver;

    @Test 
    public void sampleTest() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("Whatsapp", "C:\\docs\\Aulas Projetos\\WhatsApp.apk");
        desiredCapabilities.setCapability("deviceName", "device");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("udid", "emulator-5554");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("WhatsApp");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout");
        el3.click();

        MobileElement el4 = (MobileElement) driver.findElementById("com.whatsapp:id/entry");
        el4.sendKeys("Se você recebeu essa mensagem é porque a automação está funcionando!!!! SUCESSOOOOOOOOO");
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Enviar");
        el5.click();

        SalvarContato ct = new SalvarContato();
        ct.salvarContatoTest();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
