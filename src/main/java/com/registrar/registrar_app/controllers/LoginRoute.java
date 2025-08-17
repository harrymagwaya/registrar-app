package com.registrar.registrar_app.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class LoginRoute {
    // LoginRoute(){ 
    //     UI.getCurrent().navigate(LoginPage.class);
    // }

    @GetMapping("/login")
    RedirectView redirectView(){
        return new RedirectView("/login");
    }
}

// public class LoginRoute implements BeforeEnterListener{
//     private LoginPage login;

//     LoginRoute(LoginForm Login){   
//     }

//     @Override
//     public void beforeEnter(BeforeEnterEvent event) {
       
//         if(){
            
//         }
//     }

// }

