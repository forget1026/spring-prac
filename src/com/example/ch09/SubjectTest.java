package com.example.ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setKorea("국어", 100);
        studentLee.setMath("수학", 50);

        studentLee.showScore();

        Student studentKim = new Student(200, "Kim");
        studentKim.setKorea("국어", 500);
        studentKim.setMath("수학", 100);

        studentKim.showScore();
    }
}
