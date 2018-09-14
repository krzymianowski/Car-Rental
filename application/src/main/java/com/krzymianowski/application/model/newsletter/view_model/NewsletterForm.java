package com.krzymianowski.application.model.newsletter.view_model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
public class NewsletterForm {

    @NotNull(message = "Name cannot be empty.")
    @Size(min = 3, message = "First name is to short.")
    @Size(max = 30, message = "First name is to large.")
    private String subscriberName;

    @NotNull(message = "E-mail address cannot be empty.")
    @Email(message = "E-mail address is not valid")
    private String subscriberEmail;

}


