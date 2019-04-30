package com.neo.hello.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class User {
    @NotEmpty(message="Name can not be null!")
    private String name;
    @Max(value=200,message = "Age can not larger than 200")
    @Min(value=18,message="You have to be adult!")
    private int age;
    @NotEmpty(message = "Password can not be null")
    @Length(min = 6,message = "Password can not shorter than 6 characters")
    private String pass;
    public User(){

    }

    public User(String name, int age, String pass) {
        this.name = name;
        this.age = age;
        this.pass = pass;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
