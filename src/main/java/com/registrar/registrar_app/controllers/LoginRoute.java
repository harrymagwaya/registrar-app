package com.registrar.registrar_app.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.registrar.registrar_app.views.login_out.LoginPage;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class LoginRoute{
    LoginRoute(){ 
        UI.getCurrent().navigate(LoginPage.class);
    }

    @GetMapping("/login")
    RedirectView redirectView(){
        return new RedirectView("Login-page") 
    }
}
