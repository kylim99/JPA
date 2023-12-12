package com.example.book_manager.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class UserTest {
    @Test
    @DisplayName("ToString annotation test")
    void Test(){
        Member user = new Member();
        user.setName("kylim99");
        user.setEmail("zxzx05050@naver.com");
        System.out.println(user);
    }
}