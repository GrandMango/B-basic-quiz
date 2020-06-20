package com.example.demo.db;

import com.example.demo.model.Education;
import com.example.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EducationBackgroudDB {
    private List<Education> list = new ArrayList<>();

    public EducationBackgroudDB() {
        Education user1Education1 = new Education(1, 2005,"Secondary school specializing in artistic",
                "Eos, explicabo, nam, tenetur et ab eius deserunt aspernatur ipsum ducimus quibusdam quis voluptatibus.");
        Education user1Education2 = new Education(1, 1998,"University of LEEDS",
                "Leeds is a good university.");
        list.add(user1Education1);
        list.add(user1Education2);

        Education user2Education1 = new Education(2, 2013,"University of Manchester",
                "Manchester is a good university.");
        list.add(user2Education1);
    }

    public EducationBackgroudDB(List<Education> list) {
        this.list = list;
    }

    public List<Education> getList() {
        return list;
    }
}
