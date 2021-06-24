
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.SalvarContatoPage;

public class SalvarContato {

    private AndroidDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "device");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("udid", "emulator-5554");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<>(remoteUrl, desiredCapabilities);
    }

    @Test
    public void salvarContatoTest() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        SalvarContatoPage c = new SalvarContatoPage(driver);
        c.paginaSalvarContato();

        String nomeContato = driver.findElementById("com.android.contacts:id/large_title").getText();
        Assert.assertEquals("Josiel Teste1", nomeContato);        
        
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
