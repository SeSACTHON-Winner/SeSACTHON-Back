package com.sesac.SeSAC.controller;

import com.sesac.SeSAC.model.RunningInfo;
import com.sesac.SeSAC.service.DangerService;
import com.sesac.SeSAC.service.RunningService;
import com.sesac.SeSAC.util.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/t.run/run")
public class RunController {
    final RunningService runningService;
    final DangerService dangerService;
    final ImageService imageService;
    private String uploadPath = "/Users/musung/testPath";
    @PostMapping("/saveImage")
    public String saveImage(@RequestBody MultipartFile file) throws IOException {
        try{
            return imageService.saveImage(uploadPath,file);
        }
        catch(IOException e){
            return "fail";
        }
    }
    @PostMapping("/runingInfo")
    public void postRunningInfo(@RequestBody RunningInfo runningInfo){
        runningService.join(runningInfo);
    }
}
