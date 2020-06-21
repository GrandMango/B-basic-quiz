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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class UserInfoService {
    @Autowired
    private PersonalInfoDB personalInfoDB;

    @Autowired
    private EducationBackgroudDB educationBackgroudDB;

    public User getUser(long id) {
//        for(User value : personalInfoDB.getMap().values()){
//            System.out.println(value);
//        }
        if( personalInfoDB.getMap().containsKey(id) == true ) {
            return personalInfoDB.getMap().get(id);
        } else {
            throw new ResourceNotFoundException("User Not Found");
            //throw new ResponseStatusException( HttpStatus.BAD_REQUEST, "User Not Found");
        }
    }

    public List<Education> getEducation(long id) {
        List<Education> returnList = new ArrayList<>();

        for (Education education : educationBackgroudDB.getList()) {
            if( education.getUserId() == id) {
                returnList.add(education);
            }
        }
        return returnList;
    }
}
