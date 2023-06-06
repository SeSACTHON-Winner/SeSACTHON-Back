package com.sesac.SeSAC.service;
import com.sesac.SeSAC.model.RunningInfo;
import com.sesac.SeSAC.model.User;
import com.sesac.SeSAC.repository.DangerInfoRepository;
import com.sesac.SeSAC.repository.RunningInfoRepository;
import com.sesac.SeSAC.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RunningService {

    private final RunningInfoRepository runningInfoRepository;

    @Transactional
    public Long join(RunningInfo runningInfo){
        runningInfoRepository.save(runningInfo);
        return runningInfo.getId();
    }

    public List<RunningInfo> findAllRunning() {
        return runningInfoRepository.findAll();
    }

}
