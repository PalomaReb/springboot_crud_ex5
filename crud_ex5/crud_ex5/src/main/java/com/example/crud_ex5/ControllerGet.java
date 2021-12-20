package com.example.crud_ex5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
public class ControllerGet {

    @Autowired
    PersonInterface personInterface;

    @RequestMapping (value = "/persona/{id}", method = GET)
    public Person getPersonById(@PathVariable int id){
        return personInterface.getPersonById(id);
    }

    @RequestMapping (value="persona/nombre/{name}", method=GET)
    public List<Person>returnPersonByName(@PathVariable String name){
        return personInterface.getPersonList();
    }
}
