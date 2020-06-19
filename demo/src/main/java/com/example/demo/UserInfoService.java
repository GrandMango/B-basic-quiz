package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class UserInfoService {
    private User user;

    public UserInfoService() {
        this.user = new User("yuecheng");
    }

    public User getUser(int id) {
        return user;
    }
}
