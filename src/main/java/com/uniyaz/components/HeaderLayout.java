package com.uniyaz.components;

import com.uniyaz.ui.LayoutUI;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.*;

public class HeaderLayout extends HorizontalLayout {
    Label headerlabel = new Label("Universal Yazılım ");
    public HeaderLayout() {



        setSizeFull();

        Image image = new Image(null,
                new ThemeResource("img/logo.jpg"));

        image.setSizeUndefined();
        image.setWidth("94px");
        image.setHeight("77px");

        String erisilecekDegisken = ((LayoutUI) UI.getCurrent()).getErisilecekDegisken();
        addComponent(image);
        addComponent(headerlabel);
        headerlabel.setSizeUndefined();
        setComponentAlignment(headerlabel, Alignment.MIDDLE_LEFT);

        setExpandRatio(image,4f);
        setExpandRatio(headerlabel,6f);
        //HorizontalLayout footerLayout = ((LayoutUI) UI.getCurrent()).getFooterLayout();

    }
    public void setHeaderlabel(String DEGER) {
            headerlabel.setValue(DEGER);


    }

}