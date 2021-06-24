/*package Pages;

import java.beans.Transient;

import io.appium.java_client.MobileElement;
import jdk.jfr.Timestamp;

public class AdicionarContatoPage {
    mobile = ()
    driver = whats

    @Before
    public void setUp(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapabilities(capabilityName("Whatsapp",value: "C:\\docs\\Aulas Projetos\\WhatsApp.apk"));
        desiredCapabilities.setCapabilities(capabilityName("deviceName",value:"device"));
        desiredCapabilities.setCapabilities(capabilityName("platformName",value:"Android"));
        desiredCapabilities.setCapabilities(capabilityName("platformVersion",value:"10.0"));
        desiredCapabilities.setCapabilities(capabilityName("udid",value:"emulator-5554"));

        driver = new AndroidDriver<MobileElement>();

    }

    @Test 
    public void whatsTest(){

        MobileElement cliqueWhats = driver.findElement(By.xpath("//android.widget.TextView[@content-desc="WhatsApp"]")).click();
        MobileElement novaConversa = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc="Nova conversa"]")).click();
        MobileElement addContato = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout")).click();
        MobileElement nome = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]")).sendKeys("Sami");
        MobileElement telefone = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")).sendKeys("19 99999999");
        MobileElement salvar = driver.findElement(By.xpath("com.android.contacts:id/editor_menu_save_button")).click();

    }
    @After
    public void tearDow(){
        driver.quit();
    }


   
}*/
