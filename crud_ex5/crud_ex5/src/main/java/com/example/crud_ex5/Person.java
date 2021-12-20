package com.example.crud_ex5;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person {
    private int id;
    private String name;
    private int age;
    private String city;


    Person(){

    }
    Person (int id, String name, int age, String city){
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
