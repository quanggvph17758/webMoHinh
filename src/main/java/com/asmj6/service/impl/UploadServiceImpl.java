package com.asmj6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.asmj6.service.UploadService;

import java.io.File;

import javax.servlet.ServletContext;

@Service
public class UploadServiceImpl implements UploadService {
	
    @Autowired
    ServletContext app;

    public File save(MultipartFile file, String folder){
        File dir = new File(app.getRealPath("/assert/" + folder));
        if (!dir.exists()){
            dir.mkdirs();
        }
        String s = System.currentTimeMillis() + file.getOriginalFilename();
        String name = Integer.toHexString(s.hashCode()) + s.substring(s.lastIndexOf("."));
        try {
            File saveFile = new File(dir, name);
            System.out.println(saveFile.getAbsolutePath());
            return saveFile;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
