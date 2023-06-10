package com.sesac.SeSAC.util;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class ImageService {
    public String saveImage(String path, MultipartFile file) throws IOException {
        try{
            UUID uuid = UUID.randomUUID();
            String fileName = file.getOriginalFilename();
            Path filePath = Path.of(path + File.separator + uuid.toString());
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
            return filePath.toString();
        }
        catch (IOException e){
            System.out.println(e.toString());
            return null;
        }
    }
    public void deleteImage(String path)
    {
        try {
            File file = new File("path");
            if(file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }
        }
        catch(Exception e)
        {
            System.out.println("Failed to Delete image !!");
        }
    }

}
