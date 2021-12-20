package com.example.crud_ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController
public class ControllerDelete {

    @Autowired
    PersonInterface personInterface;

    @RequestMapping (value="/persona{id}", method =DELETE)
    public void deletePersonById (@PathVariable int id){
        Person perId = personInterface.getPersonById(id);

        if(perId != null){
            String name = perId.getName();
            personInterface.getPersonList(perId.getName()).remove(perId);

        }
    }

}
