package com.registrar.registrar_app.views.error;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("/nothing")
public class ProblemView extends Div {
    ProblemView(){
        setText("There is a problem try reloading the page");
    }
}
