package com.example.crud_ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonImplement implements PersonInterface {
    @Autowired
            Person person;

private List<Person> personList = new ArrayList<>();

    @Override
    public List<Person> getPersonList() {
        return personList;
    }


    @Override
    public void addPersonList(Person person) {
        personList.add(person);
    }




    public Person getPersonById(int Id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == Id){
                return personList.get(i);
            }
        }
        return null;
    }

    @Override
    public Person person() {
        return null;
    }

    @Override
    public void setPersonId(int id) {

    }

    @Override
    public void setPersonName(String name) {

    }

    @Override
    public void setPersonAge(int age) {

    }

    @Override
    public void setPersonCity(String city) {

    }

    public List<Person> getPersonByName(String name){
        return personList.stream().filter(person -> person.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }





}
