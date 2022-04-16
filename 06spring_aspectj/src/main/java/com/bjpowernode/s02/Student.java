package com.bjpowernode.s02;

/**
 * @author may
 * @date 2022/4/14 16:20
 */
public class Student {
    private String name ;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
