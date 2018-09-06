package com.krzymianowski.application.controller;

import com.krzymianowski.application.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TempFileUploadController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/upload")
    public String upload() {
        return "temp-file-upload";
    }

    @PostMapping("/upload")
    public String saveFiles(
            @RequestParam(name = "files") MultipartFile[] files,
            RedirectAttributes redirectAttributes) {

        for (MultipartFile file : files) {
            storageService.store(file);
            System.out.println("Stored file: " + file.getOriginalFilename());
        }

        redirectAttributes.addFlashAttribute("message", "Done!");
        return "redirect:/upload";
    }

}
