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
import pages.GrupoUmContatoPage;

public class GrupoUmContato {
   private AndroidDriver <MobileElement>driver; 

   @Before 
   public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("WhatsApp", "C:\\Users\\ybrito\\Downloads\\WhatsApp.apk");
    desiredCapabilities.setCapability("deviceName", "device");
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "10.0");
    desiredCapabilities.setCapability("udid", "emulator-5554");

    URL url = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
   }


   @Test 
   public void gpUmContatoTest(){
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       GrupoUmContatoPage mapPage = new GrupoUmContatoPage(driver);
       mapPage.paginaGpUmContato();

       String nomeGrupo = driver.findElementById("com.whatsapp:id/conversation_contact_name").getText();
       Assert.assertEquals("Squad three amigos" , nomeGrupo);
   }

   @After
   public void tearDown() {
       driver.navigate().back();
       driver.quit();
   }
}
