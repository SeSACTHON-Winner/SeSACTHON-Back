package com.sesac.SeSAC.service;

import com.sesac.SeSAC.repository.DangerInfoRepository;
import com.sesac.SeSAC.repository.RunningInfoRepository;
import com.sesac.SeSAC.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RunningService {

    private final RunningInfoRepository runningInfoRepository;
    private final UserRepository userRepository;


}
