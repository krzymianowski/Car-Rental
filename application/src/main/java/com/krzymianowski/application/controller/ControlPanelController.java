package com.krzymianowski.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control-panel")
public class ControlPanelController {

    @GetMapping
    public String showControlPanel() {
        return "control-panel";
    }
}
