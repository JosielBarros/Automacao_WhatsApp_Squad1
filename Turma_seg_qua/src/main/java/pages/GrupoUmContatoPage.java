package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class GrupoUmContatoPage {
    private AndroidDriver <MobileElement> driver;

    public GrupoUmContatoPage(AndroidDriver <MobileElement> driver){
        this.driver = driver;
    }

    public void paginaGpUmContato(){
        MobileElement btnNovaConversa = driver.findElementByAccessibilityId("Nova conversa");
        btnNovaConversa.click();
 
        MobileElement novoGrupo =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout");
        novoGrupo.click();
 
        MobileElement contatoSelecionado =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout");
        contatoSelecionado.click();
 
        MobileElement btnAvancar = driver.findElementByAccessibilityId("Avançar");
        btnAvancar.click();
 
        MobileElement el7 = driver.findElementById("com.whatsapp:id/group_name");
        el7.sendKeys("Squad three amigos");
 
        MobileElement btnCriarGrupo = driver.findElementByAccessibilityId("Criar");
        btnCriarGrupo.click();
    }
}
