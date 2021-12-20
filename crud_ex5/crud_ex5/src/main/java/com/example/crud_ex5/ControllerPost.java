package com.example.crud_ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
public class ControllerPost {

    @Autowired
    Person person;

    @GetMapping( value ="/persona", method = POST)
    public Person add(@RequestBody Person person){
        person.setName(person.getName());
        person.setCity(person.getCity());
        person.setAge(person.getAge());
        person.getPersonList(new getPersonList(person.getName(),person.getCity(),person.getAge()));
        return  person;

    }


}