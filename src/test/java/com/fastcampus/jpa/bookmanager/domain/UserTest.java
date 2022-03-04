package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void test(){
        User user = new User();
        user.setEmail("rhrudska987@naver.com");
        user.setName("ko");
        System.out.println(">>>" + user);

        User user1 = User.builder().name("ko1").email("martin@fastcampus.con").build();
        System.out.println(">>>" + user1);
    }
}