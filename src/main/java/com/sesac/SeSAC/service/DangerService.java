package com.sesac.SeSAC.service;

import com.sesac.SeSAC.repository.DangerInfoRepository;
import com.sesac.SeSAC.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class DangerService {

    private final DangerInfoRepository dangerInfoRepository;
    private final UserRepository userRepository;

    // 위험 지역 입력


}
