package com.example.crud_ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
public class ControllerPut {

@Autowired
    PersonInterface personInterface;

@RequestMapping(value="/persona/{id}", method = PUT)
    void setPersonWithId (@RequestBody Person person, @PathVariable int id){
    Person perId=personInterface.getPersonById(id);
    if( perId != null){
        if(person.getAge() != 0){
            perId.setAge(person.getAge());
        }
        if (person.getName() != null) {
             perId.setName(person.getName());
        }
        if(person.getCity()!= null){
            perId.setCity(person.getCity());
        }
    }

}


}
