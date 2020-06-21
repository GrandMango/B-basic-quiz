package com.example.demo.controller;

import com.example.demo.model.Education;
import com.example.demo.model.User;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/users/{id}")
    public User getUserBasicInfo(@PathVariable Long id) {
        return userInfoService.getUser(id);
    }

    @GetMapping("/users/{id}/educations")
    public List<Education> getEducationInfo(@PathVariable Long id) {
        return userInfoService.getEducation(id);
    }

}
