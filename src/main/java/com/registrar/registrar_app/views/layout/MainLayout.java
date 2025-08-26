package com.registrar.registrar_app.views.layout;

import com.registrar.registrar_app.views.main.HomeView;
import com.registrar.registrar_app.views.main.ProfileView;
import com.registrar.registrar_app.views.main.RecordView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ScrollOptions.Alignment;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.VaadinIcon;

import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.popover.Popover;
import com.vaadin.flow.component.popover.PopoverPosition;
import com.vaadin.flow.component.popover.PopoverVariant;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.RouterLink;

public class MainLayout extends AppLayout {
    MainLayout(){
        createDrawer();
        //createIconAvatarLink();
        //createHeaders();

    }

    private void createDrawer(){
        DrawerToggle toggle = new DrawerToggle();

        SideNav nav = new SideNav();

        SideNavItem homeLink = new SideNavItem("Home", HomeView.class, VaadinIcon.HOME.create());
         SideNavItem profileLink = new SideNavItem("Profile", ProfileView.class, VaadinIcon.MALE.create());
         SideNavItem recordLink = new SideNavItem("Records", RecordView.class, VaadinIcon.RECORDS.create());

        nav.addItem(homeLink, recordLink, profileLink);

        H1 logo = new H1("Registrar App"); 
        logo.addClassNames("text-l", "m-m");
        
      Scroller scroller = new Scroller(nav);
      HorizontalLayout header = new HorizontalLayout(toggle, logo, createIconAvatarLink());
      header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
      header.expand(logo);
      header.setWidthFull();
      header.addClassNames("py-0", "px-m");
    
        addToDrawer(scroller);
        addToNavbar(header);

    }


    // private void createHeaders(){
    //     RouterLink homeLink = new RouterLink("Home", HomeView.class);
    //     RouterLink recordsLink = new RouterLink("Records", RecordView.class);
    //     RouterLink profileLink = new RouterLink("Profile", ProfileView.class);

    //     addToDrawer(new VerticalLayout(
    //         homeLink,
    //         recordsLink,
    //         profileLink
    //     ));


    // }

    private Component createIconAvatarLink(){

        HorizontalLayout allComp = new HorizontalLayout();

        String name = "Owner";
        String pictureUrl = "static/images/avatar-generations_rpge.jpg";

        Avatar avatar = new Avatar(name);
        avatar.setImage(pictureUrl);
        avatar.getStyle().set("display", "block");
        avatar.getStyle().set("cursor", "Pointer");
        avatar.getElement().setAttribute("tabindex", "-1");

        Button button = new Button(avatar);
        button.addThemeVariants(ButtonVariant.LUMO_ICON, ButtonVariant.LUMO_TERTIARY_INLINE);
        button.getStyle().set("margin", "var(--lumo-space-s)");
        button.getStyle().set("margin-inline-start", "auto");
        button.getStyle().set("border-radius", "50%");

        Popover popover = new Popover();
        popover.setModal(true);
        popover.setOverlayRole("menu");
        popover.setAriaLabel("User menu");
        popover.setTarget(button);
        popover.setPosition(PopoverPosition.BOTTOM);
        popover.addThemeVariants(PopoverVariant.LUMO_NO_PADDING);

        

        HorizontalLayout userInfo  = new HorizontalLayout();
        userInfo.addClassName("userMenu");
        userInfo.setSpacing(true);

        VerticalLayout nameLayout = new VerticalLayout();
        nameLayout.setSpacing(false);
        nameLayout.setPadding(true);

        nameLayout.add(name);

        VerticalLayout linksLayout = new VerticalLayout();
        linksLayout.setSpacing(false);
        linksLayout.setPadding(false);
        linksLayout.addClassName("linksMenu");

        Anchor profile = new Anchor("#", "User Profile");
        profile.getElement().setAttribute("role", "menuitem");

        Anchor logOut = new Anchor("#", "Log out");

        linksLayout.add(profile, logOut);



        // userInfo.add(avatar, nameLayout);

        // popover.add(userInfo);

       

        // allComp.add(button, popover);

    
        return button;

    }

}
