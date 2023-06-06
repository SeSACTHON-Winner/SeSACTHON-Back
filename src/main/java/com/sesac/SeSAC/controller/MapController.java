package com.sesac.SeSAC.controller;

import com.sesac.SeSAC.model.DangerInfo;
import com.sesac.SeSAC.service.DangerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/t.run/run")
public class MapController {
    final DangerService dangerService;
    @GetMapping("/dangerInfo")
    public List<DangerInfo> getAllDangerInfo(){
        return dangerService.findAllDanger();
    }
}
