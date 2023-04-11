package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.dto.ImagesDTO;
import com.bezkoder.springjwt.models.Images;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface IUpload {
    List<Images> storeFile(MultipartFile[] files) throws IOException;
    public byte[] readContentFile(String  fileName);

}
