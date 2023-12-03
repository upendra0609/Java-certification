package com.sikku.clone.pack1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("aaa", 101);
        Student s2 = s1.clone();
        System.out.println(s1==s2);
    }
}

@Data
class Student implements Cloneable {
    private String name;
    private int sid;

    public Student(String name, int sid) {
        this.name = name;
        this.sid = sid;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}