package com.sesac.SeSAC.service;

import com.sesac.SeSAC.model.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User getUserInfo(String uid);
}
