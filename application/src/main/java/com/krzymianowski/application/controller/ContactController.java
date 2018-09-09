package com.krzymianowski.application.controller;

import com.krzymianowski.application.model.contact.view_model.ContactForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String showContactPage(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "contact";
    }

    @PostMapping("/contact")
    public String addWantToContact(
            @ModelAttribute("contactForm") @Validated ContactForm contactForm,
            BindingResult result) {

        if (result.hasErrors())
            return "contact";

        return "redirect:/";
    }
}
