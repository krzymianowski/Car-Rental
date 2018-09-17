package com.krzymianowski.application.service.newletter.impl;

import com.krzymianowski.application.exception.NewsletterSubscriberAlreadyExists;
import com.krzymianowski.application.model.newsletter.Subscriber;
import com.krzymianowski.application.model.newsletter.repository.SubscriberRepository;
import com.krzymianowski.application.model.newsletter.view_model.NewsletterForm;
import com.krzymianowski.application.service.newletter.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @Override
    public void save(NewsletterForm newsletterForm) throws NewsletterSubscriberAlreadyExists {
        int sub = subscriberRepository.countByEmail(newsletterForm.getSubscriberEmail());
        if (sub == 0) {
            Subscriber subscriber = Subscriber.builder()
                    .name(newsletterForm.getSubscriberName())
                    .email(newsletterForm.getSubscriberEmail())
                    .isEnabled(true)
                    .build();
            subscriberRepository.save(subscriber);
        } else throw new NewsletterSubscriberAlreadyExists("Subscriber with this e-mail already exists.");
    }
}
