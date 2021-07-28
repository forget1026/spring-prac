package com.Chapter3.ch16;

public class BeginnerLevel extends PlayerLevel {
    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("Jump 할 수 없습니다.");
    }

    @Override
    void turn() {
        System.out.println("Trun 할 수 없습니다.");
    }

    @Override
    void showLevelMessage() {
        System.out.println("***** 초급자 레벨입니다. *****");
    }
}
