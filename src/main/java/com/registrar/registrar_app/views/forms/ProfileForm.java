package com.registrar.registrar_app.views.forms;

import com.registrar.registrar_app.models.Status;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

public class ProfileForm extends FormLayout{
    TextField name = new TextField("Name");
    TextField lastName = new TextField("Last name");
    EmailField email = new EmailField("Email");
    NumberField employeeId = new NumberField();
    NumberField phoneNumber = new NumberField("Phone Number");
    ComboBox <Status> status = new ComboBox<>();
    TextArea description = new TextArea("About me");



    Button save = new Button("Save");

    private Image profilePicture = new Image();

     void profilePictureUpload(){
         MemoryBuffer buffer = new MemoryBuffer();

        // UploadHandler upload = UploadHandler.toTempFile((uploadMetadata, file)-> )
      
        
     }

}
