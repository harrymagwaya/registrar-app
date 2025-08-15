package com.registrar.registrar_app.views.login_out;

import org.springframework.stereotype.Component;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Login-page")
@Route("")
public class LoginPage extends HorizontalLayout{
    LoginPage(){
        LoginOverlay loginOverlay = new LoginOverlay();
        loginOverlay.setTitle("Registrar Login");
        loginOverlay.setDescription("Built by mag");
        LoginForm login = new LoginForm();
     

        Paragraph text = new Paragraph();
        text.addClassNames(LumoUtility.TextAlignment.CENTER, LumoUtility.TextColor.PRIMARY);
        loginOverlay.getFooter().add(text);

        add(login);
    }
}
