package com.sda.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class PupilMain {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new PupilAdapter(new Pupil("John", "Smith", 5, List.of(8, 9, 10))));
        for (Student student : students) {
            System.out.println(student.getFullName());
            System.out.println(student.isAdult());
        }
    }
}
