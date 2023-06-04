package com.sesac.SeSAC.service;

import com.sesac.SeSAC.dto.RunningForm;
import com.sesac.SeSAC.model.RunningInfo;
import org.springframework.stereotype.Service;

@Service
public class RunningServiceImpl implements RunningService{
    @Override
    public boolean postRunningInfo(RunningForm runningForm) {
        return false;
    }

    @Override
    public RunningInfo getRunningInfo(String uid) {
        return null;
    }
}
