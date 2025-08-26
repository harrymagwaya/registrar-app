package com.registrar.registrar_app.views.forms;

import java.io.ObjectInputFilter.Status;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.theme.lumo.Lumo;

public class StudentsForm  extends FormLayout{
    
    Image profImage = new Image();
    TextField firstName = new TextField();
    TextField lastName = new TextField(); 
    DatePicker dateOfBirth = new DatePicker();

    
    TextField academicQualification = new TextField();

    ComboBox <Status> isApplicationFeePaid = new ComboBox<>();

    ComboBox <Status> statusOfApplicant = new ComboBox<>();

    Button save =new Button();
    Button delete = new Button();
    Button cancel = new Button();

    //name, dob, currr academic, academ doc, course applied for, application fee , status of app

    private Component createButtonsComponent(){
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
        cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        Span status = new Span();
        status.setVisible(false);

        ConfirmDialog dialog = new ConfirmDialog();
        dialog.setHeader("unsaved changes");
        dialog.setText("There are missing slots and unsaved changes do ");

        return new HorizontalLayout();
    }

    

    

}
