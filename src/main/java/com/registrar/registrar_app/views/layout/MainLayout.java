package com.registrar.registrar_app.views.layout;

import com.registrar.registrar_app.views.main.HomeView;
import com.registrar.registrar_app.views.main.ProfileView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.popover.Popover;
import com.vaadin.flow.component.popover.PopoverPosition;
import com.vaadin.flow.component.popover.PopoverVariant;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;

public class MainLayout extends AppLayout {
    MainLayout(){
        createDrawer();
        createIconAvatarLink();

    }

    private void createDrawer(){
       // DrawerToggle toggle = new DrawerToggle();

        SideNav nav = new SideNav();
        SideNavItem homeLink = new SideNavItem("Home", HomeView.class, VaadinIcon.HOME.create());
        SideNavItem profileLink = new SideNavItem("Profile", ProfileView.class, VaadinIcon.MALE.create());
        SideNavItem recordLink = new SideNavItem("Records", )




        H1 title = new H1("Registrar App"); 
        addToDrawer(nav);


    }

    private void createIconAvatarLink(){
        String name = "Owner";
        String pictureUrl = "";

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

    }

}
