package com.mile1.bean;

public class Student {
    String name;
    int marks[];

    public Student() {

    }

    public Student(String name, int[] marks) {
        super();
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }


}
