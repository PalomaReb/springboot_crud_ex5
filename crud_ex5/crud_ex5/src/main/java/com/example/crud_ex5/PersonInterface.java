package com.example.crud_ex5;

import java.util.List;

public interface PersonInterface {

    List<Person> getPersonList(String name);
    Person getPersonById(int id);

    Person person();
    void setPersonId (int id);
    void setPersonName(String name);
    void setPersonAge (int age);
    void setPersonCity (String city);




}
