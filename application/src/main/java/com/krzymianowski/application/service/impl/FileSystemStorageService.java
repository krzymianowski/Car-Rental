package com.krzymianowski.application.service.impl;

import com.krzymianowski.application.exception.StorageException;
import com.krzymianowski.application.service.StorageService;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileSystemStorageService implements StorageService {

    private final Path storageLocation = Paths.get("upload");

    @Override
    public void init() {
        try {
            Files.createDirectories(storageLocation);
        } catch (IOException e) {
            throw new StorageException("Could not initialize storage.", e);
        }
    }

    @Override
    public void store(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try{
            if (file.isEmpty())
                throw new StorageException("Failed to store empty file: " + fileName);
            if (fileName.contains("..")) //security check
                throw new StorageException("Cannot store file with relative path outside current directory: " + fileName);
            try(InputStream inputStream = file.getInputStream()){
                Files.copy(inputStream, storageLocation.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e){
            throw new StorageException("Failed to store file: " + fileName, e);
        }
    }

    @Override
    public void deleteAll() {
        FileSystemUtils.deleteRecursively(storageLocation.toFile());
    }

}
