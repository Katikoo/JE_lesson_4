package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int size = 100;

        List<User> users = new ArrayList<>();
        while (users.size() < size) {
            User user = new User();
            if (!users.contains(user)) {
                users.add(user);
            }
        }
        System.out.println(users);
        Collections.sort(users);
        System.out.println();

        System.out.println(users);
        System.out.println();

        List<Student> students = new ArrayList<>();
        while (students.size() < size) {
            Student student = new Student();
            if (!students.contains(student)) {
                students.add(student);
            }
        }
        System.out.println(students);
        Collections.sort(students);
        System.out.println();

        System.out.println(students);
    }
}