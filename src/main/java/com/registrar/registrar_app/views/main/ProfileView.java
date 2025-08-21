package com.registrar.registrar_app.views.main;

import com.registrar.registrar_app.models.Status;
import com.registrar.registrar_app.views.layout.MainLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.avatar.AvatarVariant;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.streams.UploadHandler;

@PageTitle("Profile")
@Route(value = "profile", layout = MainLayout.class)
public class ProfileView extends VerticalLayout {
    private void Profile(){
        Avatar avatarImage = new Avatar();
        avatarImage.addThemeVariants(AvatarVariant.LUMO_XLARGE);

        H1 name = new H1("My profile");

        Button editProfile = new Button("Edit Profile");
        editProfile.addClickListener(e -> new ProfileForm());

        

        add(name);

    }
}

class ProfileForm extends FormLayout{

    TextField name = new TextField("Name");
    TextField lastName = new TextField("Last name");
    EmailField email = new EmailField("Email");
    NumberField number = new NumberField("Phone Number");
    ComboBox <Status> status = new ComboBox<>();
    TextArea description = new TextArea("About me");


    Button save = new Button("Save");

    private Image profilePicture = new Image();

     void profilePictureUpload(){
         MemoryBuffer buffer = new MemoryBuffer();

         UploadHandler upload = UploadHandler.toTempFile((uploadMetadata, file)-> )

            
        
     }

    
}
