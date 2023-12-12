package com.example.book_manager.repository;

import com.example.book_manager.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserRepositoryTest {
    @Autowired
    MemberRepository userRepository;

    @Test
    void crud(){
        userRepository.save(new Member());

        System.out.println(userRepository.findAll());
    }
}