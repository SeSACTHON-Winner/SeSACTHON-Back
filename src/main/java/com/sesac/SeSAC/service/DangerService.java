package com.sesac.SeSAC.service;
import com.sesac.SeSAC.model.DangerInfo;
import com.sesac.SeSAC.model.User;
import com.sesac.SeSAC.repository.DangerInfoRepository;
import com.sesac.SeSAC.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class DangerService {

    private final DangerInfoRepository dangerInfoRepository;
    private final UserRepository userRepository;

    @Transactional
    public Long join(DangerInfo dangerInfo){
        dangerInfoRepository.save(dangerInfo);
        return dangerInfo.getId();
    }

    public List<DangerInfo> findAllDanger() {
        return dangerInfoRepository.findAll();
    }

}
