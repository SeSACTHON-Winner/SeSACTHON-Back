package com.sesac.SeSAC.service;

import com.sesac.SeSAC.dto.DangerForm;
import com.sesac.SeSAC.model.DangerInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@Service
public class DangerServiceImpl implements DangerService{
    @Override
    public boolean postDangerInfo(DangerForm dangerForm) {
        return false;
    }

    @Override
    public ArrayList<DangerInfo> getDangerInfos(String uid) {
        return null;
    }

    @Override
    public ArrayList<DangerInfo> getAllDangerInfos() {
        return null;
    }
}
