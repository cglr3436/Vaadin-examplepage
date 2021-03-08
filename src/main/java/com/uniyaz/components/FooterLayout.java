package com.uniyaz.components;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class FooterLayout extends HorizontalLayout {

    public FooterLayout() {
        setSizeFull();

        Label label = new Label("Universal Yazılım A.Ş. © Bu web sitesinde bulunan materyal ve içeriklerin tüm hakları saklıdır.");
        addComponent(label);
        label.setSizeUndefined();
        setComponentAlignment(label, Alignment.MIDDLE_CENTER);
    }




}
