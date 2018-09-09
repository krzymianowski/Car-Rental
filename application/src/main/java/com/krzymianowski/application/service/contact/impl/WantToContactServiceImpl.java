package com.krzymianowski.application.service.contact.impl;

import com.krzymianowski.application.model.contact.ContactState;
import com.krzymianowski.application.model.contact.WantToContact;
import com.krzymianowski.application.model.contact.repository.WantToContactRepository;
import com.krzymianowski.application.model.contact.view_model.ContactForm;
import com.krzymianowski.application.service.contact.ContactStateService;
import com.krzymianowski.application.service.contact.WantToContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class WantToContactServiceImpl implements WantToContactService {

    @Autowired
    private WantToContactRepository wantToContactRepository;

    @Autowired
    private ContactStateService contactStateService;

    @Override
    public void save(ContactForm contactForm) {
        ContactState contactState = contactStateService.getOrCreateState("Unread");

        WantToContact wantToContact = WantToContact.builder()
                .firstName(contactForm.getFirstName())
                .lastName(contactForm.getLastName())
                .email(contactForm.getEmail())
                .phone(contactForm.getPhone())
                .message(contactForm.getMessage())
                .addDate(new Date())
                .state(contactState)
                .build();

        wantToContactRepository.save(wantToContact);
    }
}
