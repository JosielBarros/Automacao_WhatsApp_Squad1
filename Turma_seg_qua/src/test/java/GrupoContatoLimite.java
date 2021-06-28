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
import pages.GrupoContatoLimitePage;

public class GrupoContatoLimite {
    private AndroidDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException{
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "device");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("udid", "emulator-5554");

        URL url = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<>(url, desiredCapabilities);
    }

    @Test
    public void GpLimiteContato(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        GrupoContatoLimitePage mapPage = new GrupoContatoLimitePage(driver);
        mapPage.paginaGpLimiteContato();

        String nomeGrupo =  driver.findElementById("com.whatsapp:id/conversation_contact_name").getText();
        Assert.assertEquals("Squad1_Teste", nomeGrupo);
    }

    @After
    public void tearDown() {
        driver.navigate().back();
        driver.quit();
    }
    
}