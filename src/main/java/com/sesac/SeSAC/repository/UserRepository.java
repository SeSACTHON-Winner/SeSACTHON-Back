package com.sesac.SeSAC.repository;

import com.sesac.SeSAC.model.User;

public interface UserRepository {
    User getUser(String uid);
    void registerUser(User user);
}
