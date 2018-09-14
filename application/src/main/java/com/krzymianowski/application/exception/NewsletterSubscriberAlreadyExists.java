package com.krzymianowski.application.exception;

public class NewsletterSubscriberAlreadyExists extends RuntimeException {

    public NewsletterSubscriberAlreadyExists(String message) {
        super(message);
    }

    public NewsletterSubscriberAlreadyExists(String message, Throwable cause) {
        super(message, cause);
    }
}
