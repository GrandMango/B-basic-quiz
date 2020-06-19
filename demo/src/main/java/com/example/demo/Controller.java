package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/users/{id}")
    public User createAccount(@PathVariable Integer id) {


        return userInfoService.getUser(id);
    }
}
