package com.registrar.registrar_app.views.main;


import com.registrar.registrar_app.models.Students;
import com.registrar.registrar_app.views.layout.MainLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Records")
@Route(value = "records", layout = MainLayout.class)
public class RecordView extends VerticalLayout {
    Grid<Students> grid = new Grid<>();
    TextField filterText = new TextField();
    RecordView(){

       
        H1 text =new H1("These are records");
        add(text);
    }
}
