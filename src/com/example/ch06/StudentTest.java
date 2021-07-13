package com.example.ch06;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        // Member 변수의 경우 자동으로 초기화 됨.
        System.out.println(studentLee.showStudentInfo());
    }
}
