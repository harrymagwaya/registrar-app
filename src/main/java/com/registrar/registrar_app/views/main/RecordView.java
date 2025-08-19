package com.registrar.registrar_app.views.main;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class RecordView extends VerticalLayout {
    RecordView(){
        H1 text =new H1("These are records");
        add(text);
    }
}
