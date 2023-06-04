package com.sesac.SeSAC.controller;

import com.sesac.SeSAC.model.DangerInfo;
import com.sesac.SeSAC.model.User;
import com.sesac.SeSAC.service.DangerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/t.run/my")
@RequiredArgsConstructor
public class MyController {
    final DangerService dangerService;

    @GetMapping(value = "/userInfo")
    public ArrayList<DangerInfo> getDangerInfos(@RequestParam("uid") String uid){
        return dangerService.getDangerInfos(uid);
    }

}
