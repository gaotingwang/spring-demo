package com.gtw.mongo.controller;

import com.gtw.mongo.dao.PersonMongoDao;
import com.gtw.mongo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
    private final PersonMongoDao mongoDao;

    @Autowired
    public PersonController(PersonMongoDao mongoDao) {
        this.mongoDao = mongoDao;
    }

    @GetMapping("/persons")
    public void test(){
        Person person = mongoDao.findById("1", Person.class);
        System.out.println(person);
    }
}
