package com.registrar.registrar_app.views.main;


import com.registrar.registrar_app.views.layout.MainLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Home")
@Route(value="", layout = MainLayout.class)
public class HomeView extends VerticalLayout 
//implements BeforeEnterObserver
 {
    HomeView(){
        H1 text = new H1("This is home ");
        add(text);
    }
    // @Override
    // public void beforeEnter(BeforeEnterEvent event) {
    //     org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    //     if (authentication == null || !authentication.isAuthenticated()) {
    //         event.forwardTo("login");
    //     }
    // }
    
}
