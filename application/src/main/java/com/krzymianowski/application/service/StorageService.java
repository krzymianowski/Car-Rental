package com.krzymianowski.application.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;

public interface StorageService {

    void init();

    void store(MultipartFile file);

    void deleteAll();

    Path load(String fileName);

    Resource loadAsResource(String fileName);
}
