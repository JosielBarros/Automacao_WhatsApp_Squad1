package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GrupoContatoLimitePage {
    private AndroidDriver<MobileElement> driver;

    public GrupoContatoLimitePage(AndroidDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void paginaGpLimiteContato(){
        MobileElement btnNovaConversa = driver.findElementByAccessibilityId("Nova conversa");
        btnNovaConversa.click();

        MobileElement btnNovoGrupo = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
        btnNovoGrupo.click();



        for (int i = 1; i <=3; i++) {
            MobileElement selecionarContato = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout["+i+"]/android.widget.LinearLayout");
            selecionarContato.click();

        }

        MobileElement btnAvancar = (MobileElement) driver.findElementByAccessibilityId("Avançar");
        btnAvancar.click();

        MobileElement nomeGrupo = (MobileElement) driver.findElementById("com.whatsapp:id/group_name");
        nomeGrupo.sendKeys("Squad1_Teste");

        MobileElement btnCriarGrupo = (MobileElement) driver.findElementByAccessibilityId("Criar");
        btnCriarGrupo.click();
    }
}
