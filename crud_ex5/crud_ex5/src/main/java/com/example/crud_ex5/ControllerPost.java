package com.example.crud_ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController()
public class ControllerPost {

    @Autowired
    PersonInterface personInterface;

    @RequestMapping( value ="/persona", method = POST)
    @ResponseBody

    public Person add(@RequestBody Person person){
        person.setId(person.getId());
        person.setName(person.getName());
        person.setCity(person.getCity());
        person.setAge(person.getAge());
        personInterface.addPersonList(new Person(person.getId(),person.getName(),person.getAge(),person.getCity()));
        return  person;

    }


}
