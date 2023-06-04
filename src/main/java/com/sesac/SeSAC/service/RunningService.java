package com.sesac.SeSAC.service;

import com.sesac.SeSAC.dto.RunningForm;
import com.sesac.SeSAC.model.RunningInfo;

public interface RunningService {
    boolean postRunningInfo(RunningForm runningForm);
    RunningInfo getRunningInfo(String uid);
}
