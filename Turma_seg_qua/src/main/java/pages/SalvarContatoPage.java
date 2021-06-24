package pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SalvarContatoPage {
    private AndroidDriver<MobileElement> driver;

    public SalvarContatoPage (AndroidDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void paginaSalvarContato(){
        MobileElement whatsApp = (MobileElement) driver.findElementByAccessibilityId("WhatsApp");
        whatsApp.click();

        MobileElement btnNovaConversa = (MobileElement) driver.findElementByAccessibilityId("Nova conversa");
        btnNovaConversa.click();

        MobileElement btnNovoConato = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout");
        btnNovoConato.click();

        MobileElement nome = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]");
        nome.sendKeys("Josiel Teste1");

        driver.navigate().back();
        
        MobileElement telefone = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
        telefone.sendKeys("11 9 11000002");

        MobileElement btnSalvar = (MobileElement) driver.findElementById("com.android.contacts:id/editor_menu_save_button");
        btnSalvar.click();
    }
    
}