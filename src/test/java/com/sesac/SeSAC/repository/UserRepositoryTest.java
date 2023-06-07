package com.sesac.SeSAC.repository;

import com.sesac.SeSAC.model.User;
import com.sesac.SeSAC.service.UserService;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
public class UserRepositoryTest {
    @Autowired UserService userService;
    @Autowired UserRepository userRepository;
    @Autowired EntityManager em;

    @Test
    public void func1(){
        User user = new User();
        user.setName("kim");

        //when
        Long savedId = userService.join(user);

        //then
        assertEquals(user, userRepository.findOne(savedId));
    }
}