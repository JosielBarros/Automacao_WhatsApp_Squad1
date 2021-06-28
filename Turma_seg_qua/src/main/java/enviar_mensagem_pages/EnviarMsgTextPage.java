package enviar_mensagem_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class EnviarMsgTextPage {
    private AndroidDriver<MobileElement> driver;

    public EnviarMsgTextPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void paginaMsgText() {
        MobileElement btnNovaConversa  = driver.findElementByAccessibilityId("Nova conversa");
        btnNovaConversa.click();

        MobileElement selecionaContato = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout");
        selecionaContato.click();

        MobileElement campoMsg =  driver.findElementById("com.whatsapp:id/entry");
        campoMsg.sendKeys("Olá, tudo bem?");

        MobileElement enviaMSg =  driver.findElementByAccessibilityId("Enviar");
        enviaMSg.click();
    }
}