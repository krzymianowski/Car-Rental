package com.krzymianowski.application.service.contact.impl;

import com.krzymianowski.application.model.contact.ContactState;
import com.krzymianowski.application.model.contact.repository.ContactStateRepository;
import com.krzymianowski.application.service.contact.ContactStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactStateServiceImpl implements ContactStateService {

    @Autowired
    private ContactStateRepository contactStateRepository;

    @Override
    public ContactState getOrCreateState(String stateName) {
        ContactState contactState = contactStateRepository.getStateByStateName(stateName);
        if (contactState == null) {
            contactState = ContactState.builder().stateName(stateName).build();
            contactStateRepository.save(contactState);
        }
        return contactState;
    }
}
