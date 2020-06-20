package com.example.demo.db;

import com.example.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PersonalInfoDB {
    private Map<Long, User> map = new HashMap<>();

    public PersonalInfoDB() {
        User user1 = new User(1,"KAMIL",24,
                "https://inews.gtimg.com/newsapp_match/0/3581582328/0",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi.");
        User user2 = new User(2,"John",38,
                "https://inews.gtimg.com/newsapp_match/0/3581582328/0",
                "John Robert Bolton is an American attorney, political commentator, Republican consultant and former diplomat who served as the 25th United States Ambassador to the United Nations from 2005 to 2006");
        map.put(user1.getUserId(), user1);
        map.put(user2.getUserId(), user2);
    }

    public Map<Long, User> getMap() {
        return map;
    }
}
