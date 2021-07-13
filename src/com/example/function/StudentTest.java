package com.example.function;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentID(12345);
        studentLee.setStudentName("Lee");
        studentLee.setAddress("서울 강남구");

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.setStudentID(54321);
        studentKim.setStudentName("Kim");
        studentKim.setAddress("경기도 수원시");

        studentKim.showStudentInfo();
    }
}
