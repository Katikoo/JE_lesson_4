package com.company;

import java.util.Random;

public class User implements Comparable<User> {

    protected Name name;
    protected Surname surname;
    protected int age;



    public User() {
        Random random = new Random();
        this.name = Name.values()[random.nextInt(Name.values().length)];
        this.surname = Surname.values()[random.nextInt(Surname.values().length)];
        this.age = random.nextInt(20) + 16;
    }

    @Override
    public int compareTo(User user) {
        int result = Integer.compare(surname.value, user.surname.value);
        if (result == 0) {
            result = Integer.compare(name.value, user.name.value);
        }
        if (result == 0) {
            result = Integer.compare(age, user.age);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return age == user.age && name == user.name && surname == user.surname;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "User: {" +
                "surname = " + surname +
                ", name = " + name +
                ", age = " + age +
                "}\n";
    }
}