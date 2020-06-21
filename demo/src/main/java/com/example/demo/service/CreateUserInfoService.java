package com.example.demo.service;

import com.example.demo.db.EducationBackgroudDB;
import com.example.demo.db.PersonalInfoDB;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Education;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class CreateUserInfoService {
    @Autowired
    private PersonalInfoDB personalInfoDB;
    @Autowired
    private EducationBackgroudDB educationBackgroudDB;

    public void createUserAccount(User user) {
        user.setUserId(generateId(user));
        personalInfoDB.getMap().put(user.getUserId(), user);
        for(User value : personalInfoDB.getMap().values()){
            System.out.println(value);
        }
        System.out.println("---------------------------------\n");
    }

    public Long generateId(User user) {
        String seed = user.getName() + user.getAge() + user.getAvatar() + user.getDescription();
        return (long) seed.hashCode() & Integer.MAX_VALUE;
    }

    public void createUserEducation(Long id, Education education) {
        if( personalInfoDB.getMap().containsKey(id) ) {
            educationBackgroudDB.getList().add(education);
            return;
        } else {
            //throw new ResponseStatusException( HttpStatus.BAD_REQUEST, "User Not Found");
            throw new ResourceNotFoundException("User Not Found");
        }
    }
}
