package enviar_mensagem;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import enviar_mensagem_pages.EnviarMsgTextPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class EnviarMensagemTexto {
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
    public void enviarMsgTextTest(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        EnviarMsgTextPage enviarMsg = new EnviarMsgTextPage(driver);
        enviarMsg.paginaMsgText();
        
        String msgEnviada =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView").getText();
        Assert.assertEquals("Olá, tudo bem?", msgEnviada);
        
        String msgCampoVazio= driver.findElementById("com.whatsapp:id/entry").getText();
        Assert.assertEquals("Digite uma mensagem", msgCampoVazio);
    }

    @After
    public void tearDown(){
        driver.navigate().back();
        driver.quit();
    }
}
