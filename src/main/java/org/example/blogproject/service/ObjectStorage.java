package org.example.blogproject.service;

import org.springframework.web.multipart.MultipartFile;

public interface ObjectStorage {

    String uploadFile(String bucketName, String directory, MultipartFile file);

}
