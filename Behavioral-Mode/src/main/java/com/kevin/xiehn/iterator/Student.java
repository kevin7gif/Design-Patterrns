package com.kevin.xiehn.iterator;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-24 10:37
 */
public class Student {
    private String name;
    private String number;

    public Student() {
    }
    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
