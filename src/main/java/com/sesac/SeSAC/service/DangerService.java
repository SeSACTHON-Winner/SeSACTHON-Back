package com.sesac.SeSAC.service;

import com.sesac.SeSAC.dto.DangerForm;
import com.sesac.SeSAC.model.DangerInfo;
import java.util.ArrayList;

public interface DangerService {
    boolean postDangerInfo(DangerForm dangerForm);
    ArrayList<DangerInfo> getDangerInfos(String uid);
    ArrayList<DangerInfo> getAllDangerInfos();
}
