package com.krzymianowski.application.model.contact.view_model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
public class ContactForm {

    @NotNull(message = "First name cannot be empty.")
    @Size(min = 3, message = "First name is to short.")
    @Size(max = 30, message = "First name is to large.")
    private String firstName;

    @Size(max = 30, message = "Last name is to large.")
    private String lastName;

    @NotNull(message = "E-mail address cannot be empty.")
    @Email(message = "E-mail address is not valid")
    private String email;

    private String phone;

    @NotNull(message = "Message cannot be empty.")
    @Size(min = 30, message = "Message is to short.")
    private String message;

}
