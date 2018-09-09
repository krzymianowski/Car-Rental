package com.krzymianowski.application.service.contact;

import com.krzymianowski.application.model.contact.ContactState;

public interface ContactStateService {

    ContactState getOrCreateState(String stateName);
}
