package com.registrar.registrar_app.views.main;

import com.registrar.registrar_app.views.layout.MainLayout;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.avatar.AvatarVariant;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "/profile", layout = MainLayout.class)
public class ProfileView extends VerticalLayout {
    private void Profile(){
        Avatar avatarImage = new Avatar();
        avatarImage.addThemeVariants(AvatarVariant.LUMO_XLARGE);

        Span name = new Span("My name");

        add(avatarImage, name);

    }
}
