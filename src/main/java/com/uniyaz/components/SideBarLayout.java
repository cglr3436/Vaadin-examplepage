package com.uniyaz.components;

import com.uniyaz.ui.LayoutUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

public class SideBarLayout extends VerticalLayout {

    public SideBarLayout() {

        setSizeFull();
        String erisilecekDegisken = ((LayoutUI) UI.getCurrent()).getErisilecekDegisken();

    //    Label label = new Label();
    //    label.setSizeUndefined();
    //    label.setValue(erisilecekDegisken);
    //    addComponent(label);

     //   setComponentAlignment(label, Alignment.MIDDLE_CENTER);
      //  setSpacing(false);
        Label label=new Label("HOSGELDINIZ ");
        Button buttonl1 = new Button("  ANASAYFA  ");
        buttonl1.setSizeFull();
        //buttonl1.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        buttonl1.addClickListener( e -> {
            ((LayoutUI) UI.getCurrent()).getHeaderLayout().setHeaderlabel("ANASAYFA");
            ((LayoutUI) UI.getCurrent()).getContentLayout().setPanelContent("ANASAYFA");
           // ((LayoutUI) UI.getCurrent()).getContentLayout().setIcerik("ANASAYFA");
        });


        addComponents(buttonl1);
        Button buttonl2 = new Button("HAKKIMIZDA");
        buttonl2.setSizeFull();
        buttonl2.addClickListener( e -> {
            ((LayoutUI) UI.getCurrent()).getHeaderLayout().setHeaderlabel("HAKKIMIZDA");
            ((LayoutUI) UI.getCurrent()).getContentLayout().setPanelContent("HAKKIMIZDA");
           // ((LayoutUI) UI.getCurrent()).setDetay("EKLEMEYE");
          //  ((LayoutUI) UI.getCurrent()).getContentLayout().setIcerik("HAKKIMIZDA");
        });
        addComponents(buttonl2);
        Button buttonl3 = new Button(" ILETISIM ");
        buttonl3.setSizeFull();
        //buttonl3.setSizeUndefined();
        buttonl3.addClickListener( e -> {
            ((LayoutUI) UI.getCurrent()).getHeaderLayout().setHeaderlabel("ILETISIM") ;
            ((LayoutUI) UI.getCurrent()).getContentLayout().setPanelContent("ILETISIM");
          //  ((LayoutUI) UI.getCurrent()).setDetay("GOSTERMEYE");
          //  ((LayoutUI) UI.getCurrent()).getContentLayout().setIcerik("ILETISIM");
        });

        addComponents(buttonl3);
        setComponentAlignment(buttonl3, Alignment.TOP_CENTER);
        setExpandRatio(buttonl1,0.4f);
        setExpandRatio(buttonl2,0.4f);
        setExpandRatio(buttonl3,5.2f);

        //HorizontalLayout footerLayout = ((LayoutUI) UI.getCurrent()).getFooterLayout();

    }
}
