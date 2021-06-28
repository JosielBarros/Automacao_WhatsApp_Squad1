
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
import pages.GrupoSemContatoPage;

public class GrupoSemContato {
    private AndroidDriver<MobileElement>driver;

    @Before 
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "device");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("udid", "emulator-5554");

        URL url = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
    }     

    @Test
    public void gpSemContatoTest(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        GrupoSemContatoPage mapPage = new GrupoSemContatoPage(driver);
        mapPage.paginaGpSemContato();

        String textAdicionarParticipante = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[2]").getText();
        Assert.assertEquals("Adicionar participantes", textAdicionarParticipante);
    }

    @After
    public void tearDown() {
        driver.navigate().back();
        driver.quit();
    }
}





