package com.uniyaz.ui;

import com.uniyaz.components.ContentLayout;
import com.uniyaz.components.FooterLayout;
import com.uniyaz.components.HeaderLayout;
import com.uniyaz.components.SideBarLayout;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.AlignmentInfo;
import com.vaadin.ui.*;

/*
*
* @author Atilla Gökhan KARTAL
* @since
*
*/
@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class LayoutUI extends UI {

    private VerticalLayout mainLayout;



    private HeaderLayout headerLayout;
    private HorizontalLayout bodyLayout;
    private SideBarLayout sideBarLayout;
    private ContentLayout contentLayout;
    private FooterLayout footerLayout;
    private String erisilecekDegisken = "TEST";
    private String Detay="DENEME" ;
    public String getDetay() {
        return Detay;
    }

    public void setDetay(String detay) {
        Detay = detay;
    }


    @Override
    protected void init(VaadinRequest vaadinRequest) {
        buildMainLayout();
        setContent(mainLayout);
    }

    private void buildMainLayout() {

        mainLayout = new VerticalLayout();
        mainLayout.setSizeFull();

        headerLayout = new HeaderLayout();
        mainLayout.addComponent(headerLayout);


        buildBodyLayout();
        mainLayout.addComponent(bodyLayout);
        
        buildFooterLayout();
        mainLayout.addComponent(footerLayout);

        mainLayout.setExpandRatio(headerLayout, 1f);
        mainLayout.setExpandRatio(bodyLayout, 8f);
        mainLayout.setExpandRatio(footerLayout, 1f);


    }

    private void buildContentLayout() {
        contentLayout = new ContentLayout();
       // contentLayout.setSizeFull();



        //contentLayout.setIcerik(content);
       // contentLayout.addComponent(content);
    }

    private void buildSideBarLayout() {

        sideBarLayout = new SideBarLayout();

    }

    private void buildBodyLayout() {

        bodyLayout = new HorizontalLayout();
        bodyLayout.setSizeFull();
       // bodyLayout.setSpacing(false);
       // bodyLayout.setMargin(false);
      //  bodyLayout.setSizeUndefined(); //ORTALAMA
      //  bodyLayout.setSpacing(true);



        buildSideBarLayout();
        bodyLayout.addComponent(sideBarLayout);

        buildContentLayout();
        bodyLayout.addComponent(contentLayout);

        bodyLayout.setSpacing(true);
        bodyLayout.setExpandRatio(sideBarLayout,1f);
        bodyLayout.setExpandRatio(contentLayout,9f);

    }

    private void buildFooterLayout() {
        footerLayout = new FooterLayout();
    }

    public String getErisilecekDegisken() {
        return erisilecekDegisken;
    }
    public String setErisilecekDegisken(String a) {
        erisilecekDegisken=a;
        return erisilecekDegisken;
    }
    public HorizontalLayout getFooterLayout() {
        return footerLayout;
    }

    public ContentLayout getContentLayout() {
        return contentLayout;
    }
    public HeaderLayout getHeaderLayout() {
        return headerLayout;
    }
}