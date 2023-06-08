package com.sesac.SeSAC.service;


import com.sesac.SeSAC.dto.SignInForm;
import com.sesac.SeSAC.dto.SignUpForm;

public interface AuthService {
    String signIn(SignInForm signInForm);
    String signUp(SignUpForm signUpForm);
}
