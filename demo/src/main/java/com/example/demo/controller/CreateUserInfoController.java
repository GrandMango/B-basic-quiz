package com.example.demo.controller;

import com.example.demo.model.Education;
import com.example.demo.model.User;
import com.example.demo.service.CreateUserInfoService;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@CrossOrigin
public class CreateUserInfoController {
    @Autowired
    private CreateUserInfoService createUserInfoService;
    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public Long createUser(@RequestBody @Valid User user) {
        createUserInfoService.createUserAccount(user);
        return user.getUserId();
    }

    @PostMapping("/users/{id}/educations")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEducationBackground(@PathVariable Long id, @RequestBody @Valid Education education) {
        createUserInfoService.createUserEducation( id, education );
        return;
    }
}
