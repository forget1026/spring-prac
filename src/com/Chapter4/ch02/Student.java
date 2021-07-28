package com.Chapter4.ch02;

import java.util.Objects;

public class Student implements Cloneable{
    private int studentNumber;
    private String studentName;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student std = (Student) o;
            return this.studentNumber == std.studentNumber;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNumber, studentName);
    }
}
