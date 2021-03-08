package com.uniyaz.components;

import com.uniyaz.ui.LayoutUI;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.Position;
import com.vaadin.shared.ui.AlignmentInfo;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.*;

import static com.sun.org.apache.xml.internal.serialize.Method.XHTML;

public class ContentLayout extends HorizontalLayout {
    static Label icerik =new Label();

    Panel panel = new Panel("Panel Containing a Label");

    public String getIcerik() {
        return icerik.getValue();
    }

    public void setIcerik(String DEGER) {
        this.icerik.setValue(DEGER);
    }

    public ContentLayout() {
        Image image = new Image(null,
                new ThemeResource("img/anasayfa.jpg"));

        image.setSizeUndefined();
        image.setWidth("900px");
        image.setHeight("400px");

        setSizeFull();

        String Detayi = ((LayoutUI) UI.getCurrent()).getDetay();
      //  label.setSizeUndefined();
  //      icerik.setValue(Detayi);
 //       addComponent(icerik);

        panel.setSizeFull();
       // panel.setSizeUndefined();
        panel.setWidth("900px");
        panel.setHeight("400px");
        setPanelContent("ANASAYFA");
        addComponent(panel);
        //panel.setSizeUndefined();
       setComponentAlignment(panel, Alignment.TOP_LEFT);


        //HorizontalLayout footerLayout = ((LayoutUI) UI.getCurrent()).getFooterLayout();

    }
    public void setPanelContent(String DEGER) {
        // panel.setWidth("300px");
        if(DEGER.equals("ANASAYFA")){
            panel.setCaption(" ");
            panel.setContent(
                    new Label(
                            "Universal Yazılım\n"+
                                    "Evrensel araçlarla sektörlere özel, uzman ve akıllı çözümler..."));

        }
        if(DEGER.equals("HAKKIMIZDA")){
            panel.setCaption(" ");
            panel.setContent(
                    new Label("Universal, 1990 yılında İstanbul’da kurulmuş, bağımsız bir yazılım üreticisidir."+
                            "Kuruluşundan beri sektörlere özel çözümler üretmeyi hedef olarak seçmiştir.\n"+
                            "Yüzlerce çalışanı ile Bakanlık onaylı ArGe Merkezi olarak İstanbul/Ataşehir de faaliyet göstermektedir.\n\n"+
                            "   Bugün itibarı ile birçok kurumsal müşteriye hizmet veren kuruluşumuz, bu hizmeti, alanlarında eğitimli, uzman kadrosu ile sağlamaktadır.\n"+
                            "Universal, satış ve satış sonrası destek faaliyetlerini tamamen kendi personeli ile gerçekleştirmekte ve müşteri ile aracısız iletişim kurmaktadır.\n "));

        }
        if(DEGER.equals("ILETISIM")){
            panel.setCaption(" ");
            panel.setContent(
                    new Label("Universal Yazılım A.Ş.\n"+
                            "Tüm sorularınız için bizimle iletişime geçebilirsiniz.\n"+
                            "Ataturk Mah. Erzincan Sok. No:28 Ataşehir, İstanbul\n"+
                            "+90 216 456 28 00\n"+
                            "Kayıtlı e-posta:\n"+
                            "universalyazilimas@hs01.kep.tr\n"+
                            "info@uni-yaz.com\n"+
                            "Pzt – Cum 8:00-18:00\n", ContentMode.PREFORMATTED));
        }

    }
}