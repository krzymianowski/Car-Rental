package com.krzymianowski.application.model.newsletter.repository;

import com.krzymianowski.application.model.newsletter.Subscriber;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, Integer> {

    int countByEmail(String email);
}
