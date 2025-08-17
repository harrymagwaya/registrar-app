package com.registrar.registrar_app.views.login_out;

import com.vaadin.flow.component.html.Paragraph;

import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.BeforeLeaveEvent;
import com.vaadin.flow.router.BeforeLeaveObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Login-page")
@Route("login")
public class LoginView extends HorizontalLayout implements BeforeLeaveObserver{
    LoginView(){
       loginEvent();
       
    }

    private void loginEvent(){
         LoginOverlay loginOverlay = new LoginOverlay();
        loginOverlay.setTitle("Registrar Login");
        loginOverlay.setDescription("Built by mag");

        Paragraph text = new Paragraph("Never tell your password");
        text.addClassNames(LumoUtility.TextAlignment.CENTER, LumoUtility.TextColor.PRIMARY);
        loginOverlay.getFooter().add(text);
        add(loginOverlay);
        loginOverlay.setOpened(true);
    }

    @Override
    public void beforeLeave(BeforeLeaveEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'beforeLeave'");
    }

    
}
