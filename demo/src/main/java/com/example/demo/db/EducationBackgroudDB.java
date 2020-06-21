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
        Education user1Education2 = new Education(1, 1990,"I was born in Katowice",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sapiente, exercitationem, toam, dolores iste dolore est aut modi.");
        Education user1Education3 = new Education(1, 2009,"First level graduation in Graphic Design",
                "Aspernatur, mollitia, quos maxime eius suscipit sed beatae ducimus quaerat quibusdam perferendis? Lusto, quibusdam asperiores unde repellat.");
        Education user1Education4 = new Education(1, 2012,"Second level graduation in Graphic Design",
                "Ducimus, aliquam tempore autem itaque et accusantium!");
        list.add(user1Education1);
        list.add(user1Education2);
        list.add(user1Education3);
        list.add(user1Education4);

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
