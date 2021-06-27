package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GrupoSemContatoPage {
    private AndroidDriver <MobileElement> driver;

    public GrupoSemContatoPage(AndroidDriver <MobileElement> driver){
        this.driver = driver;
    }

    public void paginaGpSemContato(){
        MobileElement whatsApp = driver.findElementByAccessibilityId("WhatsApp");
        whatsApp.click();
        
        MobileElement btnNovaConversa = driver.findElementByAccessibilityId("Nova conversa");
        btnNovaConversa.click();

        MobileElement btnNovoGrupo = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
        btnNovoGrupo.click();

        MobileElement btnAvancar = driver.findElementByAccessibilityId("Avançar");
        btnAvancar.click();
    }

}
