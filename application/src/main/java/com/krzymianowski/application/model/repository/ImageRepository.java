package com.krzymianowski.application.model.repository;

import com.krzymianowski.application.model.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends CrudRepository<Image, Integer> {

    Image getImageByUrl(String url);
}
