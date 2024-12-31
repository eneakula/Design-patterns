package com.sda.structural.adapter;

import java.util.List;

public class Pupil {
    private String firstname;
    private String lastname;
    private Integer age;
    private List<Integer> grades;


    public Pupil(String firstname, String lastname, Integer age, List<Integer> grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.grades = grades;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
