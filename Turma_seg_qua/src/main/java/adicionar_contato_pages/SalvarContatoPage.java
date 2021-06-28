package adicionar_contato_pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SalvarContatoPage {
    private AndroidDriver<MobileElement> driver;

    public SalvarContatoPage (AndroidDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void paginaSalvarContato(){
        MobileElement btnNovaConversa =  driver.findElementByAccessibilityId("Nova conversa");
        btnNovaConversa.click();

        MobileElement btnNovoContato =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout");
        btnNovoContato.click();

        MobileElement nome =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]");
        nome.sendKeys("Josiel Teste1");

        driver.navigate().back();
        
        MobileElement telefone =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
        telefone.sendKeys("11 9 11000002");

        MobileElement btnSalvar = driver.findElementById("com.android.contacts:id/editor_menu_save_button");
        btnSalvar.click();
    }
    
}