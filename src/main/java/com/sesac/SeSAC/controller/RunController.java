package com.sesac.SeSAC.controller;

import com.sesac.SeSAC.dto.RunningForm;
import com.sesac.SeSAC.service.DangerService;
import com.sesac.SeSAC.service.RunningService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@RestController
@RequiredArgsConstructor
@RequestMapping("/t.run/run")
public class RunController {
    final RunningService runningService;
    final DangerService dangerService;
    private String uploadPath = "/Users/musung/testPath";
    @PostMapping("/runningInfo")
    public ResponseEntity<String> postRunningInfo(@RequestBody MultipartFile file, @RequestBody RunningForm runningForm){
        try {
            String fileName = file.getOriginalFilename();
            Path filePath = Path.of(uploadPath + File.separator + fileName);
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println(runningForm.getFirst());
            return ResponseEntity.ok("이미지가 성공적으로 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("이미지 저장 중 오류가 발생했습니다.");
        }
    }
}
